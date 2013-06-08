import java.util.Collection;
import java.util.Set;

import org.jgrapht.DirectedGraph;
import org.jgrapht.EdgeFactory;
import org.jgrapht.graph.SimpleDirectedGraph;

import teo.isgci.gc.GraphClass;
import teo.isgci.grapht.*;

import com.mxgraph.model.mxGeometry;
import com.mxgraph.model.mxICell;
import com.mxgraph.view.mxGraph;

public class ISGCImxCell extends GraphClass implements mxICell {

    public Object clone() throws CloneNotSupportedException {
        throw new CloneNotSupportedException();
    }

    @Override
    public mxICell getChildAt(int arg0) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public int getChildCount() {
        // TODO Auto-generated method stub
        return 0;
    }

    @Override
    public mxICell getEdgeAt(int arg0) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public int getEdgeCount() {
        // TODO Auto-generated method stub
        return 0;
    }

    @Override
    public int getEdgeIndex(mxICell arg0) {
        // TODO Auto-generated method stub
        return 0;
    }

    @Override
    public mxGeometry getGeometry() {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public String getId() {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public int getIndex(mxICell arg0) {
        // TODO Auto-generated method stub
        return 0;
    }

    @Override
    public mxICell getParent() {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public String getStyle() {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public mxICell getTerminal(boolean arg0) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public Object getValue() {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public mxICell insert(mxICell arg0) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public mxICell insert(mxICell arg0, int arg1) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public mxICell insertEdge(mxICell arg0, boolean arg1) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public boolean isCollapsed() {
        // TODO Auto-generated method stub
        return false;
    }

    @Override
    public boolean isConnectable() {
        // TODO Auto-generated method stub
        return false;
    }

    @Override
    public boolean isEdge() {
        // TODO Auto-generated method stub
        return false;
    }

    @Override
    public boolean isVertex() {
        // TODO Auto-generated method stub
        return false;
    }

    @Override
    public boolean isVisible() {
        // TODO Auto-generated method stub
        return false;
    }

    @Override
    public mxICell remove(int arg0) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public mxICell remove(mxICell arg0) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public mxICell removeEdge(mxICell arg0, boolean arg1) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public void removeFromParent() {
        // TODO Auto-generated method stub

    }

    @Override
    public void removeFromTerminal(boolean arg0) {
        // TODO Auto-generated method stub

    }

    @Override
    public void setCollapsed(boolean arg0) {
        // TODO Auto-generated method stub

    }

    @Override
    public void setGeometry(mxGeometry arg0) {
        // TODO Auto-generated method stub

    }

    @Override
    public void setId(String arg0) {
        // TODO Auto-generated method stub

    }

    @Override
    public void setParent(mxICell arg0) {
        // TODO Auto-generated method stub

    }

    @Override
    public void setStyle(String arg0) {
        // TODO Auto-generated method stub

    }

    @Override
    public mxICell setTerminal(mxICell arg0, boolean arg1) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public void setValue(Object arg0) {
        // TODO Auto-generated method stub

    }

    @Override
    public void setVisible(boolean arg0) {
        // TODO Auto-generated method stub

    }

    @Override
    public void setName() {
        // TODO Auto-generated method stub

    }

    @Override
    public boolean equals(Object obj) {
        // TODO Auto-generated method stub
        return false;
    }

    @Override
    protected int calcHash() {
        // TODO Auto-generated method stub
        return 0;
    }

}