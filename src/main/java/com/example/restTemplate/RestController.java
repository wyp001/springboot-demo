package com.example.restTemplate;

import net.sf.json.JSONObject;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Map;

@Controller
@RequestMapping("/rest")
public class RestController {

    @ResponseBody
    @RequestMapping(value = "object",method = RequestMethod.POST)
    public String postByObject(@RequestBody RequestObject beanRequest){
        if (beanRequest ==null){
            return "FALL";
        }
        return "SUCCESS:"+beanRequest.toString();
    }

    @ResponseBody
    @RequestMapping(value = "map",method = RequestMethod.POST)
    public String postByObject(@RequestBody Map<String,Object> map){
        if (map == null || map.isEmpty()){
            return "FALL";
        }
        return "SUCCESS:"+map.toString();
    }

    @ResponseBody
    @RequestMapping(value = "json",method = RequestMethod.POST)
    public String postByObject(@RequestBody JSONObject jsonpRes){
        if (jsonpRes == null ){
            return "FALL";
        }
        return "SUCCESS:"+jsonpRes.toString();
    }


}
