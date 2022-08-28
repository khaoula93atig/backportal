package com.example.PortalMedical.Services;

import java.util.List;

import com.example.PortalMedical.DTO.UserDTO;
import com.example.PortalMedical.enteties.RendezVousEntity;
import com.example.PortalMedical.enteties.RendezVousEntity.StateApt;

public interface RendezVousServices {

	//public RendezVousEntity ajouterApt(RendezVousEntity apt);
	 //public void ajouterApt(RendezVousEntity apt);
	 public RendezVousEntity ajouterApt(RendezVousEntity apt);
	 public RendezVousEntity demandeRDV(RendezVousEntity apt);
	 List<RendezVousEntity> retrieveAllApt();
	 public void deleteAptById(long aptId);
	 public RendezVousEntity updateApt(RendezVousEntity apt);
	 public List<RendezVousEntity> getAllRdvByUserId() ;
	 //public RendezVousEntity getAptByState(StateApt state);
	 public List<RendezVousEntity> getAptByState(String state);
	 public RendezVousEntity getbyid(Long id);
	 public RendezVousEntity confirmerRdv(RendezVousEntity rdv);
	 public RendezVousEntity annulerRdv(RendezVousEntity rdv);
	// public List<RendezVousEntity> getAptOrderedByDate();
	 public List<RendezVousEntity> getAllAptList();
	 public void ChangeStateById(int aptId);
	 public void ChangeStateById1(int aptId);
	 public List<RendezVousEntity> AfficherDemandes();
	 public void deleteAdsById1(int aptId);
	 public List<RendezVousEntity> getAllRdvByUserIdWaiting();
	 public List<RendezVousEntity> getTodaysApt();
	 public List<RendezVousEntity> getAllRdvByUserIdWaiting2();
}
