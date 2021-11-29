package com.rodrigo.land.route.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.rodrigo.land.route.client.mledoze.CountryClient;
import com.rodrigo.land.route.data.Country;
import com.rodrigo.land.route.mapper.CountryMapper;

import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor
public class CountryServiceImpl implements CountryService {

	private final CountryClient countryClient;
	private final CountryMapper countryMapper;

	@Override
	public List<Country> countries() {
		var countryDtoList = countryClient.countries();
		return countryMapper.fromDto(countryDtoList);
	}
}
