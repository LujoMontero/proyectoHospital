package org.example.proyectohospitalpost.controller;

import org.example.proyectohospitalpost.entity.Patient;
import org.example.proyectohospitalpost.service.IPatientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/patient")
public class PatientController {

    @Autowired
    private IPatientService patientService;

    @GetMapping
    public String getAllPatients(Model model) {
        List<Patient> patients = patientService.getAllPatients();
        model.addAttribute("pacientes", patients);
        return "patients";
    }
    @GetMapping("/new")
    public String showAddPatientForm(Model model) {
        model.addAttribute("patient", new Patient());
        return "addPatient";
    }
    @PostMapping
    public String addPatient(Patient patient) {
        patientService.savePatient(patient);
        return "redirect:/patient";
    }
}