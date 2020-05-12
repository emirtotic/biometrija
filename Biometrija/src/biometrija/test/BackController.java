package biometrija.test;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import biometrija.test.dao.ClanciDAO;
import biometrija.test.dao.ContactDAO;
import biometrija.test.dao.VrstaDAO;
import biometrija.test.entity.Clanci;
import biometrija.test.entity.Contact;
import biometrija.test.entity.Vrsta;

@Controller
@RequestMapping("/administration")
public class BackController {

	@Autowired
	private VrstaDAO vrstaDAO;
	@Autowired
	private ContactDAO contactDAO;
	@Autowired
	private ClanciDAO clanciDAO;
	
	// VRSTA PAGE CMS !!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!
	
	
	@RequestMapping("/vrsta-page")
	public String getVrstaPage(Model model) {
		
		List<Vrsta> vrstaList = vrstaDAO.getVrstaList();
		model.addAttribute("vrstaList", vrstaList);
		
		return "vrsta-page";
	}
	
	@RequestMapping("/vrsta-delete")
	public String deleteVrsta(@RequestParam int id) {
		
		vrstaDAO.deleteVrsta(id);
		
		return "redirect:/administration/vrsta-page";
	}
	
	@RequestMapping("/vrsta-form")
	public String getVrstaForm(Model model) {
		
		Vrsta vrsta = new Vrsta();
		model.addAttribute("vrsta", vrsta);
		
		return "vrsta-form";
	}
	
	
	@RequestMapping("/vrsta-form-update")
	public String getVrstaFormUpdate(@RequestParam int id, Model model) {
	
		Vrsta vrsta = vrstaDAO.getVrsta(id);
		model.addAttribute("vrsta", vrsta);
		
		return "vrsta-form";
	}
	
	@RequestMapping("/vrsta-save")
	public String saveVrsta(@Valid @ModelAttribute Vrsta vrsta, BindingResult result) {
		
		if (result.hasErrors()) {
			return "vrsta-form";
		}
		
		vrstaDAO.saveVrsta(vrsta);
		
		return "redirect:/administration/vrsta-page";
		
	}
	
	
	
	
	// CONTACT PAGE CMS !!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!
	
	@RequestMapping("/contact-page")
	public String getContactsPage(Model model) {
		
		List<Contact> contactList = contactDAO.getContactList();
		model.addAttribute("contactList", contactList);
		
		return "contact-page";
	}
	
	@RequestMapping("/contact-delete")
	public String contactDelete(@RequestParam int id) {
		
		contactDAO.deleteContact(id);
		
		return "redirect:/administration/contact-page";
	}
	
	
	// CLANCI PAGE CMS !!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!
	
	
	@RequestMapping("/clanci-page")
	public String getClanciPage(Model model) {
		
		List<Clanci> clanciList = clanciDAO.getClanciList();
		model.addAttribute("clanciList", clanciList);
		
		return "clanci-page";
	}
	
	@RequestMapping("/clanci-delete")
	public String deleteClanci(@RequestParam int id) {
		
		clanciDAO.deleteClanak(id);
		
		return "redirect:/administration/clanci-page";
	}
	
	@RequestMapping("/clanci-form")
	public String getClanakForm(Model model) {
		
		Clanci clanak = new Clanci();
		model.addAttribute("clanak", clanak);
		
		return "clanci-form";
	}
	
	
	@RequestMapping("/clanci-form-update")
	public String getClanciFormUpdate(@RequestParam int id, Model model) {
	
		Clanci clanak = clanciDAO.getClanak(id);
		model.addAttribute("clanak", clanak);
		
		return "clanci-form";
	}
	
	@RequestMapping("/clanci-save")
	public String saveClanak(@Valid @ModelAttribute Clanci clanak, BindingResult result) {
		
		if (result.hasErrors()) {
			return "clanci-form";
		}
		
		clanciDAO.saveClanak(clanak);
		
		return "redirect:/administration/clanci-page";
		
	}
	
	
}
