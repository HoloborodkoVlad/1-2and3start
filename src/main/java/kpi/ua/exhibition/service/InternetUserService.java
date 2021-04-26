package kpi.ua.exhibition.service;

import kpi.ua.exhibition.model.InternetUser;
import kpi.ua.exhibition.model.Person;

public interface InternetUserService {
    InternetUser getByEmail(String email);

    InternetUser save(InternetUser internetUser);
}
