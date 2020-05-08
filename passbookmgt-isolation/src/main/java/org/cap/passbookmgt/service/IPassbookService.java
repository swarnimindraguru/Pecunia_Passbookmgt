package org.cap.passbookmgt.service;

import org.cap.passbookmgt.entities.Passbook;

import java.util.List;

public interface IPassbookService {
    

    List<Passbook> accountSummary();

    List<Passbook> updatePassbook();
}
