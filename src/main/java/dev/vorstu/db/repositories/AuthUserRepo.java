package dev.vorstu.db.repositories;

import dev.vorstu.db.entities.auth.AuthUserEntity;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.Set;

@Repository
public interface AuthUserRepo extends PagingAndSortingRepository<AuthUserEntity, Long> {
//    CrudRepository
//@Query(value = "SELECT user_id, enabled, name, password, surname, username FROM users u" +
//        " WHERE u.name LIKE :data OR u.surname LIKE :data",
//        nativeQuery = true)
//Page<AuthUserEntity> findWithFilter(Pageable pageable, @Param("data")String data);
   @Modifying
   @Query(value = "UPDATE users u SET u.enabled = false WHERE user_id = :id",
           nativeQuery = true)
   int deleteUser(@Param("id")Long user_id);
   public Set<AuthUserEntity> findAll();
//    int deleteUser(@Param("id")Long id);

}
