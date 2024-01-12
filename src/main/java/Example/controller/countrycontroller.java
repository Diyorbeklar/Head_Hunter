package Example.controller;

import Example.model.Country;
import Example.service.countryservice;
import Example.service.countryserviceimpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class countrycontroller {
    @Autowired
    private countryserviceimpl countryserviceimpl;
    @RequestMapping(value = "country",method = RequestMethod.GET)
    public ModelAndView CountrySelectALl(){
        ModelAndView mv = new ModelAndView();
        mv.setViewName("country");
        mv.addObject("countries",countryserviceimpl.getMaxsulotList());
        return mv;
    }

    @RequestMapping("countryadd")
    public ModelAndView countryadding(){
        ModelAndView mv = new ModelAndView();
        mv.setViewName("countryadd");
        return mv;
    }

    @RequestMapping("countryadded")
    public ModelAndView countryadded(@RequestParam("countryname") String countryName){
        ModelAndView mv = new ModelAndView();
        Country country = new Country();
        country.setName(countryName);
        countryserviceimpl.createCountry(country);
        mv.setViewName("countryadd");
        mv.addObject("success","Successful completed");
        return mv;
    }


    @RequestMapping(value = "countryview/{id}",method = RequestMethod.GET)
    public ModelAndView countryView(@PathVariable("id") Integer id){
        System.out.println("diyor");
        ModelAndView mv = new ModelAndView();
        mv.setViewName("countryview");
        mv.addObject("countries",countryserviceimpl.getCountryById(id));
        return mv;
    }
    @RequestMapping(value = "countryupdate/{id}",method = RequestMethod.GET)
    public ModelAndView countryUpdate(@PathVariable("id") Integer id){
        ModelAndView mv = new ModelAndView();
        mv.setViewName("countryupdate");
        mv.addObject("countryup",countryserviceimpl.getCountryById(id));
        return mv;
    }
    @RequestMapping(value = "{name}/countryupdated/{id}")
    public ModelAndView countryUP(@PathVariable("id") Integer id,@PathVariable("name") String names,@RequestParam("countryname") String name){
        ModelAndView mv =new ModelAndView();
        mv.setViewName("countryupdate");
        mv.addObject("countryup",countryserviceimpl.getCountryById(id));
        Country country = new Country();
        country.setName(name);
        country.setId(id);
        mv.addObject("success","Succesfully Updated");
        countryserviceimpl.updateCountry(id,country);
        return mv;
    }
    @RequestMapping(value = "countrydelete/{id}")
    public ModelAndView countryDelete(@PathVariable("id") Integer id){
        ModelAndView mv = new ModelAndView();
        mv.setViewName("countrydelete");
        mv.addObject("countryDele",countryserviceimpl.getCountryById(id));
        return mv;
    }
    @RequestMapping(value = "deletebutton/{id}")
    public ModelAndView deletebutton(@PathVariable("id") Integer id){
        ModelAndView mv = new ModelAndView();
        countryserviceimpl.deleteCountry(id);
        mv.setViewName("country");
        mv.addObject("countries",countryserviceimpl.getMaxsulotList());
        return mv;
    }

}
