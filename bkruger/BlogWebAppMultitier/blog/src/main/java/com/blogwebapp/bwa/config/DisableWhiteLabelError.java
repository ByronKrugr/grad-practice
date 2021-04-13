package com.blogwebapp.bwa.config;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.web.servlet.error.ErrorMvcAutoConfiguration;

@EnableAutoConfiguration(exclude = ErrorMvcAutoConfiguration.class)
public class DisableWhiteLabelError { }