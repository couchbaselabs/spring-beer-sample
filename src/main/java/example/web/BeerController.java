package example.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;
import example.service.BeerService;

@Controller
public class BeerController {

    @Autowired
    private BeerService beerService;

    @RequestMapping("/beer")
    @ResponseBody
    public ModelAndView index() {
        return new ModelAndView("beer/index", "beers", beerService.allBeers());
    }
}
