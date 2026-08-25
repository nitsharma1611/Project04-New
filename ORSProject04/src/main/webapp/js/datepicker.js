$(document).ready(function() {

    // =========================
    // DOB - EXISTING CODE
    // =========================

    var currentYear = new Date().getFullYear();

    var maxYear = currentYear - 18;

    $("#udate").datepicker({

        dateFormat: 'mm/dd/yy',

        changeMonth: true,

        changeYear: true,

        yearRange: '1970:' + maxYear,

        minDate: new Date(1970, 0, 1),

        maxDate: new Date(maxYear, 11, 31)

    });

    $("#dobCalendarBtn").click(function(e) {

        e.preventDefault();

        $("#udate").datepicker("show");

    });

});


// ==================================================
// COMMON DATEPICKER
// Joining Date, Admission Date, Registration Date
// etc.
// ==================================================

function showCommonDatePicker(inputId) {

    var field = $("#" + inputId);

    // Agar datepicker pehle initialize nahi hua hai
    if (!field.hasClass("hasDatepicker")) {

        field.datepicker({

            dateFormat: 'mm/dd/yy',

            changeMonth: true,

            changeYear: true

        });

    }

    // Calendar open karo
    field.datepicker("show");
}