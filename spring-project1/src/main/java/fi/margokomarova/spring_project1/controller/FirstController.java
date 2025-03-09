package fi.margokomarova.spring_project1.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FirstController {

    //@GetMapping("/hello")
    //public String hello(@RequestParam(value="name", defaultValue = "World")String name){
        //return String.format("Hello %s!", name);
    //}


    @GetMapping("/getDay")
    public String getDay(@RequestParam(value="dayOfWeek", defaultValue = "unknown")String dayOfWeek){
        String finalDay;

        switch (dayOfWeek){
            case "MONDAY":
                finalDay= String.format("сегодня %s!", "понедельник");
                break;
            case "TUESDAY":
                finalDay= String.format("сегодня %s!", "вторник");
                break;
            case "WEDNESDAY":
                finalDay= String.format("сегодня %s!", "среда");
                break;
            case "THURSDAY":
                finalDay=String.format("сегодня %s!", "четверг");
                break;
            case "FRIDAY":
                finalDay= String.format("сегодня %s!", "пятница");
                break;
            case "SATURDAY":
                finalDay= String.format("сегодня %s!", "суббота");
                break;
            case "SUNDAY":
                finalDay= String.format("сегодня %s!", "воскресенье");
                break;
            default:
                throw new RuntimeException();
        }
        return finalDay;
    }

}
