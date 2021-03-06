package net.feyin.app.demo.controller;

import org.springframework.web.bind.annotation.ModelAttribute;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class BaseController {

    HttpServletRequest request;
    HttpServletResponse response;
    HttpSession session;

    public static final String FEYIN_ACCOUNT = "feyin-account-id";

    @ModelAttribute
    public void setReqAndRes(HttpServletRequest request, HttpServletResponse response) {
        this.request = request;
        this.response = response;
        this.session = request.getSession();
    }

    public String getFeyinAccount() {
        Object object = session.getAttribute(FEYIN_ACCOUNT);
        if (object == null) return null;
        return (String) object;
    }

}
