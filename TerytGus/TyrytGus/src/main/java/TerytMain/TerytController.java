package TerytMain;


import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.*;


import java.util.List;

@ControllerAdvice
@AllArgsConstructor
@NoArgsConstructor
@RestController
public class TerytController {



    @Autowired
     TerytRepo terytRepo;


@GetMapping("/DaneTerytowe")
    public List<DaneTerytowe> getDaneTerytowe() {
        return (List<DaneTerytowe>) terytRepo.findAll();
}

    @GetMapping("/NAZWADOD/{terytorium}")
    public List<DaneTerytowe> getDaneNazwaDod(@PathVariable("terytorium") String NazwaDod) {
        return (List<DaneTerytowe>) terytRepo.findByNazwaDod(NazwaDod);
    }
    @GetMapping("/NAZWADOD/W") //Województwa
    public List<DaneTerytowe> getDaneW() {
        return (List<DaneTerytowe>) terytRepo.findByNazwaDod("województwo");
    }
    @GetMapping("/NAZWADOD/P") //Powiaty
    public List<DaneTerytowe> getDaneP() {
        return (List<DaneTerytowe>) terytRepo.findByNazwaDod("powiat");
    }
    @GetMapping("/NAZWADOD/GM") //Gmina Miejska
    public List<DaneTerytowe> getDaneGM() {
        return (List<DaneTerytowe>) terytRepo.findByNazwaDod("gmina miejska");
    }

    @GetMapping("/NAZWADOD/GMW") //Gmina Miejsko-Wiejska
    public List<DaneTerytowe> getDaneGMW() {
        return (List<DaneTerytowe>) terytRepo.findByNazwaDod("gmina miejsko-wiejska");
    }

    @GetMapping("/NAZWADOD/GW") //Gmina Wiejska
    public List<DaneTerytowe> getDaneGW() {
        return (List<DaneTerytowe>) terytRepo.findByNazwaDod("gmina wiejska");
    }

    @GetMapping("/NAZWADOD/M") //Miasto
    public List<DaneTerytowe> getDaneM() {
        return (List<DaneTerytowe>) terytRepo.findByNazwaDod("miasto");
    }

    @GetMapping("/NAZWADOD/OW") //Obszar Wiejski
    public List<DaneTerytowe> getDaneOW() {
        return (List<DaneTerytowe>) terytRepo.findByNazwaDod("obszar wiejski");
    }

    @GetMapping("/NAZWADOD/D") //Delegatura
    public List<DaneTerytowe> getDaneD() {
        return (List<DaneTerytowe>) terytRepo.findByNazwaDod("delegatura");
    }

    @GetMapping("/NAZWADOD/DZ") //Dzielnica
    public List<DaneTerytowe> getDaneDZ() {
        return (List<DaneTerytowe>) terytRepo.findByNazwaDod("dzielnica");
    }

    @GetMapping("/NAZWADOD/MNPP") //Miasto Na Prawach Powiatu
    public List<DaneTerytowe> getDaneMNPP() {
        return (List<DaneTerytowe>) terytRepo.findByNazwaDod("miasto na prawach powiatu");
    }

    @GetMapping("/NAZWADOD/MSNPP") //Miasto Stołeczne, Na Prawach Powiatu
    public List<DaneTerytowe> getDaneMSNPP() {
        return (List<DaneTerytowe>) terytRepo.findByNazwaDod("miasto stołeczne, na prawach powiatu");
    }
    @GetMapping("/NAZWADOD/GMMS") //Gmina Miejska, Miasto Stołeczne
    public List<DaneTerytowe> getDaneGMMS() {
        return (List<DaneTerytowe>) terytRepo.findByNazwaDod("gmina miejska, miasto stołeczne");
    }
    @PostMapping("/DaneTerytowe/Save")
    public DaneTerytowe SaveTeryt(@RequestBody(required = false) DaneTerytowe daneTerytowe) {
          return terytRepo.save(daneTerytowe);
}

    @PutMapping("/DaneTerytowe/Update/{id}")
    public DaneTerytowe UpdateTeryt (@PathVariable long id,@RequestBody(required = false) DaneTerytowe daneTerytowe){
        return terytRepo.save(daneTerytowe);
    }


    @DeleteMapping("/DaneTerytowe/Delete/{id}")
    public String DeleteTeryt(@PathVariable (value= "id") long id) {
        DaneTerytowe daneTerytowe = terytRepo.findById(id)
        .orElseThrow(() -> new RuntimeException(("Nie znaleziono rekordu o podanym id:")+id));
        terytRepo.delete(daneTerytowe);
        return "Pomyślnie usunięto rekord o podanym id:"+id;

}}


