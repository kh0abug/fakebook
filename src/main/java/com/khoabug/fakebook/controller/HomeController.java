package com.khoabug.fakebook.controller; /**
 * @author : DangKhoa
 * @since : 3/11/2023, Sat
 **/

import com.khoabug.fakebook.model.User;
import com.khoabug.fakebook.paging.PageRequest;
import com.khoabug.fakebook.service.impl.UserService;
import com.khoabug.fakebook.sort.Sorter;
import com.khoabug.fakebook.utils.FormUtil;
import jakarta.inject.Inject;
import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.util.List;

@WebServlet(name = "HomeController", urlPatterns = {"/home"})
public class HomeController extends HttpServlet {

    @Inject
    private UserService userService;

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        Sorter sorter = FormUtil.toModel(Sorter.class, request);
        PageRequest pageRequest = FormUtil.toModel(PageRequest.class, request);
        pageRequest.setTotalItem(userService.getTotalUser());
        pageRequest.setTotalPage();
        pageRequest.setSorter(sorter);

        List<User> userList = userService.findAll(pageRequest);
        request.setAttribute("model", userList);
        request.setAttribute("pageI", pageRequest);
        RequestDispatcher dispatcher = request.getRequestDispatcher("/WEB-INF/jsp/home.jsp");
        dispatcher.forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String action = request.getParameter("action");
    }
}
