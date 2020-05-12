package biometrija.test;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import biometrija.test.dao.ClanciDAO;
import biometrija.test.dao.ContactDAO;
import biometrija.test.dao.VrstaDAO;
import biometrija.test.entity.Clanci;
import biometrija.test.entity.Contact;
import biometrija.test.entity.Vrsta;

@Controller
@RequestMapping("/")
public class FrontController {

	@Autowired
	private VrstaDAO vrstaDAO;
	@Autowired
	private ContactDAO contactDAO;
	@Autowired
	private ClanciDAO clanciDAO;
	
	@RequestMapping({"/","/index-page"})
	public String getIndexPage(Model model) {
		
		Contact contact = new Contact();
		List<Vrsta> vrstaList = vrstaDAO.getVrstaList();
		List<Clanci> clanciList = clanciDAO.getClanciList();
		model.addAttribute("clanciList", clanciList);
		model.addAttribute("vrstaList", vrstaList);
		model.addAttribute("contact", contact);
		
		return "front/index-page";
	}
	
	@RequestMapping("/otisak-prsta")
	public String getOtisak(Model model) {
		
		Contact contact = new Contact();
		model.addAttribute("contact", contact);
		Vrsta vrsta = vrstaDAO.getVrsta(1);
		model.addAttribute("vrsta", vrsta);
		
		return "front/otisak-prsta";
		
	}
	
	@RequestMapping("/otisak-dlana")
	public String getOtisakDlana(Model model) {
		
		Contact contact = new Contact();
		model.addAttribute("contact", contact);
		Vrsta vrsta = vrstaDAO.getVrsta(5);
		model.addAttribute("vrsta", vrsta);
		
		return "front/otisak-dlana";
		
	}
	
	@RequestMapping("/iris-oka")
	public String getIrisOka(Model model) {
		
		Contact contact = new Contact();
		model.addAttribute("contact", contact);
		Vrsta vrsta = vrstaDAO.getVrsta(4);
		model.addAttribute("vrsta", vrsta);
		
		return "front/iris-oka";
		
	}
	
	@RequestMapping("/contact-save")
	public String saveContact(@Valid @ModelAttribute Contact contact, BindingResult result) {
		
		if (result.hasErrors()) {
			return "index-page";
		}
		
		contactDAO.saveContact(contact);
		
		return "redirect:/index-page";
		
	}
}
