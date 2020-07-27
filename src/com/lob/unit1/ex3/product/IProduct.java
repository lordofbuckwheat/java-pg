package com.lob.unit1.ex3.product;

import com.lob.unit1.ex3.product.part.IProductPart;

public interface IProduct {

  void installFirstPart(IProductPart part);

  void installSecondPart(IProductPart part);

  void installThirdPart(IProductPart part);

}
