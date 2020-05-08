package org.cap.passbookmgt.dao;

import org.cap.passbookmgt.entities.Passbook;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PassbookDao extends JpaRepository<Passbook,Integer> {
}
