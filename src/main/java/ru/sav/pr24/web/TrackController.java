package ru.sav.pr24.web;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import ru.sav.pr24.repository.TrackRepository;

@Controller
@RequestMapping("/track")
public class TrackController {
    private static Logger logger = LoggerFactory.getLogger(TrackController.class);

    @Autowired
    TrackRepository trackRepository;

    @RequestMapping("/hello")
    @ResponseBody
    public String hello() {
        return "Hell o";
    }

    @RequestMapping("/list")
    public String list(Model model) {
        model.addAttribute("tracks", trackRepository.findAll());

        return "track/list";
    }
}
