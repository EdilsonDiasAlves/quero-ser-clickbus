package com.places.manager.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.places.manager.model.Place;

@Service
public interface PlacesService {

	public List<Place> listPlaces();

	Boolean savePlace(Place place);
}
