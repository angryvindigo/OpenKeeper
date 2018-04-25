/*
 * Copyright (C) 2014-2017 OpenKeeper
 *
 * OpenKeeper is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * OpenKeeper is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with OpenKeeper.  If not, see <http://www.gnu.org/licenses/>.
 */
package toniarts.openkeeper.game.task.objective;

import java.util.ArrayDeque;
import java.util.Deque;
import toniarts.openkeeper.game.task.AbstractTileTask;
import toniarts.openkeeper.world.WorldState;

/**
 * Abstract base class for objective tasks, allows chaining of objectives for
 * more complex set of behaviors. As a tree or a simple queue.
 *
 * @author Toni Helenius <helenius.toni@gmail.com>
 */
public abstract class AbstractObjectiveTask extends AbstractTileTask implements ObjectiveTask {

    private final Deque<ObjectiveTask> taskQueue = new ArrayDeque<>();

    public AbstractObjectiveTask(WorldState worldState, int x, int y, short playerId) {
        super(worldState, x, y, playerId);
    }

    @Override
    public Deque<ObjectiveTask> getTaskQueue() {
        return taskQueue;
    }

}
