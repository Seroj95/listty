package com.example.listty.controller;

import com.example.listty.model.User;
import com.example.listty.reposidory.UserRepository;
import com.example.listty.security.CurrentUser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import javax.jws.soap.SOAPBinding;

@Controller
public class MainController {
//        @Autowired
//    private SubjectReposidory subjectReposidory;
//    @Autowired
//private CategoryRepository categoryRepository;
//    @Autowired
//    private UserRepository userRepository;

   @Autowired
    private UserRepository userRepository;

//    @Autowired
//    private PasswordEncoder passwordEncoder;

    @GetMapping("/404")
    public String Page(ModelMap map, @AuthenticationPrincipal UserDetails userDetails) {

//        map.addAttribute("isLogedIn", userDetails != null);
        return "404-page";
    }

//    @GetMapping("/all-busines")
//    public String AllBusines(ModelMap map, @AuthenticationPrincipal UserDetails userDetails) {
//
//        map.addAttribute("islogedIn", userDetails != null);
//        return "all-busines";
//
//    }
//
//    @GetMapping("/blog")
//    public String Blog(ModelMap map, @AuthenticationPrincipal UserDetails userDetails) {
//
//        map.addAttribute("islogedIn", userDetails != null);
//        return "blog";
//
//
//    }
//
//    @GetMapping("/blog-detalis")
//    public String Blogdetals(ModelMap map, @AuthenticationPrincipal UserDetails userDetails) {
//
//        map.addAttribute("islogedIn", userDetails != null);
//        return "blog-details";
//    }
//
//    @GetMapping("/booking-list")
//    public String Booking(ModelMap map, @AuthenticationPrincipal UserDetails userDetails) {
//
//        map.addAttribute("islogedIn", userDetails != null);
//        return "booking-list";
//
//    }
//
//    @GetMapping("/category-gird")
//    public String Category_gird(ModelMap map, @AuthenticationPrincipal UserDetails userDetails) {
//
//        map.addAttribute("islogedIn", userDetails != null);
//        return "category-gird";
//    }
//
//    @GetMapping("/category-grid-full")
//    public String Categorygird(ModelMap map, @AuthenticationPrincipal UserDetails userDetails) {
//
//        map.addAttribute("islogedIn", userDetails != null);
//        return "category-grid-full";
//    }
//
//    @GetMapping("/category-grid-right")
//    public String CategoryGird(ModelMap map, @AuthenticationPrincipal UserDetails userDetails) {
//
//        map.addAttribute("islogedIn", userDetails != null);
//        return "category-grid-right";
//    }
//
//    @GetMapping("/category-list-full")
//    public String CategoryList(ModelMap map, @AuthenticationPrincipal UserDetails userDetails) {
//
//        map.addAttribute("islogedIn", userDetails != null);
//        return "category-list-full";
//    }
//
//    @GetMapping("/category-list-left")
//    public String CategoryListLeft(ModelMap map, @AuthenticationPrincipal UserDetails userDetails) {
//
//        map.addAttribute("islogedIn", userDetails != null);
//        return "category-list-left";
//    }
//
//    @GetMapping("/category-list-right")
//    public String CategoryListReght(ModelMap map, @AuthenticationPrincipal UserDetails userDetails) {
//
//        map.addAttribute("islogedIn", userDetails != null);
//        return "category-list-right";
//    }
//
//    @GetMapping("/commig-soon")
//    public String CommingSoon(ModelMap map, @AuthenticationPrincipal UserDetails userDetails) {
//
//        map.addAttribute("islogedIn", userDetails != null);
//        return "comming-soon";
//    }
//
//    @GetMapping("/contact-us")
//    public String Contact(ModelMap map, @AuthenticationPrincipal UserDetails userDetails) {
//
//        map.addAttribute("islogedIn", userDetails != null);
//        return "contact-us";
//    }
//
//    @GetMapping("/dashboard")
//    public String Dashoard(ModelMap map, @AuthenticationPrincipal UserDetails userDetails) {
//
//        map.addAttribute("islogedIn", userDetails != null);
//        return "dashboard";
//    }
//
//    @GetMapping("/dashboard-reviews")
//    public String DashoardReviews(ModelMap map, @AuthenticationPrincipal UserDetails userDetails) {
//
//        map.addAttribute("islogedIn", userDetails != null);
//        return "dashboard-reviews";
//    }
//
//    @GetMapping("/edit-listings")
//    public String EditListings(ModelMap map, @AuthenticationPrincipal UserDetails userDetails) {
//
//        map.addAttribute("islogedIn", userDetails != null);
//        return "edit-listings";
//    }
//
//    @GetMapping("/how-it-works")
//    public String Howitworks(ModelMap map, @AuthenticationPrincipal UserDetails userDetails) {
//
//        map.addAttribute("islogedIn", userDetails != null);
//        return "how-it-works";
//    }

