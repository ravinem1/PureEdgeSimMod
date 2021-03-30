/**
 *     PureEdgeSim:  A Simulation Framework for Performance Evaluation of Cloud, Edge and Mist Computing Environments 
 *
 *     This file is part of PureEdgeSim Project.
 *
 *     PureEdgeSim is free software: you can redistribute it and/or modify
 *     it under the terms of the GNU General Public License as published by
 *     the Free Software Foundation, either version 3 of the License, or
 *     (at your option) any later version.
 *
 *     PureEdgeSim is distributed in the hope that it will be useful,
 *     but WITHOUT ANY WARRANTY; without even the implied warranty of
 *     MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 *     GNU General Public License for more details.
 *
 *     You should have received a copy of the GNU General Public License
 *     along with PureEdgeSim. If not, see <http://www.gnu.org/licenses/>.
 *     
 *     @author Mechalikh
 **/
package examples;

import com.mechalikh.pureedgesim.MainApplication; 
import com.mechalikh.pureedgesim.TasksGenerator.DefaultTasksGenerator; 

public class Example1 extends MainApplication {
	/**
	 * This is a simple example showing how to launch simulation using custom
	 * mobility model, energy model, custom edge orchestrator, custom tasks
	 * generator, and custom edge devices. By removing them, you will use the
	 * default models provided by PureEdgeSim. As you can see, this class extends
	 * the Main class provided by PureEdgeSim, which is required for this example to
	 * work.
	 */
	public Example1(int fromIteration, int step_) {
		super(fromIteration, step_);
	}

	public static void main(String[] args) {
		// To change the mobility model
		//setCustomMobilityModel(CustomMobilityManager.class);

		// To change the tasks orchestrator
		setCustomEdgeOrchestrator(CustomEdgeOrchestrator.class);

		// To change the tasks generator
		setCustomTasksGenerator(DefaultTasksGenerator.class);

		// To use a custom edge device/datacenters class
		setCustomEdgeDataCenters(CustomDataCenter.class);

		// To use a custom energy model
		setCustomEnergyModel(CustomEnergyModel.class);

		/* to use the default one you can simply delete or comment those lines */

		// Finally,you can launch the simulation
		launchSimulation();
	}

}
