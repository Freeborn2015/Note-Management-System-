package com.freeborn.note.data.dtos.request;

import lombok.Data;

@Data
public class LonginRequest {
    private String email;
    private String password;
}
