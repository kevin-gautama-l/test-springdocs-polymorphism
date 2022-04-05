package com.example.model;

import com.example.model.nodes.NodeType1;
import com.example.model.nodes.NodeType2;
import com.example.model.nodes.NodeType3;
import io.swagger.v3.oas.annotations.media.DiscriminatorMapping;
import io.swagger.v3.oas.annotations.media.Schema;

@Schema (
        subTypes = {
                Container.class,
                NodeType1.class,
                NodeType2.class,
                NodeType3.class,
        },
        discriminatorProperty = "className",
        discriminatorMapping = {
                @DiscriminatorMapping (value = "NodeContainer", schema = Container.class),
                @DiscriminatorMapping (value = "NodeType1", schema = NodeType1.class),
                @DiscriminatorMapping (value = "NodeType2", schema = NodeType2.class),
                @DiscriminatorMapping (value = "NodeType3", schema = NodeType3.class),
        }
)
public abstract class Node
{
    private String nodeType;

    public String getNodeType() {return nodeType;}

    public void setNodeType( String nodeType ) {this.nodeType = nodeType;}
}
