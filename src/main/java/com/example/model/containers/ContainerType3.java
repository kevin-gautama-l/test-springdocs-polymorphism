package com.example.model.containers;

import com.example.model.Container;
import io.swagger.v3.oas.annotations.media.Schema;

@Schema ( allOf = Container.class )
public class ContainerType3 extends Container
{
}
