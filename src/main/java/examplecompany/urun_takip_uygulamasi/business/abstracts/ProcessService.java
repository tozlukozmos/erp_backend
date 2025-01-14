package examplecompany.urun_takip_uygulamasi.business.abstracts;

import examplecompany.urun_takip_uygulamasi.core.utilities.results.DataResult;
import examplecompany.urun_takip_uygulamasi.core.utilities.results.Result;
import examplecompany.urun_takip_uygulamasi.entities.concretes.Material;
import examplecompany.urun_takip_uygulamasi.entities.concretes.Process;

import java.util.List;

public interface ProcessService {
    Result addProcess(Process process);
    DataResult<List<Process>> getAllProcess();
}
