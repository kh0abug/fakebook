package com.khoabug.fakebook.controller;


import com.khoabug.fakebook.model.User;
import com.khoabug.fakebook.service.impl.UserService;
import com.khoabug.fakebook.sort.Sorter;
import com.khoabug.fakebook.utils.FormUtil;
import jakarta.inject.Inject;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

@WebServlet(name = "LoginController", value = "/login")
public class LoginController extends HttpServlet {

    @Inject
    private UserService userService;

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.getRequestDispatcher("/index.jsp").forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        User inputUser = FormUtil.toModel(User.class, request);

        Map<String, String> messages = new HashMap<>();

        if (inputUser.getUserName() == null || inputUser.getUserName().isEmpty()) {
            messages.put("username", "Please enter username");
        }
        if (inputUser.getPassword() == null || inputUser.getPassword().isEmpty()) {
            messages.put("password", "Please enter password");
        }
        if (messages.isEmpty()) {
            User user = userService.isValid(inputUser.getEmail(), inputUser.getPassword());
            if (user != null) {
                request.getSession().setAttribute("user", user);
                response.sendRedirect(request.getContextPath() + "/home");
                return;
            } else {
                messages.put("login", "Unknown login, please try again");
            }
        }
        request.setAttribute("messages", messages);
        request.getRequestDispatcher("/index.jsp").forward(request, response);

    }

}
