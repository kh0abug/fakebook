package com.khoabug.fakebook.controller;

import jakarta.servlet.*;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;

import java.io.IOException;

@WebServlet(name = "RegistrationController", value = "/signup")
public class RegistrationController extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        String gender = request.getParameter("gender");
        String signEmail = request.getParameter("sign-email");
        String signPass = request.getParameter("sign-password");
        String firstName = request.getParameter("firstname");
        String lastName = request.getParameter("lastname");


    }
}