    @GetMapping("/")
    public String index() {

//        map.addAttribute("islogedIn", userDetails != null);
        return "index";
    }

    @GetMapping("/index-2")
    public String index2(ModelMap map, @AuthenticationPrincipal UserDetails userDetails) {

        map.addAttribute("islogedIn", userDetails != null);
        return "index-2";
    }
//
//    @GetMapping("/index-3")
//    public String Indes3(ModelMap map, @AuthenticationPrincipal UserDetails userDetails) {
//
//        map.addAttribute("islogedIn", userDetails != null);
//        return "index-3";
//    }
//
//    @GetMapping("/index-4")
//    public String Indes4(ModelMap map, @AuthenticationPrincipal UserDetails userDetails) {
//
//        map.addAttribute("islogedIn", userDetails != null);
//        return "index-4";
//    }
//
//    @GetMapping("/listing-details-full")
//    public String Listingdetailsfull(ModelMap map, @AuthenticationPrincipal UserDetails userDetails) {
//
//        map.addAttribute("islogedIn", userDetails != null);
//        return "listing-details-full";
//    }
//
//    @GetMapping("/listing-details-left")
//    public String Listingdetailsleft(ModelMap map, @AuthenticationPrincipal UserDetails userDetails) {
//
//        map.addAttribute("islogedIn", userDetails != null);
//        return "listing-details-left";
//
//
//    }
//
//    @GetMapping("/listing-details-right")
//    public String Listingdetailsright(ModelMap map, @AuthenticationPrincipal UserDetails userDetails) {
//
//        map.addAttribute("islogedIn", userDetails != null);
//        return "listing-details-right";
//    }
//
//    @GetMapping("/listing-sidebar-map-full")
//    public String ListingSidebarMap(ModelMap map, @AuthenticationPrincipal UserDetails userDetails) {
//
//        map.addAttribute("islogedIn", userDetails != null);
//        return "listing-sidebar-map-full";
//    }
//
//    @GetMapping("/listing-sidebar-map-left")
//    public String ListingSidebarLeft(ModelMap map, @AuthenticationPrincipal UserDetails userDetails) {
//
//        map.addAttribute("islogedIn", userDetails != null);
//        return "listing-sidebar-map-left";
//    }
//
//    @GetMapping("/listing-sidebar-map-right")
//    public String ListingSidebarRight(ModelMap map, @AuthenticationPrincipal UserDetails userDetails) {
//
//        map.addAttribute("islogedIn", userDetails != null);
//        return "listing-sidebar-map-right";
//
//    }
//
//    @GetMapping("/listings")
//    public String Listings(ModelMap map, @AuthenticationPrincipal UserDetails userDetails) {
//
//        map.addAttribute("islogedIn", userDetails != null);
//        return "listings";
//    }
//
//    @GetMapping("/login")
//    public String Login(ModelMap map, @AuthenticationPrincipal UserDetails userDetails) {
//
//        map.addAttribute("islogedIn", userDetails != null);
//        return "login";
//    }
//
//    @GetMapping("/oders")
//    public String Oders(ModelMap map, @AuthenticationPrincipal UserDetails userDetails) {
//
//        map.addAttribute("islogedIn", userDetails != null);
//        return "oders";
//    }
//
//    @GetMapping("/payment-process")
//    public String Payment(ModelMap map, @AuthenticationPrincipal UserDetails userDetails) {
//
//        map.addAttribute("islogedIn", userDetails != null);
//        return "payment-process";
//    }
//
//    @GetMapping("/pricing-table")
//    public String Pricing(ModelMap map, @AuthenticationPrincipal UserDetails userDetails) {
//
//        map.addAttribute("islogedIn", userDetails != null);
//        return "pricing-table";
//    }
//
//    @GetMapping("/profile")
//    public String Profile(ModelMap map, @AuthenticationPrincipal UserDetails userDetails) {
//
//        map.addAttribute("islogedIn", userDetails != null);
//        return "profile";
//    }
//
//    @GetMapping("/sign-up")
//    public String Sign(ModelMap map, @AuthenticationPrincipal UserDetails userDetails) {
//
//        map.addAttribute("islogedIn", userDetails != null);
//        return "sign-up";
//    }
//
//    @GetMapping("/terms-of-services")
//    public String Terms(ModelMap map, @AuthenticationPrincipal UserDetails userDetails) {
//
//        map.addAttribute("islogedIn", userDetails != null);
//        return "terms-of-services";
//    }
//
//    @GetMapping("/user-profile")
//    public String User() {
//
//
//        return "user-profile";
//    }
//
//    @PostMapping("/addUser")
//    private String addUser(@ModelAttribute("user") User user){
//        user.setPassword(passwordEncoder.encode(user.getPassword()));
//        userRepository.save(user);
//        return "redirect:/sign-up";
//    }
}