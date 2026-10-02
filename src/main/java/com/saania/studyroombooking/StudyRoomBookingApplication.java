package com.saania.studyroombooking;


import com.saania.studyroombooking.entity.Booking;
import com.saania.studyroombooking.entity.Room;
import com.saania.studyroombooking.repository.RoomRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import com.saania.studyroombooking.repository.SlotRepository;
import com.saania.studyroombooking.entity.Slot;
import com.saania.studyroombooking.entity.SlotStatus;
import com.saania.studyroombooking.entity.Booking;
import com.saania.studyroombooking.repository.BookingRepository;

@SpringBootApplication
public class StudyRoomBookingApplication {

	public static void main(String[] args) {
		SpringApplication.run(StudyRoomBookingApplication.class, args);
	}

	@Bean
	CommandLineRunner testRoomRepository(RoomRepository roomRepository, SlotRepository slotRepository, BookingRepository bookingRepository){
		return args -> {
			Room room = new Room();
			room.setName("Study Room A");
			room.setCapacity(4);

			roomRepository.save(room);

			Slot slot = new Slot();
			slot.setRoom(room);
			slot.setStartTime(java.time.LocalTime.of(9,0));
			slot.setEndTime(java.time.LocalTime.of(10,0));
			slot.setStatus(SlotStatus.AVAILABLE);

			slotRepository.save(slot);

			Booking booking = new Booking();
			booking.setSlot(slot);
			booking.setBookedBy("Saania");
			booking.setCreatedAt(java.time.LocalDateTime.now());

			bookingRepository.save(booking);

			System.out.println("Booking saved successfully!");
		};
	}
}
