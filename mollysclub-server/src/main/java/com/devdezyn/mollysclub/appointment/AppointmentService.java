package com.devdezyn.mollysclub.appointment;

import java.util.List;

public interface AppointmentService {
  List<AppointmentDto> findAll();
  AppointmentDto findById(Long id);
  AppointmentDto create(AppointmentDto appointmentDto);

  AppointmentDto updateByCreator(Long creatorId, Long appointmentId, AppointmentDto addressDTO);
  AppointmentDto cancel(Long creatorId, Long appointmentId);
}
