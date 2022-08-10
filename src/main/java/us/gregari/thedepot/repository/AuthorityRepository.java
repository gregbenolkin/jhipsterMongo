package us.gregari.thedepot.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import us.gregari.thedepot.domain.Authority;

/**
 * Spring Data MongoDB repository for the {@link Authority} entity.
 */
public interface AuthorityRepository extends MongoRepository<Authority, String> {}
