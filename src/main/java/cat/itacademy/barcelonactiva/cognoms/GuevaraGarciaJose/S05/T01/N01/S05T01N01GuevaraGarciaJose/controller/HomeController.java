package cat.itacademy.barcelonactiva.cognoms.GuevaraGarciaJose.S05.T01.N01.S05T01N01GuevaraGarciaJose.controller;

import cat.itacademy.barcelonactiva.cognoms.GuevaraGarciaJose.S05.T01.N01.S05T01N01GuevaraGarciaJose.model.Sucursal;
import cat.itacademy.barcelonactiva.cognoms.GuevaraGarciaJose.S05.T01.N01.S05T01N01GuevaraGarciaJose.service.SucursalService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;
import org.springframework.ui.Model;

import java.util.List;
import java.util.Optional;

@Controller
public class HomeController {

    @GetMapping("/")
    public String index(Model model){
        List<Sucursal>sucursales= sucursalService.getAll();
        model.addAttribute("sucursales", sucursales);
        return "home";
    }

    @GetMapping("/agregar")
    public String agregar(Model model){
        model.addAttribute("sucursal", new Sucursal());
        return "form";
    }

    @PostMapping("/save")
    public String save(@Validated Sucursal s, Model model){
        sucursalService.saveSucursal(s);
        return "redirect:/";

    }

    @GetMapping("/editar/{id}")
    public String editar(@PathVariable long id, Model model){
        Optional<Sucursal>sucursal= Optional.ofNullable(sucursalService.getPk_SucursalID(id));
        model.addAttribute("sucursal", sucursal);
        return "form";
    }

    @GetMapping("/eliminar/{id}")
    public String eliminar(Model model, @PathVariable long id){
        sucursalService.delete(id);;
        return "redirect:/";

    }
    @Autowired
    private SucursalService sucursalService;


    @GetMapping("/sucursal/getAll")
    public List<Sucursal> getAll() {
        return sucursalService.getAll();
    }

    @PutMapping("/sucursal/update")
    public Sucursal updateSucursal(@RequestBody Sucursal sucursal){
        return sucursalService.updateSucursal(sucursal);
    }

    @GetMapping("/sucursal/getOne/{id}")
    public Sucursal getOne(@PathVariable Long id) {
        return sucursalService.getPk_SucursalID(id);
    }

    @DeleteMapping("/sucursal/delete/{id}")
    public void delete(@RequestBody Long id){
        sucursalService.delete(id);
    }

}

