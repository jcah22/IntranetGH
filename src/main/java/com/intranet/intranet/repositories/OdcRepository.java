package com.intranet.intranet.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.intranet.intranet.models.Odc;

@Repository
public interface OdcRepository extends JpaRepository<Odc, Long> {

   // @Query("select o from Odc o where o.total= :filtro")
   @Query(value="select * from odc o where o.id_req= :filtro", nativeQuery=true)
   List<Odc> getOdcByRequisicionById(Long filtro);
    

}
