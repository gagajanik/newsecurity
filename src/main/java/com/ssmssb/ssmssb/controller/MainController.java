package com.ssmssb.ssmssb.controller;


import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
    @RequestMapping("/")
    public class MainController {
        @RequestMapping("/")
        public String getMainPage(){
            return "dist/index.html";
        }
        @RequestMapping("/inline.bundle.js")
        public String getInlineBundle(){
            return "dist/inline.bundle.js";
        }
        @RequestMapping("/polyfills.bundle.js")
        public String getPolyfillsBundle(){
            return "dist/polyfills.bundle.js";
        }
        @RequestMapping("/styles.bundle.js")
        public String getStylesBundle(){
            return "dist/styles.bundle.js";
        }
        @RequestMapping("/scripts.bundle.js")
        public String getScriptsBundle(){
            return "dist/scripts.bundle.js";
        }
        @RequestMapping("/vendor.bundle.js")
        public String getVendorBundle(){
            return "dist/vendor.bundle.js";
        }
        @RequestMapping("/main.bundle.js")
        public String getMainBundle(){
            return "dist/main.bundle.js";
        }
}
