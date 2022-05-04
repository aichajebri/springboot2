package com.aicha.produit.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.aicha.produit.entities.Produit;
import com.aicha.produit.repos.ProduitRepository;

@Service
public class ProduitServiceImpl implements ProduitService {
	@Autowired
	ProduitRepository produitrepository;

	@Override
	public Produit saveProduit(Produit p) {
		// TODO Auto-generated method stub
		return produitrepository.save(p);
	}

	@Override
	public Produit updateProduit(Produit p) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void deleteProduit(Produit p) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteProduitById(Long id) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Produit getProduit(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Produit> getAllProduits() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Produit saveProduit1(Produit p) {
		// TODO Auto-generated method stub
		return null;
	}

}
