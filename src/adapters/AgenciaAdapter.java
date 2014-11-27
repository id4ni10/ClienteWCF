/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package adapters;

import java.util.ArrayList;
import java.util.List;
import model.Agencias;
import wcf.ArrayOfAgency;

/**
 *
 * @author Danilo
 */
public class AgenciaAdapter {

    public List<Agencias> parser(ArrayOfAgency agcs) {
        List<Agencias> agencias = new ArrayList<>();

        for (wcf.Agency agency : agcs.getAgency()) {
            Agencias agencia = new Agencias();

            agencia.setId(agency.getID());

            String[] chars = agency.getCode().getValue().split("-");

            agencia.setCodigo(Integer.parseInt(chars[0]));
            agencia.setDigito(chars[1]);

            agencia.setEndereco(agency.getAdress().getValue());

            agencias.add(agencia);
        }

        return agencias;
    }
}
