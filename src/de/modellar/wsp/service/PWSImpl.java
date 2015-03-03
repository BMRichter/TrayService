package de.modellar.wsp.service;

import javax.interceptor.Interceptors;
import javax.jws.WebService;

import de.modellar.wsp.jpa.PersonJPA;
import de.modellar.wsp.model.Person;
import de.modellar.wsp.model.SearchQuery;
import de.modellar.wsp.model.SimpleResponse;
import de.modellar.wsp.util.LoggingInterceptor;

@Interceptors(LoggingInterceptor.class)
@WebService(endpointInterface = "de.modellar.wsp.service.PWS")
public class PWSImpl implements PWS {

	private PersonJPA worker = new PersonJPA();

	@Override
	public Person getPersonData(SearchQuery getPersonRequest) {
		return worker.getPerson(getPersonRequest);
	}

	@Override
	public SimpleResponse setPersonData(Person setPersonRequest) {
		boolean isDone = worker.addPerson(setPersonRequest);
		
		if(isDone) {
			return SimpleResponse.OK;
		} else {
			return SimpleResponse.DUPLICATE;
		}
	}
}