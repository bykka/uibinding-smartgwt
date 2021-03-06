package org.synthful.smartgwt.client.util;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;

import com.smartgwt.client.widgets.form.fields.SelectItem;

public class SelectItemEnhanced extends SelectItem{

	@SuppressWarnings("unchecked")
	private List valuesList;
	
	private boolean markIfUnique=false;
	
	@SuppressWarnings("unchecked")
	public void setValues(Enum... emuns) {
		setValues((Object[])emuns);
	}
	
	@SuppressWarnings("unchecked")
	public void setValues(Object... values) {
		List objects = new ArrayList();
		for(Object o : values) {
			objects.add(o);
		}
		setValues(objects);
	}
	
	@SuppressWarnings("unchecked")
	public void setValues(List values) {
		this.valuesList = new ArrayList();
		if(getAllowEmptyValue()!=null && getAllowEmptyValue()) {
			valuesList.add(null);
		}
		for(Object obj : values) {
			valuesList.add( obj );
		}
		LinkedHashMap<String, String> innerValues = new LinkedHashMap<String, String>();
		for(int i=0; i < valuesList.size(); i++) {
			Object obj = valuesList.get(i);
			if(obj != null) {
				if(obj instanceof UISelectItemFormat) {
					innerValues.put(Integer.toString(i), ((UISelectItemFormat)obj).getComboDescription());
				} else {
					innerValues.put(Integer.toString(i), obj.toString());
				}
			}
		}
		setValueMap(innerValues);
		if(values.size()==1 && ( markIfUnique || getAllowEmptyValue()==null || !getAllowEmptyValue() )){
			setSelectedIndex(0);
		}
	}
	
	public Object getSelectedObject() {
		Object objSelected = null;
		Object values = getValue();
		if(values instanceof List){
			List retorno = new ArrayList();
//			List<String> vals = 
			for(String idString:((List<String>)values)){
				if(idString != null && !"".equals(idString)) {
					try {
						int id = Integer.parseInt(idString);
						objSelected = valuesList.get(id);
						retorno.add(objSelected);
					} catch (NumberFormatException e) {
					}
				}
			}
		return retorno;
		}else{
			String idString = (String) getValue();
			if(idString != null && !"".equals(idString)) {
				try {
					int id = Integer.parseInt(idString);
					objSelected = valuesList.get(id);
				} catch (NumberFormatException e) {
				}
			}
			return objSelected;
		}
	}
	
	public void removeSelectedObjects() {
		Object objSelected = null;
		Object values = getValue();
		if(values instanceof List){
//			List<String> vals = 
			for(String idString:((List<String>)values)){
				if(idString != null && !"".equals(idString)) {
					try {
						int id = Integer.parseInt(idString);
						if(!valuesList.isEmpty()){
							objSelected = valuesList.remove(id);
						}
					} catch (NumberFormatException e) {
					}
				}
			}
		}else{
			String idString = (String) getValue();
			if(idString != null && !"".equals(idString)) {
				try {
					int id = Integer.parseInt(idString);
					if(!valuesList.isEmpty()){
						objSelected = valuesList.remove(id);
					}
				} catch (NumberFormatException e) {
				}
			}
		}
		setValues(valuesList);
	}

	public boolean setSelectedObject(Object objSelected) {
		if(objSelected == null) {
			clearValue();
			return true;
		}
		for(int i=0; i < this.valuesList.size(); i++) {
			Object obj = this.valuesList.get(i);
			if(obj != null) {
				if(obj.equals(objSelected)) {
					setValue(Integer.toString(i));
					return true;
				}
			}
		}
		return false;
	}

	public boolean setSelectedObject(Object objSelected,boolean force) {
		if(!force || objSelected==null){
			return setSelectedObject(objSelected);
		}

		for(Object obj: this.valuesList) {
			if(obj.equals(objSelected)){
				return setSelectedObject(objSelected);
			}
		}
		this.valuesList.add(objSelected);
		setValues(this.valuesList);
		return setSelectedObject(objSelected);
	}

	public Object getObjectValue(int index) {
		if (index > -1 && index < valuesList.size()) {
			return this.valuesList.get(index);
		} else {
			throw new IndexOutOfBoundsException("index: " + index);
		}
	}
	
	public void setSelectedIndex(int index) {
		if(index == 0 && getAllowEmptyValue()!=null && getAllowEmptyValue()) {
			clearValue();
		}else {
			if(index > -1 && index < valuesList.size()) {
				setValue(Integer.toString(index));
			}
			else {
				throw new IndexOutOfBoundsException("index: " + index);
			}
		}
	}
	
	public void setSelectFirstNoBlankOption() {
		if(getAllowEmptyValue()) {
			setSelectedIndex(1);
		}
		else {
			setSelectedIndex(0);
		}
	}
	
	public void setSelectFirstOption() {
		setSelectedIndex(0);
	}

	/**
	 * @return -1 if not initialized with 
	 *            setValues(Enum ...)
	 *            setValues(Object ...)
	 *            setValues(List ...)
	 */
	public int getItemsSize() {
		return (valuesList != null) ? valuesList.size() : -1;
	}
	public void clearValues(){
		setValues(new LinkedList());
		clearValue();
	}
	
	public List getValuesList(){
		return valuesList;
	}

	public boolean isMarkIfUnique() {
		return markIfUnique;
	}

	public void setMarkIfUnique(boolean markIfUnique) {
		this.markIfUnique = markIfUnique;
	}
}
