package morkaragh.dashboard.charts;

import com.vaadin.flow.component.html.Div;
import morkaragh.dashboard.charts.model.AbstractChartModel;

public class Chart extends Div {

    public Chart(AbstractChartModel chartModel) {
        ChartJavaScriptComponent component = new ChartJavaScriptComponent(chartModel);
        add(component);
    }
}
