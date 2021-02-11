package com.db.awmd.challenge.service;

import org.springframework.stereotype.Service;

import com.db.awmd.challenge.domain.Account;
@Service
public interface NotificationService {

  void notifyAboutTransfer(Account account, String transferDescription);
}
