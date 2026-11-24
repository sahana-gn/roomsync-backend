package com.roomsync.system.controller;

import com.roomsync.system.dto.StatusResponse;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/status")
public class StatusController {

    @GetMapping
    public StatusResponse getStatus() {
        return new StatusResponse("roomsync-backend", "UP");
    }
}