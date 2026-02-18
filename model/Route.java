
package model;

public class Route {
    private int routeId;
    private String routeName;
    private String source;
    private String destination;

    public Route(int routeId, String routeName, String source, String destination) {
        this.routeId = routeId;
        this.routeName = routeName;
        this.source = source;
        this.destination = destination;
    }

    public int getRouteId() {
        return routeId;
    }
}
