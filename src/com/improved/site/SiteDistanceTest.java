package com.improved.site;

public class SiteDistanceTest {

	public SiteDistanceTest() {
	}

	public static void main(String[] args) {

		Site sfo = new Site("San Francisco");
		Site la = new Site("Los Angeles");

		SiteManager citymng = new SiteManager();
		citymng.add(sfo, la, 650);

		try {
			Integer dist1 = citymng.getDistance(sfo, la);
			System.out.println(dist1);

			Integer dist2 = citymng.getDistance(la, sfo);
			System.out.println(dist2);

			Integer dist3 = citymng.getDistance(new Site("Chicago"), sfo);
			System.out.println(dist3);
		} catch (DistanceNotExistException e) {
			System.out.println("Not found");
		}

	}

}
