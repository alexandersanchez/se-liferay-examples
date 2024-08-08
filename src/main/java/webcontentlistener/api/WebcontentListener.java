package webcontentlistener.api;
import com.liferay.journal.model.JournalArticle;
import com.liferay.portal.kernel.exception.ModelListenerException;
import com.liferay.portal.kernel.model.BaseModelListener;
import com.liferay.portal.kernel.model.ModelListener;
import com.liferay.journal.service.JournalArticleLocalServiceUtil;

import java.util.List;

import org.osgi.service.component.annotations.Component;


/**
 * @author soyalexander
 * 
 */
@Component(immediate = true, service = ModelListener.class)

public class WebcontentListener extends BaseModelListener<JournalArticle> {
	

	@Override
	public void onAfterCreate(JournalArticle model) throws ModelListenerException {
		
		System.out.println("lo que tiene el getContent "+model.getContent());

	
		
		
	}


		
	
	
}