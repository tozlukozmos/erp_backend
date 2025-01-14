package examplecompany.urun_takip_uygulamasi.business.concretes;

import examplecompany.urun_takip_uygulamasi.business.abstracts.ProcessService;
import examplecompany.urun_takip_uygulamasi.core.utilities.results.DataResult;
import examplecompany.urun_takip_uygulamasi.core.utilities.results.Result;
import examplecompany.urun_takip_uygulamasi.core.utilities.results.SuccessDataResult;
import examplecompany.urun_takip_uygulamasi.core.utilities.results.SuccessResult;
import examplecompany.urun_takip_uygulamasi.dataAccess.abstracts.ProcessDao;
import examplecompany.urun_takip_uygulamasi.entities.concretes.Material;
import examplecompany.urun_takip_uygulamasi.entities.concretes.Process;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProcessManager implements ProcessService {
    public ProcessDao processDao;

    @Autowired
    public ProcessManager(ProcessDao processDao){
        super();
        this.processDao = processDao;
    }

    @Override
    public Result addProcess(Process process) {
        this.processDao.save(process);
        return new SuccessResult("İşlem başarıyla eklendi.");
    }

    @Override
    public DataResult<List<Process>> getAllProcess() {
        Sort sort = Sort.by(Sort.Direction.DESC, "createdAt");
        return new SuccessDataResult<List<Process>>(this.processDao.findAll(sort), "Tüm işlemler listelendi.");
    }

}
