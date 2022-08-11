package generics;
class MyGen<T>{  
	
	T obj; 
	
	void add(T obj1){
		this.obj = obj1;
		}  
	T get(){
		return obj;
		}  
}