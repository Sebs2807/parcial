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
		assertEquals(1,p.getCantidad());
	}

	@Test
	public void shouldIncreaseProduct(){
		Products p = new Products();
		p.setCantidad(1);
		p.setCategoria("categoria1");
		p.setIdProducto("id1");
		p.setNombreProducto("nombre1");
		p.setPrecioProducto(1);
		i.agregarProducto(p);
		i.agregarProducto(p);
		assertEquals(2,p.getCantidad());
	}

	@Test
	public void shouldModifyProduct(){
		Products p = new Products();
		p.setCantidad(1);
		p.setCategoria("categoria1");
		p.setIdProducto("id1");
		p.setNombreProducto("nombre1");
		p.setPrecioProducto(1);
		i.agregarProducto(p);
		i.modificarProducto(p.getNombreProducto(), 6);
		assertEquals(6,p.getCantidad());
	}

	@Test
	public void shouldInformSubscribers(){
		Products p = new Products();
		p.setCantidad(1);
		p.setCategoria("categoria1");
		p.setIdProducto("id1");
		p.setNombreProducto("nombre1");
		p.setPrecioProducto(1);
		i.agregarProducto(p);
		i.modificarProducto(p.getNombreProducto(), 6);

		for(Subscriber b : i.getSubscribers()){
			assertTrue(b.estaNotificado());
		}
	}
}
