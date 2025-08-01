package estudos.apichucknorris.service;

import com.fasterxml.jackson.databind.ObjectMapper;

import estudos.apichucknorris.dto.ChuckNorrisDTO;

import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.net.URI;


public class ApiService {
    
    public ChuckNorrisDTO getValue() {
        ChuckNorrisDTO chuckNorrisDTO = new ChuckNorrisDTO(); // criando um objeto ChuckNorrisDTO que ira receber um json transformado em obj java que irei retornar no final do metodo
        
        try {
            HttpClient client = HttpClient.newHttpClient(); // cria um cliente http
            HttpRequest request = HttpRequest.newBuilder()
                    .uri(URI.create("https://api.chucknorris.io/jokes/random")).build(); // cria a requisicao 
            HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString()); // envia a requisição e espera a resposta
            
            ObjectMapper mapper = new ObjectMapper(); // essa classe pega o JSON e transforma em objeto java
            chuckNorrisDTO = mapper.readValue(response.body(), ChuckNorrisDTO.class); // armazena o json tranformado em obj java na variavel chuckNorrisDTO
        } catch(Exception e){
            System.out.println(e.getMessage());
        }
        
        return chuckNorrisDTO; // retorno o json ja transformado em obj java que irei manipular pela classe ChuckNorrisDTO
    }
    
}
