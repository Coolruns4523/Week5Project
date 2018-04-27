package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.validation.Valid;
import java.util.HashSet;
import java.util.Set;

@Controller
public class HomeController {
    @Autowired
    ResumeRepository resumeRepository;
/*    ProfileRepository profileRepository;

    @RequestMapping("/resume")
    public String index(Model model)
    {
        Profile profile = new Profile();
        profile.setfName("Brandon");
        profile.setlName("Wilson");

        History history = new History();
        history.seteAddress("donkyKong@gmail.com");
        history.setPhone("2029384499");
        history.setExperience("Professional Game for over 30year");
        history.seteAchievements("GED");
        history.setAbility("gamer");

        Set<History>histories= new HashSet<History>();
        histories.add(history);

        history = new History();
        history.setExperience("Professional Game for over 30year");
        history.seteAchievements("GED");
        history.setAbility("gamer");
        histories.add(history);

        profile.setHistories(histories);

        profileRepository.save(profile);
        model.addAttribute("profiles", profileRepository.findAll());
        return "index";
    }*/

    @RequestMapping("/")
    public String listResumes(Model model)
    {
        model.addAttribute("resumes",resumeRepository.findAll());
        return  "list";
    }

    @GetMapping("/add")
    public String petForm(Model model)
    {
        model.addAttribute("aResume", new Resume());
        return "resumeForm";
    }


    @PostMapping("/saveresume")
    public String saveResume(@Valid Resume resume, BindingResult result)
    {
        if (result.hasErrors())
        {
            return "resumeForm";
        }
        resumeRepository.save(resume);
        return "redirect:/list";
    }
    @RequestMapping("/detail/{id}")
    public String showResume (@PathVariable("id") long id, Model model)
    {
        /* bookRepository.findById(id).get()*/
        model.addAttribute("aResume", resumeRepository.findResumeById(id));
        return "show";
    }
    @RequestMapping("/update/{id}")
    public String updateResume (@PathVariable("id") long id, Model model)
    {
        model.addAttribute("aResume", resumeRepository.findResumeById(id));
        return "resumeForm";
    }


    @RequestMapping("/delete/{id}")
    public String delResume(@PathVariable("id") long id, Model model)
    {
        resumeRepository.deleteById(id);
        return "redirect:/";
    }
}
