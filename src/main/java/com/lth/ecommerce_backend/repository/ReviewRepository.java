package com.lth.ecommerce_backend.repository;

import com.lth.ecommerce_backend.model.Review;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ReviewRepository extends JpaRepository<Review, Long> {
    @Query("SELECT p FROM Review p WHERE p.product.id=:productId")
    public List<Review> getAllProductsReview(@Param("productId") Long productId);
}
