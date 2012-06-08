/*
* Copyright 2011-2012 the original author or authors.
*
* Licensed under the Apache License, Version 2.0 (the "License");
* you may not use this file except in compliance with the License.
* You may obtain a copy of the License at
*
*     http://www.apache.org/licenses/LICENSE-2.0
*
* Unless required by applicable law or agreed to in writing, software
* distributed under the License is distributed on an "AS IS" BASIS,
* WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
* See the License for the specific language governing permissions and
* limitations under the License.
*/

package groovyx.javafx.canvas

import groovyx.javafx.beans.FXBindable
import javafx.scene.canvas.GraphicsContext;

/**
 *
 * @author jimclarke
 */
@FXBindable
class SetGlobalCompositeOperationOperation implements CanvasOperation {
    GraphicsContext.CompositeOperation op
    
    public void initParams(Object val) {
        if(val instanceof GraphicsContext.CompositeOperation) {
            op = val;
        }else {
            op = Enum.valueOf(GraphicsContext.CompositeOperation,val.toString().trim().toUpperCase())
        }
    }

    public void execute(GraphicsContext gc) {
        gc.setGlobalCompositeOperation(op);
    }
}
