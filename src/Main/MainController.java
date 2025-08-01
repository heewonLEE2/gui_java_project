package Main;

import controller.StockCalendarController;
import controller.StockInfoController;
import controller.StockRetainedController;
import controller.StockTableController;

public class MainController {

	MainView mainView;
	MainModel mainModel;
	StockInfoController stockInfoController;
	StockCalendarController stockCalendarController;
	StockRetainedController stockRetainedController;
	StockTableController stockTableController;

	public MainController(MainView mainView, MainModel mainModel) {
		this.mainModel = mainModel;
		this.mainView = mainView;

		this.stockCalendarController = new StockCalendarController(mainModel, mainView);
		this.stockInfoController = new StockInfoController(mainModel, mainView);
		this.stockRetainedController = new StockRetainedController(mainModel, mainView);
		this.stockTableController = new StockTableController(mainModel, mainView);
		
	}

}


