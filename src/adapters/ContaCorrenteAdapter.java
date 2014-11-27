/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package adapters;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import model.Agencias;
import model.Clientes;
import model.Contacorrentes;
import wcf.ArrayOfAccount;
import wcf.ArrayOfClient;
import wcf.Client;

/**
 *
 * @author Danilo
 */
public class ContaCorrenteAdapter {

    public List<Contacorrentes> parser(ArrayOfAccount accs, List<Agencias> agencias, List<Clientes> clientes, ArrayOfClient clts) {
        List<Contacorrentes> contas = new ArrayList<>();

        for (wcf.Account account : accs.getAccount()) {
            Contacorrentes contacorrentes = new Contacorrentes();

            contacorrentes.setId(account.getID());

            String[] chars = account.getCode().getValue().split("-");

            contacorrentes.setCodigo(Integer.parseInt(chars[0]));
            contacorrentes.setDigito(Integer.parseInt(chars[1]));

            for (Agencias agencia : agencias) {
                if (Objects.equals(agencia.getId(), account.getAgencyID())) {
                    contacorrentes.setIdAgencias(agencia);
                    break;
                }
            }

            for (Client client : clts.getClient()) {
                if (Objects.equals(contacorrentes.getId(), client.getAccountID())) {
                    for (Clientes cliente : clientes) {
                        if (Objects.equals(client.getID(), cliente.getId())) {
                            contacorrentes.setIdClientes(cliente);
                            break;
                        }
                    }
                }
            }

            contacorrentes.setSaldo(account.getBalance());
            contas.add(contacorrentes);
        }

        return contas;
    }

}
