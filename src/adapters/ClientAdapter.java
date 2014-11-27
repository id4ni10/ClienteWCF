/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package adapters;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import model.Clientes;
import wcf.ArrayOfClient;

/**
 *
 * @author Danilo
 */
public class ClientAdapter {

    public List<Clientes> parser(ArrayOfClient clts) {
        List<Clientes> clientes = new ArrayList<>();

        for (wcf.Client client : clts.getClient()) {
            Clientes cliente = new Clientes();

            cliente.setId(client.getID());
            cliente.setDataCadastro(new Date());
            
            cliente.setCpf(null);
            
            cliente.setDataNascimento(client.getBornDate().toGregorianCalendar().getTime());
            cliente.setNome(client.getName().getValue());

            clientes.add(cliente);
        }

        return clientes;
    }

}
