package xotonic;

import com.vaadin.annotations.Theme;
import com.vaadin.annotations.VaadinServletConfiguration;
import com.vaadin.server.VaadinRequest;
import com.vaadin.server.VaadinServlet;
import com.vaadin.ui.*;

import javax.servlet.annotation.WebServlet;

/**
 *
 */
@Theme("mytheme")
public class SampleUI extends UI {


    @Override
    protected void init(VaadinRequest vaadinRequest) {
        final VerticalLayout layout = new VerticalLayout();
        final TextField name = new TextField();
        final CheckBox checkBox = new CheckBox("Sample checkbox");
        final ComboBox comboBox = new ComboBox("Sample combo");
        final Button button = new Button("Click Me");

        name.setId(DomId.TEXTFIELD.getId());
        button.setId(DomId.BUTTON.getId());
        checkBox.setId(DomId.CHECKBOX.getId());
        comboBox.setId(DomId.COMBOBOX.getId());

        name.setCaption("Will fill after button click:");
        comboBox.addItems("item1", "item2", "item3");
        button.addClickListener(e -> {
            name.setValue("Clicked");
        });


        layout.addComponents(name, button, checkBox, comboBox);
        layout.setSizeFull();
        layout.setMargin(true);
        layout.setSpacing(true);

        setContent(layout);
    }

    @WebServlet(urlPatterns = "/*", name = "MyUIServlet", asyncSupported = true)
    @VaadinServletConfiguration(ui = SampleUI.class, productionMode = true)
    public static class MyUIServlet extends VaadinServlet {
    }
}
