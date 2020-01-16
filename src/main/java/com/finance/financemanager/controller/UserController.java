package com.finance.financemanager.controller;

import com.finance.financemanager.common.BaseController;
import com.finance.financemanager.entity.User;
import com.finance.financemanager.service.UserService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/user")
public class UserController extends BaseController<UserService, User> {

}
