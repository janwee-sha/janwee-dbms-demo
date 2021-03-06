package com.janwee.web.rest;

import com.janwee.entity.AbstractEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.web.bind.annotation.*;

import java.lang.reflect.ParameterizedType;
import java.util.List;

public abstract class AbstractController<T extends AbstractEntity<ID>, ID> {
	@Autowired
	private JpaRepository<T, ID> jpaRepo;
	@SuppressWarnings("unchecked")
	private Class<T> domainType = (Class<T>) (((ParameterizedType) this.getClass().getGenericSuperclass())
			.getActualTypeArguments()[0]);

	@ResponseBody
	@PostMapping
	public T create(@RequestBody T entity) {
		return jpaRepo.save(entity);
	}

	@ResponseBody
	@DeleteMapping("/{id}")
	public void delete(@PathVariable(value = "id") ID id){
		jpaRepo.deleteById(id);
	}

	@ResponseBody
	@PutMapping
	public T update(@RequestBody T entity) {
		return jpaRepo.save(entity);
	}

	@ResponseBody
	@GetMapping
	public List<T> readAll() {
		return jpaRepo.findAll();
	}

	@GetMapping("/qbe")
	@ResponseBody
	public List<T> readAllByExample() throws Exception {
		T entity = domainType.getConstructor().newInstance();
		Example<T> example = Example.of(entity);
		return jpaRepo.findAll(example);
	}

	@ResponseBody
	@GetMapping("/{id}")
	public T readById(@PathVariable(value = "id") ID id) {
		return jpaRepo.findById(id).orElse(null);
	}
}
