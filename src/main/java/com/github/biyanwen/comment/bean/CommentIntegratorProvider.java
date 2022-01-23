package com.github.biyanwen.comment.bean;

import org.hibernate.integrator.spi.Integrator;
import org.hibernate.jpa.boot.spi.IntegratorProvider;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author byw
 * @Date 2021/12/13 15:40
 */
public class CommentIntegratorProvider implements IntegratorProvider {
	@Override
	public List<Integrator> getIntegrators() {
		List<Integrator> list = new ArrayList<>();
		list.add(new CommentIntegrator());
		return list;
	}
}
