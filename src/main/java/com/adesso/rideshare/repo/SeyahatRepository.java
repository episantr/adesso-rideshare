package com.adesso.rideshare.repo;

import com.adesso.rideshare.model.Seyahat;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface SeyahatRepository extends JpaRepository<Seyahat, Long> {

    List<Seyahat> findAllByNeredenIdAndNereyeId(Long nereden, Long nereye);

}
