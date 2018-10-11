package uk.ac.open.kmi.basil.store;

import java.io.IOException;
import java.util.Date;
import java.util.List;
import java.util.Set;

import uk.ac.open.kmi.basil.core.ApiInfo;
import uk.ac.open.kmi.basil.doc.Doc;
import uk.ac.open.kmi.basil.sparql.Specification;
import uk.ac.open.kmi.basil.view.Views;

public interface Store {

	void saveSpec(String id, Specification spec) throws IOException;

	Specification loadSpec(String id) throws IOException;

	boolean existsSpec(String id);

	List<String> listSpecs() throws IOException;

	List<ApiInfo> list() throws IOException;

	Views loadViews(String id) throws IOException;

	Doc loadDoc(String id) throws IOException;

	void saveViews(String id, Views views) throws IOException;

	void saveDoc(String id, Doc doc) throws IOException;

	boolean deleteDoc(String id) throws IOException;

	boolean deleteSpec(String id) throws IOException;

	Date created(String id) throws IOException;

	Date modified(String id) throws IOException;

	ApiInfo info(String id) throws IOException;

	/**
	 * @since 0.5.0
	 * @param id
	 * @param alias
	 */
	void saveAlias(String id, Set<String> alias) throws IOException;

	/**
	 * @since 0.5.0
	 * @param id
	 * @return
	 */
	Set<String> loadAlias(String id) throws IOException;

	/**
	 * @since 0.5.0
	 * @param id
	 * @return
	 */
	String getIdByAlias(String alias) throws IOException;
}
