package webcontentlistener.api;

import org.osgi.service.component.annotations.Component;

import com.liferay.blogs.model.BlogsEntry;
import com.liferay.portal.kernel.exception.ModelListenerException;
import com.liferay.portal.kernel.model.BaseModelListener;
import com.liferay.portal.kernel.model.ModelListener;

@Component(immediate = true, service = ModelListener.class)

public class BlogListener extends BaseModelListener<BlogsEntry>{

	@Override
	public void onAfterCreate(BlogsEntry model) throws ModelListenerException {

		
		System.out.println("informacion que se ha creado del blog "+model.getContent().toString());
		
		
		super.onAfterCreate(model);

	
	
	
	}

	@Override
	public void onAfterUpdate(BlogsEntry originalModel, BlogsEntry model) throws ModelListenerException {

		
		System.out.println("updating el blog  "+model.getContent().toString());
		
		super.onAfterUpdate(originalModel, model);
	}
	
	
	
	
	
	
	
	

}
