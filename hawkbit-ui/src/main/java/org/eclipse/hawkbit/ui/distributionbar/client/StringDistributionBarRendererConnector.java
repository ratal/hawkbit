package org.eclipse.hawkbit.ui.distributionbar.client;


import com.vaadin.client.connectors.AbstractRendererConnector;
import com.vaadin.shared.ui.Connect;

@Connect(org.eclipse.hawkbit.ui.distributionbar.renderers.StringDistributionBarRenderer.class)
public class StringDistributionBarRendererConnector extends
        AbstractRendererConnector<String> {

	private static final long serialVersionUID = 7697966991925490786L;

	@Override
    public org.eclipse.hawkbit.ui.distributionbar.client.renderers.StringDistributionBarRenderer getRenderer() {
        return (org.eclipse.hawkbit.ui.distributionbar.client.renderers.StringDistributionBarRenderer) super.getRenderer();
    }
}
