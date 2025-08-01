package estudos.apichucknorris;

import estudos.apichucknorris.dto.ChuckNorrisDTO;
import estudos.apichucknorris.service.ApiService;

public class Principal {

    public static void main(String[] args) {
        ApiService apiService = new ApiService(); // classe que faz a requisição

        ChuckNorrisDTO chuckNorrisDto = apiService.getValue(); // armazeno nessa variavel o retorno do método getValue que é o json transformado em obj java
        
        System.out.println(chuckNorrisDto.getValue()); // imprimo a resposta da requisicao que é uma frase
            
    }
}
