package com.rodrigo.land.route.service;

import com.rodrigo.land.route.api.routing.model.Route;

public interface RoutingService {

	Route route(String origin, String destination);
}
