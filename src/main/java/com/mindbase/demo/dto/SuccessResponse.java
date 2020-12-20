package com.mindbase.demo.dto;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

import java.time.OffsetDateTime;

/**
 * @author panusitt.khuenkham
 * Created Date: Dec 3, 2019
 */
@Getter
@Setter
@JsonInclude(JsonInclude.Include.NON_NULL)
@Builder(builderMethodName = "hiddenBuilder")
public class SuccessResponse<T> {

    //    private static final DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
    private T data;
    protected int code;
    protected Integer status;
    protected String message;
    protected OffsetDateTime timestamp;

    public static <T> SuccessResponseBuilder builder(T data) {
        return hiddenBuilder()
                .code(200)
                .data(data)
                .timestamp(OffsetDateTime.now());
    }
}
