package com.example.model.nodes;

import com.example.model.Node;
import io.swagger.v3.oas.annotations.media.Schema;

@Schema ( allOf = Node.class )
public class NodeType3 extends Node
{
}
