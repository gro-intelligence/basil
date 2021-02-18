package io.github.basilapi.basil.alias;

public interface AliasCache {

	void set(String id, String alias);

	boolean containsAlias(String alias);

	String getId(String alias);

	void removeAll(String id);

}