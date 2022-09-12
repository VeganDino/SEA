package com.sea.domain.animal.db.repository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Repository;

import com.sea.domain.animal.db.entity.Animal;

import com.querydsl.jap.impl.JPA
@Repository
public class AnimalSupportRepository {
	
	@Autowired
    private JPAQueryFactory jpaQueryFactory;

    QAnimal qAroduct = QAnimal.animal;
	//READ
    public  Page<Animal> findProductList(Pageable pageable) {
        List<Animal> productQueryResults = jpaQueryFactory.select(qAnimal)
                .from(qProduct)
                .limit(pageable.getPageSize())
                .offset(pageable.getOffset())
                .fetch();

        if(productQueryResults.isEmpty()) return Page.empty();

        return new PageImpl<Product>(productQueryResults, pageable, productQueryResults.size());
    }
}
