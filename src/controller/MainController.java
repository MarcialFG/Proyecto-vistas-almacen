package controller;

import interfaces.IDrink;
import interfaces.IMainController;
import interfaces.IStore;
import interfaces.IView;
import view.View;

public class MainController implements IMainController{
	IView view;
	IStore store;
	@Override
	public void run() {
		int option=-1;
		do {
			showMainMenu();
			option=view.readMainMenuOption();
			switchMain(option);
		}while(option!=6);
	}
	/**
	 * Muestra el menú principal de acciones
	 */
	private void showMainMenu() {
		view.showMainManu();
	}
	/**
	 * Ejecuta una de las opciones disponibles del 
	 * menú principal en función del valor de option
	 * @param option valor leído por teclado después
	 * del menú principal
	 */
	private void switchMain(int option) {
		switch(option) {
			case 1: boolean result=addDrink();
					if(result) {
						view.print("Bebida insertada");
					}else {
						view.print("Error insertando bebida");
					}
					break;
			case 2: 
					view.print("Inserte el nombre de la bebida");
					String name=view.leeString();
					IDrink d=searchDrink(name);
					view.print(d);
					break;
			case 3: 
					view.print("Inserte el nombre de la bebida");
					String name2=view.leeString();
					IDrink d2=getDrink(name2);
					view.print(d2);
					break;
			case 4:
					//IDrink drink <---
					//updateDrink(drink);
					break;
			case 5:	view.print(getHowMuch()+"");
					break;
			case 6: view.print("Hasta la próxima");
					break;
			default: view.print("Opción incorrecta");
					
		}
	}
	/**
	 * Ejecuta la acción de añadir una nueva bebida, para
	 * tomar los datos hace uso de SecundaryController
	 * @return devuelve false si no pudo ser insertada por:
	 * no haber espacio o existir ya una bebida con el 
	 * mismo nombre
	 */
	private boolean addDrink() {
		view.print("Inserte el nombre de la bebida");
		String name=view.leeString();
		view.print("Inserte el precio de la bebida");
		float precio=view.leeFloat();
		view.print("Inserte tipo de bebida 1 Alhólica, 2 Refresco");
		int tipo=view.leeEntero();
		IDrink newDrink=null;
		if(tipo==1) {
		//	newDrink=new Alcoholic(name,precio);
		}else {
		//	newDrink=new Soda(name,precio);
		}
		
		return store.addDrink(newDrink);
	}
	/**
	 * Busca y devuelve la bebida dada por el nombre name
	 * @param name nombre de la bebida a buscar
	 * @return la bebida o null en caso de no existir
	 */
	private IDrink searchDrink(String name) {
		return null;
	}
	/**
	 * Busca, devuelve y elimina del almacen la bebida dada
	 * por el nombre name
	 * @param name nombre de la bebida a extraer
	 * @return la bebida o null en caso de no existir
	 */
	private IDrink getDrink(String name) {
		return null;
	}
	/**
	 * Actualiza la bebida con lo nuevos datos insertados
	 * @param drink bebida a ser actualizada
	 * @return devuelve false en caso de no haber podido
	 * ser actualizada por no existir
	 */
	private boolean updateDrink(IDrink drink) {
		return false;
	}
	/**
	 * Devuelve la cantidad de dinero en bebidas que 
	 * existe en el almacen
	 * @return la cantidad de dinero en formato float
	 */
	private float getHowMuch() {
		return 0;
	}
	
	
	
	
}
