package com.aicha.produit.repos;

import org.springframework.data.jpa.repository.JpaRepository;
import com.aicha.produit.entities.Produit;
public interface ProduitRepository extends JpaRepository<Produit, Long> {

}
