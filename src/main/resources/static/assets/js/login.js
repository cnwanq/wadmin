$(document).ready(function($){
    "use strict";
    let loginBtn = $("#loginBtn");
    let userTF = $("#userTF");
    let pwdTF = $("#pwdTF");
    loginBtn.click(function() {
        let userEmail = userTF.val();
        let password = pwdTF.val();
        userTF.attr("disabled","disabled");
        pwdTF.attr("disabled","disabled");
        loginBtn.addClass("is-loading");
        doLogin(userEmail, password);
    });

    let resetBtn = $("#resetBtn");
    resetBtn.click(function() {
        let findEmailTF = $("#findEmailTF");
        findEmailTF.attr("disabled","disabled");
        resetBtn.addClass("is-loading");
    });

    function doLogin(email, pwd) {
        let url = "http://localhost:8080/login";
        let data = {"email": email, "password": pwd};
        $.ajax({
            type: "POST",
            contentType: "application/json; charset=utf-8",
            dataType: "json",
            url: url,
            data: JSON.stringify(data),
            success: function (response) {
                // console.log(response);
                if (response.success) {
                    showErrorTip(false);
                    window.location.href='./index.html';
                } else {
                    showErrorTip(true);
                    resetLogin();
                }
            },
            error: function (error) {
                showErrorTip(true);
                resetLogin();
            }
        });
    }

    function resetLogin() {
        loginBtn.removeClass("is-loading");
        userTF.removeAttr("disabled");
        pwdTF.removeAttr("disabled");
    }

    function showErrorTip(isShow) {
        let errorTip = $("#errorTip");
        if (isShow) {
            errorTip.removeClass("is-hidden");
        } else {
            errorTip.addClass("is-hidden");
        }
    }
});