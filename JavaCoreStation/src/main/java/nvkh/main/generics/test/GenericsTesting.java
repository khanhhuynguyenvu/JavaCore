package nvkh.main.generics.test;


import nvkh.main.generics.generics_interface.interfaces.IntefImpl;
import nvkh.main.generics.generics_interface.interfaces.Interf;
import nvkh.main.generics.generics_interface.interfaces.Model_One_Interf;
import nvkh.main.generics.generics_interface.interfaces.Model_One_Interf_Impl;
import nvkh.main.generics.generics_interface.model.ModelOne;
import org.junit.Test;

import static org.junit.Assert.assertNotNull;

public class GenericsTesting {
	@Test
	public void Test_Generics_Interface_1() {
		ModelOne model_1 = new ModelOne(1, "Model number one");
		Interf<ModelOne> call = new IntefImpl<ModelOne>();
		assertNotNull(call.getClassInfo(model_1));
	}
	@Test
	public void Test_Generics_Child_Interface_1() {
		ModelOne model_2 = new ModelOne(2, "Model number two");
		Model_One_Interf callFromChildInterface = new Model_One_Interf_Impl();
		assertNotNull(callFromChildInterface.getClassInfo(model_2));
	}
}
