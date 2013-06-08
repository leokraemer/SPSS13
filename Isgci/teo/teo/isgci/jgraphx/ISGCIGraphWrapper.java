package teo.isgci.jgraphx;

import java.util.Collection;
import java.util.Set;

import org.jgrapht.DirectedGraph;
import org.jgrapht.EdgeFactory;

public class ISGCIGraphWrapper<V, E> implements DirectedGraph<V, E> {

    // the mxGraph for drawing and storing the nodes and edges
    private ISGCIGraph graph;

    @Override
    public E addEdge(V arg0, V arg1) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public boolean addEdge(V arg0, V arg1, E arg2) {
        // TODO Auto-generated method stub
        return false;
    }

    @Override
    public boolean addVertex(V arg0) {
        // TODO Auto-generated method stub
        return false;
    }

    @Override
    public boolean containsEdge(E arg0) {
        // TODO Auto-generated method stub
        return false;
    }

    @Override
    public boolean containsEdge(V arg0, V arg1) {
        // TODO Auto-generated method stub
        return false;
    }

    @Override
    public boolean containsVertex(V arg0) {
        // TODO Auto-generated method stub
        return false;
    }

    @Override
    public Set<E> edgeSet() {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public Set<E> edgesOf(V arg0) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public Set<E> getAllEdges(V arg0, V arg1) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public E getEdge(V arg0, V arg1) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public EdgeFactory<V, E> getEdgeFactory() {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public V getEdgeSource(E arg0) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public V getEdgeTarget(E arg0) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public double getEdgeWeight(E arg0) {
        // TODO Auto-generated method stub
        return 0;
    }

    @Override
    public boolean removeAllEdges(Collection<? extends E> arg0) {
        // TODO Auto-generated method stub
        return false;
    }

    @Override
    public Set<E> removeAllEdges(V arg0, V arg1) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public boolean removeAllVertices(Collection<? extends V> arg0) {
        // TODO Auto-generated method stub
        return false;
    }

    @Override
    public boolean removeEdge(E arg0) {
        // TODO Auto-generated method stub
        return false;
    }

    @Override
    public E removeEdge(V arg0, V arg1) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public boolean removeVertex(V arg0) {
        // TODO Auto-generated method stub
        return false;
    }

    @Override
    public Set<V> vertexSet() {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public int inDegreeOf(V arg0) {
        // TODO Auto-generated method stub
        return 0;
    }

    @Override
    public Set<E> incomingEdgesOf(V arg0) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public int outDegreeOf(V arg0) {
        // TODO Auto-generated method stub
        return 0;
    }

    @Override
    public Set<E> outgoingEdgesOf(V arg0) {
        // TODO Auto-generated method stub
        return null;
    }

}
