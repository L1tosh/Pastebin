package org.example.pastebin.dto;

import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;
import jakarta.validation.constraints.FutureOrPresent;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.Data;
import org.example.pastebin.model.Person;

import java.time.LocalDateTime;

@Data
public class PostDTO {

    @NotNull(message = "can't be empty")
    @Size(min = 3, message = "size should be more then 3 chars")
    private String title;

    @NotNull(message = "can't be empty")
    private String text;

    private String hash;

    @FutureOrPresent(message = "should be more then now")
    @NotNull(message = "can't be empty")
    @Temporal(value = TemporalType.DATE)
    private LocalDateTime timeToDelete;

    private Person owner;
}
