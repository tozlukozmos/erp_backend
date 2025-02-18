package examplecompany.urun_takip_uygulamasi.business.abstracts;

import examplecompany.urun_takip_uygulamasi.core.utilities.results.DataResult;
import examplecompany.urun_takip_uygulamasi.core.utilities.results.Result;
import examplecompany.urun_takip_uygulamasi.entities.concretes.Material;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;
import java.util.Optional;

public interface MaterialService {
    DataResult<Material> addMaterial(Material material, MultipartFile file);
    DataResult<Material> updateMaterial(Material material, MultipartFile file);
    Result deleteMaterial(int id);
    DataResult<List<Material>> getAllMaterial();
    DataResult<Optional<Material>> getById(int id);
    DataResult<Material> getByReferenceNumber(Long referenceNumber);
    DataResult<Material> getByMaterialNameAndTypeNameAndUnitNameAndSizeNameAndColorName(
        String materialName,
        String typeName,
        String unitName,
        String sizeName,
        String colorName
    );
}
