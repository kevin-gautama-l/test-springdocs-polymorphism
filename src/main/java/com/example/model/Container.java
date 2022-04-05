package com.example.model;

import com.example.model.containers.ContainerType1;
import com.example.model.containers.ContainerType2;
import com.example.model.containers.ContainerType3;
import io.swagger.v3.oas.annotations.media.DiscriminatorMapping;
import io.swagger.v3.oas.annotations.media.Schema;

import java.util.List;

@Schema(
        allOf = Node.class,
        subTypes = {
                ContainerType1.class,
                ContainerType2.class,
                ContainerType3.class,
        },
        discriminatorProperty = "className",
        discriminatorMapping = {
                @DiscriminatorMapping (value = "ContainerType1", schema = ContainerType1.class),
                @DiscriminatorMapping (value = "ContainerType2", schema = ContainerType2.class),
                @DiscriminatorMapping (value = "ContainerType3", schema = ContainerType3.class),
        }
)
public abstract class Container extends Node
{
    private List<Node> childNodes;

    public List<Node> getChildNodes() {return childNodes;}

    public void setChildNodes( List<Node> childNodes ) {this.childNodes = childNodes;}
}
