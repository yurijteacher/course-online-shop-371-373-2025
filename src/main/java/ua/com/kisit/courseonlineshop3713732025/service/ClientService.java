package ua.com.kisit.courseonlineshop3713732025.service;

import org.springframework.stereotype.Service;
import ua.com.kisit.courseonlineshop3713732025.entity.Clients;
import ua.com.kisit.courseonlineshop3713732025.repository.ClientsRepository;

@Service
public class ClientService {

    private final ClientsRepository clientsRepository;

    public ClientService(ClientsRepository clientsRepository) {
        this.clientsRepository = clientsRepository;
    }

    public Clients saveNewClient(Clients client) {
       return clientsRepository.save(client);
    }

    public boolean getClientByLogin(String username){
        return clientsRepository.findAllByUsername(username).isEmpty() ? false : true;
    }

    public boolean getClientByLoginAndPassword(String username, String password){
        return clientsRepository.findAllByUsernameAndPassword(username,password).isEmpty() ? false : true;
    }


    public Clients getClientByUsername(String username){
        return clientsRepository.findByUsername(username);
    }

}
