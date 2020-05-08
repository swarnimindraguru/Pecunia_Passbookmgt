package org.cap.passbookmgt.service;

import org.cap.passbookmgt.dao.PassbookDao;
import org.cap.passbookmgt.entities.Passbook;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.passbook.annotation.Transactional;
import java.util.*;

@Service
@Transactional
public class PassbookServiceImpl implements IPassbookService{

    @Autowired
    private PassbookDao dao;


    


}
