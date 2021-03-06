/**
 * Copyright (c) 2000-2013 Liferay, Inc. All rights reserved.
 *
 * This library is free software; you can redistribute it and/or modify it under
 * the terms of the GNU Lesser General Public License as published by the Free
 * Software Foundation; either version 2.1 of the License, or (at your option)
 * any later version.
 *
 * This library is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS
 * FOR A PARTICULAR PURPOSE. See the GNU Lesser General Public License for more
 * details.
 */

package com.blogspot.chingovan.customquery.model.impl;

import com.blogspot.chingovan.customquery.model.Post;
import com.blogspot.chingovan.customquery.model.PostModel;
import com.blogspot.chingovan.customquery.model.PostSoap;

import com.liferay.portal.kernel.bean.AutoEscapeBeanHandler;
import com.liferay.portal.kernel.json.JSON;
import com.liferay.portal.kernel.util.GetterUtil;
import com.liferay.portal.kernel.util.ProxyUtil;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.model.CacheModel;
import com.liferay.portal.model.impl.BaseModelImpl;
import com.liferay.portal.service.ServiceContext;

import com.liferay.portlet.expando.model.ExpandoBridge;
import com.liferay.portlet.expando.util.ExpandoBridgeFactoryUtil;

import java.io.Serializable;

import java.sql.Types;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * The base model implementation for the Post service. Represents a row in the &quot;ExampleBlog_Post&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This implementation and its corresponding interface {@link com.blogspot.chingovan.customquery.model.PostModel} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link PostImpl}.
 * </p>
 *
 * @author chinv
 * @see PostImpl
 * @see com.blogspot.chingovan.customquery.model.Post
 * @see com.blogspot.chingovan.customquery.model.PostModel
 * @generated
 */
@JSON(strict = true)
public class PostModelImpl extends BaseModelImpl<Post> implements PostModel {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. All methods that expect a post model instance should use the {@link com.blogspot.chingovan.customquery.model.Post} interface instead.
	 */
	public static final String TABLE_NAME = "ExampleBlog_Post";
	public static final Object[][] TABLE_COLUMNS = {
			{ "PostId", Types.BIGINT },
			{ "Title", Types.VARCHAR },
			{ "Content", Types.VARCHAR },
			{ "AuthorId", Types.BIGINT }
		};
	public static final String TABLE_SQL_CREATE = "create table ExampleBlog_Post (PostId LONG not null primary key,Title VARCHAR(75) null,Content VARCHAR(75) null,AuthorId LONG)";
	public static final String TABLE_SQL_DROP = "drop table ExampleBlog_Post";
	public static final String ORDER_BY_JPQL = " ORDER BY post.postId ASC";
	public static final String ORDER_BY_SQL = " ORDER BY ExampleBlog_Post.PostId ASC";
	public static final String DATA_SOURCE = "liferayDataSource";
	public static final String SESSION_FACTORY = "liferaySessionFactory";
	public static final String TX_MANAGER = "liferayTransactionManager";
	public static final boolean ENTITY_CACHE_ENABLED = GetterUtil.getBoolean(com.liferay.util.service.ServiceProps.get(
				"value.object.entity.cache.enabled.com.blogspot.chingovan.customquery.model.Post"),
			true);
	public static final boolean FINDER_CACHE_ENABLED = GetterUtil.getBoolean(com.liferay.util.service.ServiceProps.get(
				"value.object.finder.cache.enabled.com.blogspot.chingovan.customquery.model.Post"),
			true);
	public static final boolean COLUMN_BITMASK_ENABLED = false;

	/**
	 * Converts the soap model instance into a normal model instance.
	 *
	 * @param soapModel the soap model instance to convert
	 * @return the normal model instance
	 */
	public static Post toModel(PostSoap soapModel) {
		if (soapModel == null) {
			return null;
		}

		Post model = new PostImpl();

		model.setPostId(soapModel.getPostId());
		model.setTitle(soapModel.getTitle());
		model.setContent(soapModel.getContent());
		model.setAuthorId(soapModel.getAuthorId());

		return model;
	}

	/**
	 * Converts the soap model instances into normal model instances.
	 *
	 * @param soapModels the soap model instances to convert
	 * @return the normal model instances
	 */
	public static List<Post> toModels(PostSoap[] soapModels) {
		if (soapModels == null) {
			return null;
		}

		List<Post> models = new ArrayList<Post>(soapModels.length);

		for (PostSoap soapModel : soapModels) {
			models.add(toModel(soapModel));
		}

		return models;
	}

	public static final long LOCK_EXPIRATION_TIME = GetterUtil.getLong(com.liferay.util.service.ServiceProps.get(
				"lock.expiration.time.com.blogspot.chingovan.customquery.model.Post"));

	public PostModelImpl() {
	}

	@Override
	public long getPrimaryKey() {
		return _postId;
	}

	@Override
	public void setPrimaryKey(long primaryKey) {
		setPostId(primaryKey);
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return _postId;
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		setPrimaryKey(((Long)primaryKeyObj).longValue());
	}

