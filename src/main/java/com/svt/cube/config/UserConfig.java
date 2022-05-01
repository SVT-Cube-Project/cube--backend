//package com.svt.cube.config;
//
//import com.svt.cube.entity.Comment;
//import com.svt.cube.entity.User;
//import com.svt.cube.entity.FamilyTag;
//import com.svt.cube.entity.Tag;
//import com.svt.cube.entity.Topic;
//import com.svt.cube.repository.CommentRepository;
//import com.svt.cube.repository.UserRepository;
//import com.svt.cube.repository.FamilyTagRepository;
//import com.svt.cube.repository.TagRepository;
//import com.svt.cube.repository.TopicRepository;
//import org.springframework.boot.CommandLineRunner;
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//
//import java.time.LocalDate;
//import java.util.List;
//
//import static java.time.Month.APRIL;
//import static java.time.Month.MARCH;
//
//@Configuration
//public class UserConfig {
//
//    @Bean
//    CommandLineRunner commandLineRunner(UserRepository userRepository, TopicRepository topicRepository,
//                                        TagRepository tagRepository, FamilyTagRepository familyTagRepository, CommentRepository commentRepository) {
//        return args -> {
//
//            // ###### USER ######
//            User pierre = new User(
//                    "PierreRocher",
//                    LocalDate.of(2000, APRIL, 12),
//                    "pierre.rocher@gmail.com",
//                    "1234"
//            );
//
//
//            User jean = new User(
//                    "JeanFlutte",
//                    LocalDate.of(1990, MARCH, 15),
//                    "jean.flutte@gmail.com",
//                    "1234"
//            );
//
//
//            // ###### TOPIC ######
//            Topic macron = new Topic(
//                    "Macron nous parle",
//                    "Bonjour Bla, blablba oui blablabla",
//                    "macron.jpg",
//                    3,
//                    400);
//
//            Topic soap = new Topic(
//                    "Soupe le 14 Mars",
//                    "Bonjour Blo, blobloblo oui blobloblo",
//                    "soap.jpg",
//                    3,
//                    400);
//
//            // ###### COMMENT ######
//            Comment firstComment = new Comment(
//                    "J'aime bien",
//                    3,
//                    1,
//                    LocalDate.of(2022, MARCH, 15),
//                    1,
//                    1
//            );
//
//            Comment secondComment = new Comment(
//                    "Je suis content",
//                    2,
//                    8,
//                    LocalDate.of(2022, MARCH, 18),
//                    1,
//                    2
//            );
//
////            FamilyTag familyTag = new FamilyTag("familytag","famille de tag");
////
////            Tag tag = new Tag("Fishes", "Poissons", familyTag);
//
//
//
//            userRepository.saveAll(
//                    List.of(pierre, jean));
//
//            topicRepository.saveAll(
//                    List.of(macron, soap));
//
//            commentRepository.saveAll(
//                    List.of(firstComment, secondComment)
//            );
//
////            tagRepository.save(tag);
////            familyTagRepository.save(familyTag);
//        };
//    }
//}
