package com.awaken.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

/**
 * Normal style.
 */
@Controller
public class PriorController {

    @RequestMapping("/{action}/{category}/{group}/{page}")
    public String execute(@PathVariable("action") String action, @PathVariable("category") String category,
                          @PathVariable("group") String group, @PathVariable("page") String page, Model model) {

        return "";
    }

    @RequestMapping("/upload/{category}/{group}/{page}")
    public String upload(@PathVariable("category") String category,
                         @PathVariable("group") String group, @PathVariable("page") String page, @RequestParam
                                 ("file") MultipartFile file) {
        return "";
    }
}