	@Override
	public Class<?> getModelClass() {
		return Post.class;
	}

	@Override
	public String getModelClassName() {
		return Post.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("postId", getPostId());
		attributes.put("title", getTitle());
		attributes.put("content", getContent());
		attributes.put("authorId", getAuthorId());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long postId = (Long)attributes.get("postId");

		if (postId != null) {
			setPostId(postId);
		}

		String title = (String)attributes.get("title");

		if (title != null) {
			setTitle(title);
		}

		String content = (String)attributes.get("content");

		if (content != null) {
			setContent(content);
		}

		Long authorId = (Long)attributes.get("authorId");

		if (authorId != null) {
			setAuthorId(authorId);
		}
	}

	@JSON
	@Override
	public long getPostId() {
		return _postId;
	}

	@Override
	public void setPostId(long postId) {
		_postId = postId;
	}

	@JSON
	@Override
	public String getTitle() {
		if (_title == null) {
			return StringPool.BLANK;
		}
		else {
			return _title;
		}
	}

	@Override
	public void setTitle(String title) {
		_title = title;
	}

	@JSON
	@Override
	public String getContent() {
		if (_content == null) {
			return StringPool.BLANK;
		}
		else {
			return _content;
		}
	}

	@Override
	public void setContent(String content) {
		_content = content;
	}

	@JSON
	@Override
	public long getAuthorId() {
		return _authorId;
	}

	@Override
	public void setAuthorId(long authorId) {
		_authorId = authorId;
	}

	@Override
	public ExpandoBridge getExpandoBridge() {
		return ExpandoBridgeFactoryUtil.getExpandoBridge(0,
			Post.class.getName(), getPrimaryKey());
	}

	@Override
	public void setExpandoBridgeAttributes(ServiceContext serviceContext) {
		ExpandoBridge expandoBridge = getExpandoBridge();

		expandoBridge.setAttributes(serviceContext);
	}

	@Override
	public Post toEscapedModel() {
		if (_escapedModel == null) {
			_escapedModel = (Post)ProxyUtil.newProxyInstance(_classLoader,
					_escapedModelInterfaces, new AutoEscapeBeanHandler(this));
		}

		return _escapedModel;
	}

	@Override
	public Object clone() {
		PostImpl postImpl = new PostImpl();

		postImpl.setPostId(getPostId());
		postImpl.setTitle(getTitle());
		postImpl.setContent(getContent());
		postImpl.setAuthorId(getAuthorId());

		postImpl.resetOriginalValues();

		return postImpl;
	}

	@Override
	public int compareTo(Post post) {
		long primaryKey = post.getPrimaryKey();

		if (getPrimaryKey() < primaryKey) {
			return -1;
		}
		else if (getPrimaryKey() > primaryKey) {
			return 1;
		}
		else {
			return 0;
		}
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof Post)) {
			return false;
		}

		Post post = (Post)obj;

		long primaryKey = post.getPrimaryKey();

		if (getPrimaryKey() == primaryKey) {
			return true;
		}
		else {
			return false;
		}
	}

	@Override
	public int hashCode() {
		return (int)getPrimaryKey();
	}

	@Override
	public void resetOriginalValues() {
	}

	@Override
	public CacheModel<Post> toCacheModel() {
		PostCacheModel postCacheModel = new PostCacheModel();

		postCacheModel.postId = getPostId();

		postCacheModel.title = getTitle();

		String title = postCacheModel.title;

		if ((title != null) && (title.length() == 0)) {
			postCacheModel.title = null;
		}

		postCacheModel.content = getContent();

		String content = postCacheModel.content;

		if ((content != null) && (content.length() == 0)) {
			postCacheModel.content = null;
		}

		postCacheModel.authorId = getAuthorId();

		return postCacheModel;
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(9);

		sb.append("{postId=");
		sb.append(getPostId());
		sb.append(", title=");
		sb.append(getTitle());
		sb.append(", content=");
		sb.append(getContent());
		sb.append(", authorId=");
		sb.append(getAuthorId());
		sb.append("}");

		return sb.toString();
	}

	@Override
	public String toXmlString() {
		StringBundler sb = new StringBundler(16);

		sb.append("<model><model-name>");
		sb.append("com.blogspot.chingovan.customquery.model.Post");
		sb.append("</model-name>");

		sb.append(
			"<column><column-name>postId</column-name><column-value><![CDATA[");
		sb.append(getPostId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>title</column-name><column-value><![CDATA[");
		sb.append(getTitle());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>content</column-name><column-value><![CDATA[");
		sb.append(getContent());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>authorId</column-name><column-value><![CDATA[");
		sb.append(getAuthorId());
		sb.append("]]></column-value></column>");

		sb.append("</model>");

		return sb.toString();
	}

	private static ClassLoader _classLoader = Post.class.getClassLoader();
	private static Class<?>[] _escapedModelInterfaces = new Class[] { Post.class };
	private long _postId;
	private String _title;
	private String _content;
	private long _authorId;
	private Post _escapedModel;
}