package dictionary.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import java.util.HashMap;
import java.util.Map;

@Controller
public class DictionaryController {
    @GetMapping("/dictionary")
    public ModelAndView dictionary(){
        ModelAndView modelAndView = new ModelAndView("dictionary");
        return modelAndView;
    }

    @PostMapping("/dictionary")
    public ModelAndView dictionary(@RequestParam String word){
        String result = getTranslate(word);
        ModelAndView modelAndView = new ModelAndView("dictionary","result",result);
        return modelAndView;
    }

    public String getTranslate(String word){
        Map<String, String> dictionary = new HashMap<>();

        dictionary.put("hello", "Xin chào");
        dictionary.put("how", "Thế nào");
        dictionary.put("book", "Quyển vở");
        dictionary.put("computer", "Máy tính");
        dictionary.put("hello", "Xin chào");
        dictionary.put("how", "Thế nào");
        dictionary.put("book", "Quyển vở");
        dictionary.put("computer", "Máy tính");

        String result = dictionary.get(word);
        if (result!=null){
            return "Result: "+result;
        }else {
            return "Not found";
        }
    }
}


