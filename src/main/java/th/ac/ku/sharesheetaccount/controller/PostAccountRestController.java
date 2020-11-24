package th.ac.ku.sharesheetaccount.controller;


import org.springframework.web.bind.annotation.*;
import th.ac.ku.sharesheetaccount.data.sharesheetAccountRepository;
import th.ac.ku.sharesheetaccount.model.PostAccount;

import java.util.List;

@RestController
@RequestMapping("/api/post")
public class PostAccountRestController {

    private sharesheetAccountRepository repository;

    public PostAccountRestController(sharesheetAccountRepository repository) {
        this.repository = repository;
    }

    @GetMapping
    public List<PostAccount> getAll() {
        return repository.findAll();
    }

    @GetMapping("/{id}")
    public PostAccount getOne(@PathVariable int id) {
        return repository.findById(id).get();
    }

    @PostMapping
    public PostAccount create(@RequestBody PostAccount postAccount) {
        PostAccount record = repository.save(postAccount);
        repository.flush();
        return record;
    }

    @PutMapping("/{id}")
    public PostAccount update(@PathVariable int id,
                              @RequestBody PostAccount postAccount) {
        PostAccount record = repository.findById(id).get();
        record.setDescription(postAccount.getDescription());
        repository.save(record);
        return record;
    }

    @DeleteMapping("/{id}")
    public PostAccount delete(@PathVariable int id) {
        PostAccount record = repository.findById(id).get();
        repository.deleteById(id);
        return record;
    }




}
