package Program.service;

import Program.model.Diak;
import Program.model.Szak;
import Program.model.Targy;
import Program.repo.DiakRepo;
import Program.repo.FelvettRepo;
import Program.repo.SzakRepo;
import Program.repo.TargyRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class DiakService {

    @Autowired
    DiakRepo diakRepo;

    @Autowired
    FelvettRepo felvettRepo;

    @Autowired
    SzakRepo szakRepo;

    @Autowired
    TargyRepo targyRepo;


    public void createSzak(String nev){
        Szak szak = new Szak(nev);
        szakRepo.save(szak);
    }


    public void createDiak(String nev, String szak_nev){
        Szak szak = szakRepo.findFirstByName(szak_nev);
        Diak diak = new Diak(nev, szak);
        diakRepo.save(diak);
    }

/*
    public void diakTargyFelvetel(Long diak_id, String targy_nev) throws Exception {
        Diak diak = null;
        Targy targy = null;
        try {
            try {
                diak = diakRepo.getById(diak_id);
            } catch (Exception e) {
                throw new Exception("Nincs ilyen diak");
            }
            try {
                targy = targyRepo.findByNev(targy_nev);
            } catch (Exception e) {
                throw new Exception("Nincs ilyen targy");
            }
        } catch (Exception e) {
            felvettRepo.save(new Felvett(diak, targy));

            throw new Exception(e.getMessage());
        }


    }
*/
/*
    public void szakValasztas(Szak szak, Diak diak) throws Exception {

        try {
            System.out.println("2");
            diak = diakRepo.getById(diak.getId());
        } catch (Exception e) {
            System.out.println("2.1");

            throw new Exception("Nincs ilyen diak");
        }
        try {
            System.out.println("3");
            szak = szakRepo.getById(szak.getId());
        } catch (Exception e) {
            System.out.println("3.1");
            throw new Exception("Nincs ilyen szak");
        }
        System.out.println("4");
        diak.setSzak(szak);
        diakRepo.save(diak);
    }

 */

    public List<Targy> getTargyak() {
        return targyRepo.findAll();
    }

    public List<Szak> getSzakok() {
        return szakRepo.findAll();
    }

    public List<Diak> getDiakok() {
        return diakRepo.findAll();
    }
}
