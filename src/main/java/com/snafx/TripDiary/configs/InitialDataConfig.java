package com.snafx.TripDiary.configs;

import com.snafx.TripDiary.models.Trip;
import com.snafx.TripDiary.models.User;
import com.snafx.TripDiary.repositories.JpaTravelRepository;
import com.snafx.TripDiary.repositories.JpaUserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;

import javax.annotation.PostConstruct;
import java.time.LocalDate;

@Configuration
public class InitialDataConfig {

    private JpaTravelRepository jpaTravelRepository;

    private JpaUserRepository jpaUserRepository;

    @Autowired
    public InitialDataConfig(JpaTravelRepository jpaTravelRepository, JpaUserRepository jpaUserRepository) {
        this.jpaTravelRepository = jpaTravelRepository;
        this.jpaUserRepository = jpaUserRepository;
    }

    @PostConstruct
    public void init() {

        User user = new User("koko", "koko123", "koko@test.com", "John", "Doe", "California");
        User user2 = new User("candy666", "candy123", "candy@test.com", "Candice", "Smith", "Berlin");
        User user3 = new User("BigFranklin", "franklin123", "franklin@test.com", "Franklin", "Big", "Poznan");

        jpaUserRepository.save(user);
        jpaUserRepository.save(user2);
        jpaUserRepository.save(user3);

        String description = "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. " +
                "Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat. Duis aute irure dolor in " +
                "reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla pariatur. Excepteur sint occaecat cupidatat non proident, " +
                "sunt in culpa qui officia deserunt mollit anim id est laborum.";

        Trip trip = new Trip(user, "Amazing hiking in Norwegian mountains!", "Norway", description, description, description,
                "https://res.cloudinary.com/simpleview/image/upload/c_fill,f_auto,h_702,q_65,w_1200/v1/clients/norway/hiking-trolltunga-hardangerfjord-norway-2-1_353a98f6-1f27-4a0d-953c-f2267f4e4b20.jpg",
                "https://res.cloudinary.com/simpleview/image/upload/c_fill,f_auto,h_575,q_64,w_1200/v1/clients/norway/camping-kafjord-norway-2-1_3daa4b85-c491-453f-99fc-35d7bd44fb27.jpg",
                "https://res.cloudinary.com/simpleview/image/upload/c_limit,f_auto,h_1200,q_75,w_1200/v1/clients/norway/hiking_norway_preview_8a8c0b82-dc55-4036-a50c-79424e5a5f31.jpg",
                LocalDate.now());

        Trip trip2 = new Trip(user2, "Great weekend with Real Madrid game!", "Spain", description, description, null,
                "https://www.corazonblanco.com/media/galeria/44/5/9/4/6/n_real_madrid_fondos-2976495.jpg",
                "http://as01.epimg.net/en/imagenes/2017/08/23/football/1503469635_888168_1503528235_noticia_normal.jpg",
                "http://i.dailymail.co.uk/i/pix/2014/08/25/1408996541642_lc_galleryImage_MADRID_SPAIN_AUGUST_25_Cr.JPG",
                LocalDate.of(2017, 8, 16));
        Trip trip3 = new Trip(user3, "Snowboarding week in Italian mountains!", "Italy", description, null, description,
                "https://www.neilson.co.uk/sites/default/files/2016-10/Skiing%20in%20Italy.jpg",
                "http://i3.mirror.co.uk/incoming/article1529973.ece/ALTERNATES/s615/Cervinia%20ski%20WRITER%20Nick%20Matterhorn",
                "http://flights.jet2.com/uploadedImages/Shared_Resources/Pages/Flight_Jet2_Com/skiing-snowboarding/resorts/andorra/arinsal/arinsal_01b.gif",
                LocalDate.of(2017, 2, 23));

        jpaTravelRepository.save(trip);
        jpaTravelRepository.save(trip2);
        jpaTravelRepository.save(trip3);


    }
}
