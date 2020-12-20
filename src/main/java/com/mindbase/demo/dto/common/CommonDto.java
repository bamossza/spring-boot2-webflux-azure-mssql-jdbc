package com.mindbase.demo.dto.common;

import lombok.Getter;
import lombok.Setter;

import java.time.OffsetDateTime;

@Getter
@Setter
public abstract class CommonDto {
    private OffsetDateTime createdDate;
    private String createdBy;
    private OffsetDateTime updatedDate;
    private String updatedBy;
}
