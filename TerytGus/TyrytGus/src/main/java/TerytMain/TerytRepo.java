package TerytMain;


import org.springframework.data.jpa.repository.JpaRepository;

import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface TerytRepo extends JpaRepository<DaneTerytowe, Long> {

    @Query("SELECT t FROM DaneTerytowe t WHERE t.NazwaDod = ?1")
    List<DaneTerytowe> findByNazwaDod(String nazwa);

 }


