package example.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;
import example.service.BreweryService;

@Controller
public class BreweryController {

    @Autowired
    private BreweryService breweryService;

    @RequestMapping("/brewery/{id}")
    @ResponseBody
    public ModelAndView read(@PathVariable String id) {
        return new ModelAndView("brewery/read", "brewery", breweryService.find(id));
    }
}
