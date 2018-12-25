$(document).ready(function($) {
    "use strict";

    $("a.function-link").click(function () {
        var href = $(this).data("href");
        loadModulePage(href);
    });

    function loadModulePage(href) {
        openLoadForm();
        $.ajax({
            type: "GET",
            contentType: "application/json; charset=utf-8",
            url: "./"+href,
            success: function (response) {
                console.log(response);
                mainContainerUpdate(response);
            },
            error: function (error) {

            }
        });
    }

    function mainContainerUpdate(container) {
        $("#main-content").html(container);
        var timeout=setTimeout(function () {
            $("#dashboard-wrapper").waitMe("hide");
        }, 1500);
    }

    function openLoadForm() {
        $("#dashboard-wrapper").waitMe();
    }

    function closeLoadForm() {

    }
});