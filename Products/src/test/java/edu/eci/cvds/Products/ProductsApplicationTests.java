package edu.eci.cvds.Products;

import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class ProductsApplicationTests {
	Inventario i;
	@BeforeEach
	void iniciacion() {
		i = new Inventario(new AgenteAdvertencia(),new AgenteLog());
	}
	
	@Test
	public void shouldAddProduct(){
		Products p = new Products();
		p.setCantidad(1);
		p.setCategoria("categoria1");
		p.setIdProducto("id1");
		p.setNombreProducto("nombre1");
		p.setPrecioProducto(1);
		i.agregarProducto(p);
		System.out.println(p.getCantidad());
		assertEquals(1,p.getCantidad());
		System.out.println(i.getProductos());
	}
}
