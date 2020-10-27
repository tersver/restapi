package restapi.dto;


import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.ToString;

@Getter
@ToString
public class HelloResponseDto {

    private String name;
    private int amount;

    public HelloResponseDto(String name, int amount){
        this.name=name;
        this.amount=amount;
    }

    public String getName(){
        return name;
    }
    public int getAmount(){
        return amount;
    }
}
