package com.doctor.appointment.model.DTO;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class AppointmentCreateDTO {
    private int doctorId;
    private int patientId;
    private LocalDateTime appointmentTime;
    private String reason;
}
