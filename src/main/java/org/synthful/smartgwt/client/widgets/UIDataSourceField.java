package org.synthful.smartgwt.client.widgets;

import java.util.Date;
import java.util.Map;

import org.synthful.smartgwt.client.UIMasquerade;

import com.google.gwt.core.client.JavaScriptObject;
import com.google.gwt.event.shared.GwtEvent;
import com.google.gwt.event.shared.GwtEvent.Type;
import com.google.gwt.user.client.ui.HasText;
import com.google.gwt.user.client.ui.Widget;
import com.smartgwt.client.core.BaseClass;
import com.smartgwt.client.core.DataClass;
import com.smartgwt.client.data.DataSource;
import com.smartgwt.client.data.DataSourceField;
import com.smartgwt.client.data.FieldValueExtractor;
import com.smartgwt.client.data.Record;
import com.smartgwt.client.data.SimpleType;
import com.smartgwt.client.types.DateDisplayFormat;
import com.smartgwt.client.types.FieldType;
import com.smartgwt.client.types.OperatorId;
import com.smartgwt.client.types.SummaryFunctionType;
import com.smartgwt.client.types.TimeDisplayFormat;
import com.smartgwt.client.types.ValueEnum;
import com.smartgwt.client.widgets.BaseWidget;
import com.smartgwt.client.widgets.form.fields.FormItem;
import com.smartgwt.client.widgets.form.validator.Validator;
import com.smartgwt.client.widgets.grid.SummaryFunction;

