package teo.isgci.jgraphx;

import com.mxgraph.view.mxGraph;
/**
 * A SimpleDirected-mxGraph implementation
 * @author leo
 *
 */
public class ISGCIGraph extends mxGraph {
/**
 * creates a new mxGraph with no loops and multiedges
 */
    ISGCIGraph(){
        super();
        this.setAllowLoops(false);
        this.setMultigraph(false);
    }
}
