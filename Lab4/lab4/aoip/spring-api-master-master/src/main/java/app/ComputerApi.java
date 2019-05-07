package app;

import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@RestController
public class ComputerApi {

    private List<Computer> computers;


    public ComputerApi() {
        Computer computer1 = new Computer(1, "DDR1", 1000, 10);
        Computer computer2 = new Computer(2, "DDR2", 2000, 20);
        computers = new ArrayList<>();
        computers.add(computer1);
        computers.add(computer2);
    }

    @PostMapping("/api/computers")
    public void addComputer(@RequestBody Computer computer) {
        computers.add(computer);
    }

    @GetMapping("/api/computers")
    public List<Computer> getComputer() {
        return computers;
    }

    @DeleteMapping("/api/computers")
    public boolean removeComputer(@RequestParam long id) {
        Optional<Computer> first = computers.stream().filter(x -> x.getId() == id).findFirst();
        if(first.isPresent())
        {
            return computers.remove(first.get());
        }
        return false;
    }

}
