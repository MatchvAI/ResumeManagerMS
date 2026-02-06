package com.resumeManagerMS.dtos;

import java.util.Date;

public record StandarResponseStructure (
    String responseCode,
    String responseMessage,
    String errorCode,
    String errorDescription,
    Date responseTime,
    Object responseDate
){}