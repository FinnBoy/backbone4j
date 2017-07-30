package com.awaken.web.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
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

    private static final Logger LOG = LoggerFactory.getLogger(PriorController.class);

    @RequestMapping("/c/{action}/{category}/{group}/{page}")
    public String insert(@PathVariable("action") String action, @PathVariable("category") String category,
                         @PathVariable("group") String group, @PathVariable("page") String page, Model model) {

        LOG.info("~~~~~~~ insert ~~~~~~~");
        return "";
    }

    @RequestMapping("/r/{action}/{category}/{group}/{page}")
    public String search(@PathVariable("action") String action, @PathVariable("category") String category,
                          @PathVariable("group") String group, @PathVariable("page") String page, Model model) {

        LOG.info("~~~~~~~ search ~~~~~~~");
        return "";
    }

    @RequestMapping("/u/{action}/{category}/{group}/{page}")
    public String update(@PathVariable("action") String action, @PathVariable("category") String category,
                          @PathVariable("group") String group, @PathVariable("page") String page, Model model) {

        LOG.info("~~~~~~~ update ~~~~~~~");
        return "";
    }

    @RequestMapping("/d/{action}/{category}/{group}/{page}")
    public String delete(@PathVariable("action") String action, @PathVariable("category") String category,
                          @PathVariable("group") String group, @PathVariable("page") String page, Model model) {

        LOG.info("~~~~~~~ delete ~~~~~~~");
        return "";
    }

    @RequestMapping("/e/{action}/{category}/{group}/{page}")
    public String execute(@PathVariable("action") String action, @PathVariable("category") String category,
                          @PathVariable("group") String group, @PathVariable("page") String page, Model model) {

        LOG.info("~~~~~~~ execute ~~~~~~~");
        return "";
    }

    @RequestMapping("upload/{category}/{group}/{page}")
    public String upload(@PathVariable("category") String category,
                         @PathVariable("group") String group, @PathVariable("page") String page, @RequestParam
                                 ("file") MultipartFile file) {

        LOG.info("~~~~~~~ upload ~~~~~~~");
        return "";
    }
}

