package ra.business.serviceimpl;

import ra.business.model.Catalog;
import ra.business.service.ICatalogService;

import java.util.List;

public class CatalogService implements ICatalogService {
    @Override
    public List<Catalog> findALl() {
        return null;
    }

    @Override
    public Catalog findById(Long id) {
        return null;
    }

    @Override
    public void save(Catalog catalog) {

    }

    @Override
    public void deleteById(Long id) {

    }

    @Override
    public boolean existByCatalogName(String catalogName) {
        return false;
    }
}