public class UIDataSourceField
extends Widget
implements UIMasquerade<DataSourceField>, HasText
{
	protected DataSourceField field;
	protected FieldType type;

	public UIDataSourceField() {
		field = new DataSourceField();
	}

	public UIDataSourceField(DataSourceField field) {
		this.field = field;
	}

	protected UIDataSourceField(FieldType type) {
		field = new DataSourceField();
		setType(type);
	}

	public JavaScriptObject getJsObj() {
		return field.getJsObj();
	}

	public void setAttribute(String property, String value) {
		field.setAttribute(property, value);
	}

	public String getAttribute(String property) {
		return field.getAttribute(property);
	}

	public String getAttributeAsString(String property) {
		return field.getAttributeAsString(property);
	}

	public void setAttribute(String property, int value) {
		field.setAttribute(property, value);
	}

	public void setAttribute(String property, double value) {
		field.setAttribute(property, value);
	}

	public Integer getAttributeAsInt(String property) {
		return field.getAttributeAsInt(property);
	}

	public void setAttribute(String property, boolean value) {
		field.setAttribute(property, value);
	}

	public Boolean getAttributeAsBoolean(String property) {
		return field.getAttributeAsBoolean(property);
	}

	@Override
	public int hashCode() {
		return field.hashCode();
	}

	public Double getAttributeAsDouble(String property) {
		return field.getAttributeAsDouble(property);
	}

	public void setAttribute(String property, int[] value) {
		field.setAttribute(property, value);
	}

	public void setAttribute(String property, DataClass[] value) {
		field.setAttribute(property, value);
	}

	public void setAttribute(String property, BaseClass[] value) {
		field.setAttribute(property, value);
	}

	public void setAttribute(String property, BaseWidget[] value) {
		field.setAttribute(property, value);
	}

	public void setCanEdit(Boolean canEdit) {
		field.setCanEdit(canEdit);
	}

	public int[] getAttributeAsIntArray(String property) {
		return field.getAttributeAsIntArray(property);
	}

	public void setAttribute(String property, String[] value) {
		field.setAttribute(property, value);
	}

	public String[] getAttributeAsStringArray(String property) {
		return field.getAttributeAsStringArray(property);
	}

	public void setAttribute(String property, DataClass value) {
		field.setAttribute(property, value);
	}

	public Boolean getCanEdit() {
		return field.getCanEdit();
	}

	public void setAttribute(String property, BaseClass value) {
		field.setAttribute(property, value);
	}

	public void setAttribute(String property, JavaScriptObject value) {
		field.setAttribute(property, value);
	}

	public void setAttribute(String property, Date value) {
		field.setAttribute(property, value);
	}

	public void setCanExport(Boolean canExport) {
		field.setCanExport(canExport);
	}

	public void setAttribute(String property, Boolean value) {
		field.setAttribute(property, value);
	}

	public void setAttribute(String property, Map<?,?> value) {
		field.setAttribute(property, value);
	}

	@Override
	public boolean equals(Object obj) {
		return field.equals(obj);
	}

	public void setAttribute(String property, ValueEnum[] value) {
		field.setAttribute(property, value);
	}

	public Boolean getCanExport() {
		return field.getCanExport();
	}

	public void setAttribute(String property, ValueEnum value) {
		field.setAttribute(property, value);
	}

	public void setAttribute(String property, Object value) {
		field.setAttribute(property, value);
	}

	public void setAttribute(String property, Double value) {
		field.setAttribute(property, value);
	}

	public void setCanFilter(Boolean canFilter) {
		field.setCanFilter(canFilter);
	}

	public void setAttribute(String property, Integer value) {
		field.setAttribute(property, value);
	}

	public void setAttribute(String property, Float value) {
		field.setAttribute(property, value);
	}

	public Float getAttributeAsFloat(String property) {
		return field.getAttributeAsFloat(property);
	}

	public Boolean getCanFilter() {
		return field.getCanFilter();
	}

	public Date getAttributeAsDate(String property) {
		return field.getAttributeAsDate(property);
	}

	public Object getAttributeAsObject(String property) {
		return field.getAttributeAsObject(property);
	}

	public Map<?,?> getAttributeAsMap(String property) {
		return field.getAttributeAsMap(property);
	}

	public void setCanSave(Boolean canSave) {
		field.setCanSave(canSave);
	}

	public JavaScriptObject getAttributeAsJavaScriptObject(String property) {
		return field.getAttributeAsJavaScriptObject(property);
	}

	public String[] getAttributes() {
		return field.getAttributes();
	}

	@Override
	public void fireEvent(GwtEvent<?> event) {
		field.fireEvent(event);
	}

	public Boolean getCanSave() {
		return field.getCanSave();
	}

	@Override
	public int getHandlerCount(Type<?> type) {
		return field.getHandlerCount(type);
	}

	public void setJsObj(JavaScriptObject jsObj) {
		field.setJsObj(jsObj);
	}

	public void setCanSortClientOnly(Boolean canSortClientOnly) {
		field.setCanSortClientOnly(canSortClientOnly);
	}

	public void setChildrenProperty(Boolean childrenProperty) {
		field.setChildrenProperty(childrenProperty);
	}

	public Boolean getChildrenProperty() {
		return field.getChildrenProperty();
	}

	public void setChildTagName(String childTagName) {
		field.setChildTagName(childTagName);
	}

	@Override
	public String toString() {
		return field.toString();
	}

	public String getChildTagName() {
		return field.getChildTagName();
	}

	public void setDetail(Boolean detail) {
		field.setDetail(detail);
	}

	public void setExportTitle(String exportTitle) {
		field.setExportTitle(exportTitle);
	}

	public String getExportTitle() {
		return field.getExportTitle();
	}

	public void setForeignKey(String foreignKey) {
		field.setForeignKey(foreignKey);
	}

	public String getForeignKey() {
		return field.getForeignKey();
	}

	public void setGroup(String group) {
		field.setGroup(group);
	}

	public String getGroup() {
		return field.getGroup();
	}

	public void setHidden(Boolean hidden) {
		field.setHidden(hidden);
	}

	public void setInapplicable(Boolean inapplicable) {
		field.setInapplicable(inapplicable);
	}

	public Boolean getInapplicable() {
		return field.getInapplicable();
	}


	public void setLength(Integer length) {
		field.setLength(length);
	}

	public Integer getLength() {
		return field.getLength();
	}

//	public void setMaxFileSize(Integer maxFileSize) {
//		field.setMaxFileSize(maxFileSize);
//	}
//
//	public Integer getMaxFileSize() {
//		return field.getMaxFileSize();
//	}

	public void setMultiple(Boolean multiple) {
		field.setMultiple(multiple);
	}

	public Boolean getMultiple() {
		return field.getMultiple();
	}

	public void setName(String name) {
		field.setName(name);
	}

	public String getName() {
		return field.getName();
	}

	public void setPrimaryKey(Boolean primaryKey) {
		field.setPrimaryKey(primaryKey);
	}

	public void setPropertiesOnly(Boolean propertiesOnly) {
		field.setPropertiesOnly(propertiesOnly);
	}

	public Boolean getPropertiesOnly() {
		return field.getPropertiesOnly();
	}

	public void setRequired(Boolean required) {
		field.setRequired(required);
	}

	public Boolean getRequired() {
		return field.getRequired();
	}

	public void setSequenceName(String sequenceName) {
		field.setSequenceName(sequenceName);
	}

	public String getSequenceName() {
		return field.getSequenceName();
	}

	public void setShowFileInline(Boolean showFileInline) {
		field.setShowFileInline(showFileInline);
	}

	public Boolean getShowFileInline() {
		return field.getShowFileInline();
	}

//	public void setStoreWithHash(HashAlgorithm storeWithHash) {
//		field.setStoreWithHash(storeWithHash);
//	}
//
//	public HashAlgorithm getStoreWithHash() {
//		return field.getStoreWithHash();
//	}

	@Override
	public void setTitle(String title) {
		field.setTitle(title);
	}

	@Override
	public String getTitle() {
		return field.getTitle();
	}

	public void setType(FieldType type) {
		field.setType(type);
	}

	public FieldType getType() {
		return field.getType();
	}

	public void setValueXPath(String valueXPath) {
		field.setValueXPath(valueXPath);
	}

	public String getValueXPath() {
		return field.getValueXPath();
	}

	public void setXmlAttribute(Boolean xmlAttribute) {
		field.setXmlAttribute(xmlAttribute);
	}

	public Boolean getXmlAttribute() {
		return field.getXmlAttribute();
	}

	public void setPluralTitle(String pluralTitle) {
		field.setPluralTitle(pluralTitle);
	}

	public String getPluralTitle() {
		return field.getPluralTitle();
	}

	public void setType(SimpleType type) {
		field.setType(type);
	}

	public void setValidators(Validator... validators) {
		field.setValidators(validators);
	}

	public void setValueMap(String... valueMap) {
		field.setValueMap(valueMap);
	}

	public void setValueMap(Map<?,?> valueMap) {
		field.setValueMap(valueMap);
	}

	public void setEditorType(FormItem editorType) {
		field.setEditorType(editorType);
	}

	public void setRootValue(String rootValue) {
		field.setRootValue(rootValue);
	}

	public void setRootValue(Integer rootValue) {
		field.setRootValue(rootValue);
	}

	public void setRootValue(Float rootValue) {
		field.setRootValue(rootValue);
	}

	public void setValidOperators(OperatorId... operators) {
		field.setValidOperators(operators);
	}

	public void setFieldValueExtractor(FieldValueExtractor extractor) {
		field.setFieldValueExtractor(extractor);
	}

	@Deprecated
	public void setType(DataSource dataSource) {
		field.setType(dataSource);
	}

	public void setTypeAsDataSource(DataSource dataSource) {
		field.setTypeAsDataSource(dataSource);
	}

	public DataSource getTypeAsDataSource() {
		return field.getTypeAsDataSource();
	}

	public void setSummaryFunction(SummaryFunctionType summaryFunction) {
		field.setSummaryFunction(summaryFunction);
	}

	public SummaryFunctionType getSummaryFunction() {
		return field.getSummaryFunction();
	}

	public void setSummaryFunction(SummaryFunction summaryFunction) {
		field.setSummaryFunction(summaryFunction);
	}

	@Override
	public DataSourceField getSmartObject() {
		return field;
	}

	@Override
	public String getText() {
		return field.getTitle();
	}

	@Override
	public void setText(String title) {
		field.setTitle(title);
	}

	public void setAttribute(String property, long value) {
		field.setAttribute(property, value);
	}

	public Long getAttributeAsLong(String property) {
		return field.getAttributeAsLong(property);
	}

	public double[] getAttributeAsDoubleArray(String property) {
		return field.getAttributeAsDoubleArray(property);
	}

	public void setAttribute(String property, Integer[] value) {
		field.setAttribute(property, value);
	}

	public void setAttribute(String property, double[] value) {
		field.setAttribute(property, value);
	}

	public Record getAttributeAsRecord(String property) {
		return field.getAttributeAsRecord(property);
	}

	public void setCanView(Boolean canView) {
		field.setCanView(canView);
	}

	public Boolean getCanView() {
		return field.getCanView();
	}

	public void setDateFormatter(DateDisplayFormat dateFormatter) {
		field.setDateFormatter(dateFormatter);
	}

	public DateDisplayFormat getDateFormatter() {
		return field.getDateFormatter();
	}

	public void setEscapeHTML(Boolean escapeHTML) {
		field.setEscapeHTML(escapeHTML);
	}

	public Boolean getEscapeHTML() {
		return field.getEscapeHTML();
	}

//	public void setIncludeFrom(String includeFrom) {
//		field.setIncludeFrom(includeFrom);
//	}
//
//	public String getIncludeFrom() {
//		return field.getIncludeFrom();
//	}

	public void setRootValue(Object rootValue) {
		field.setRootValue(rootValue);
	}

	public Object getRootValue() {
		return field.getRootValue();
	}

	public void setSummaryValueTitle(String summaryValueTitle) {
		field.setSummaryValueTitle(summaryValueTitle);
	}

	public String getSummaryValueTitle() {
		return field.getSummaryValueTitle();
	}

	public void setTimeFormatter(TimeDisplayFormat timeFormatter) {
		field.setTimeFormatter(timeFormatter);
	}

	public TimeDisplayFormat getTimeFormatter() {
		return field.getTimeFormatter();
	}

	public Validator[] getValidators() {
		return field.getValidators();
	}

	public OperatorId[] getValidOperators() {
		return field.getValidOperators();
	}

	public Map getValueMap() {
		return field.getValueMap();
	}

	public void setReadOnlyEditorType(FormItem editorType) {
		field.setReadOnlyEditorType(editorType);
	}

	public void setSummaryFunction(String summaryFunction) {
		field.setSummaryFunction(summaryFunction);
	}

	public void setImageHeight(Integer imageHeight) {
		field.setImageHeight(imageHeight);
	}

	public Integer getImageHeight() {
		return field.getImageHeight();
	}

	public void setImageHeight(String imageHeight) {
		field.setImageHeight(imageHeight);
	}

	public String getImageHeightAsString() {
		return field.getImageHeightAsString();
	}

	public void setImageSize(Integer imageSize) {
		field.setImageSize(imageSize);
	}

	public Integer getImageSize() {
		return field.getImageSize();
	}

	public void setImageSize(String imageSize) {
		field.setImageSize(imageSize);
	}

	public String getImageSizeAsString() {
		return field.getImageSizeAsString();
	}

	public void setImageWidth(Integer imageWidth) {
		field.setImageWidth(imageWidth);
	}

	public Integer getImageWidth() {
		return field.getImageWidth();
	}

	public void setImageWidth(String imageWidth) {
		field.setImageWidth(imageWidth);
	}

	public String getImageWidthAsString() {
		return field.getImageWidthAsString();
	}

	public void setPrompt(String prompt) {
		field.setPrompt(prompt);
	}

	public String getPrompt() {
		return field.getPrompt();
	}

	public final void setJavaScriptObject(JavaScriptObject jsObj) {
		field.setJavaScriptObject(jsObj);
	}

	public void setCanSortClientOnly(boolean canSortClientOnly) {
		field.setCanSortClientOnly(canSortClientOnly);
	}

	public boolean getCanSortClientOnly() {
		return field.getCanSortClientOnly();
	}

	public void setAttributeAsJavaObject(String property, Object value) {
		field.setAttributeAsJavaObject(property, value);
	}

	public void setDecimalPad(Integer decimalPad) {
		field.setDecimalPad(decimalPad);
	}

	public Integer getDecimalPad() {
		return field.getDecimalPad();
	}

	public void setDecimalPrecision(Integer decimalPrecision) {
		field.setDecimalPrecision(decimalPrecision);
	}

	public Integer getDecimalPrecision() {
		return field.getDecimalPrecision();
	}

	public void setDetail(boolean detail) {
		field.setDetail(detail);
	}

	public boolean getDetail() {
		return field.getDetail();
	}

	public void setDisplayField(String displayField) {
		field.setDisplayField(displayField);
	}

	public String getDisplayField() {
		return field.getDisplayField();
	}

	public void setEmptyDisplayValue(String emptyDisplayValue) {
		field.setEmptyDisplayValue(emptyDisplayValue);
	}

	public String getEmptyDisplayValue() {
		return field.getEmptyDisplayValue();
	}

	public void setExportFormat(String exportFormat) {
		field.setExportFormat(exportFormat);
	}

	public String getExportFormat() {
		return field.getExportFormat();
	}

	public void setFormat(String format) {
		field.setFormat(format);
	}

	public String getFormat() {
		return field.getFormat();
	}

	public void setHidden(boolean hidden) {
		field.setHidden(hidden);
	}

	public boolean getHidden() {
		return field.getHidden();
	}

	public void setIgnoreTextMatchStyle(Boolean ignoreTextMatchStyle) {
		field.setIgnoreTextMatchStyle(ignoreTextMatchStyle);
	}

	public Boolean getIgnoreTextMatchStyle() {
		return field.getIgnoreTextMatchStyle();
	}

	public void setLenientXPath(Boolean lenientXPath) {
		field.setLenientXPath(lenientXPath);
	}

	public Boolean getLenientXPath() {
		return field.getLenientXPath();
	}

	public void setMultipleValueSeparator(String multipleValueSeparator) {
		field.setMultipleValueSeparator(multipleValueSeparator);
	}

	public String getMultipleValueSeparator() {
		return field.getMultipleValueSeparator();
	}

	public void setNillable(Boolean nillable) {
		field.setNillable(nillable);
	}

	public Boolean getNillable() {
		return field.getNillable();
	}

	public void setPrecision(Integer precision) {
		field.setPrecision(precision);
	}

	public Integer getPrecision() {
		return field.getPrecision();
	}

	public void setPrimaryKey(boolean primaryKey) {
		field.setPrimaryKey(primaryKey);
	}

	public boolean getPrimaryKey() {
		return field.getPrimaryKey();
	}

	public void setUploadFieldName(String uploadFieldName) {
		field.setUploadFieldName(uploadFieldName);
	}

	public String getUploadFieldName() {
		return field.getUploadFieldName();
	}

	public void setEditorProperties(FormItem editorProperties) {
		field.setEditorProperties(editorProperties);
	}

	public void setEditorType(String editorType) {
		field.setEditorType(editorType);
	}

	public void setEditorType(Class<? extends FormItem> editorType) {
		field.setEditorType(editorType);
	}

	public void setReadOnlyEditorProperties(FormItem editorProperties) {
		field.setReadOnlyEditorProperties(editorProperties);
	}

	public void setReadOnlyEditorType(String editorType) {
		field.setReadOnlyEditorType(editorType);
	}

	public void setReadOnlyEditorType(Class<? extends FormItem> editorType) {
		field.setReadOnlyEditorType(editorType);
	}

	public SimpleType getTypeAsSimpleType() {
		return field.getTypeAsSimpleType();
	}

}
