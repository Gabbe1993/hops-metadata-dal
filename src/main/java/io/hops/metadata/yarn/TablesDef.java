/*
 * Copyright (C) 2015 hops.io.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package io.hops.metadata.yarn;

public class TablesDef {
  public static interface ContainerIdToCleanTableDef {

    public static final String TABLE_NAME = "yarn_containerid_toclean";
    public static final String CONTAINERID = "containerid";
    public static final String RMNODEID = "rmnodeid";
  }

  public static interface ContainerStatusTableDef {

    public static final String TABLE_NAME = "yarn_containerstatus";
    public static final String CONTAINERID = "containerid";
    public static final String STATE = "state";
    public static final String DIAGNOSTICS = "diagnostics";
    public static final String EXIT_STATUS = "exitstatus";
    public static final String PENDING_EVENT_ID = "pendingeventid";
    public static final String RMNODEID = "rmnodeid";
    public static final String TYPE = "type";
    public static final String UCI_ID = "uciid";
    //State values
    public static final String STATE_RUNNING = "RUNNING";
    public static final String STATE_COMPLETED = "COMPLETE";
  }

  public static interface FinishedApplicationsTableDef {

    public static final String TABLE_NAME = "yarn_rmnode_finishedapplications";
    public static final String RMNODEID = "rmnodeid";
    public static final String APPLICATIONID = "applicationid";
  }

  public static interface NextHeartbeatTableDef {

    public static final String TABLE_NAME = "yarn_nextheartbeat";
    public static final String RMNODEID = "rmnodeid";
    public static final String NEXTHEARTBEAT = "nextheartbeat";

    //Field that denotes the integer value of the nextheartbeat field if is true
    public static final int NEXTHEARTBEAT_TRUE = 1;
    public static final int NEXTHEARTBEAT_FALSE = 0;
  }

  /**
   * Defines table structure for SchedulerEvents persisted by the
   * Distributed ResourceTrackerService.
   */
  public static interface PendingEventTableDef {

    public static final String TABLE_NAME = "yarn_pendingevents";
    public static final String RMNODEID = "rmnodeid";
    public static final String TYPE = "type";
    public static final String STATUS = "status";
    public static final String ID = "id";
  }

  public static interface ResourceTableDef {

    public static final String TABLE_NAME = "yarn_resource";
    public static final String ID = "id";
    public static final String MEMORY = "memory";
    public static final String VIRTUAL_CORES = "virtualcores";
    public static final String PENDING_EVENT_ID = "pendingeventid";
  }

  public static interface RMLoadTableDef {
    public static final String TABLE_NAME = "yarn_rms_load";
    public static final String RMHOSTNAME = "rmhostname";
    public static final String LOAD = "load";
  }

  /**
   * Defines table structure for RMNodeImpl class.
   */
  public static interface RMNodeTableDef {

    public static final String TABLE_NAME = "yarn_rmnode";
    public static final String NODEID = "rmnodeid";
    public static final String HOST_NAME = "hostname";
    public static final String COMMAND_PORT = "commandport";
    public static final String HTTP_PORT = "httpport";
    public static final String NEXT_HEARTBEAT = "nextheartbeat";
    public static final String RESOURCE_ID = "resourceid";
    public static final String HEALTH_REPORT = "healthreport";
    public static final String RMCONTEXT_ID = "rmcontextid";
    public static final String LAST_HEALTH_REPORT_TIME = "lasthealthreporttime";
    public static final String NODEHBRESPONSE_ID = "lastnodehbresponse_id";
    public static final String CURRENT_STATE = "currentstate";
    public static final String NODEMANAGER_VERSION = "nodemanager_version";
    public static final String PENDING_EVENT_ID = "pendingeventid";
  }

  public static interface UpdatedContainerInfoTableDef {

    public static final String TABLE_NAME = "yarn_updatedcontainerinfo";
    public static final String CONTAINERID = "containerid";
    public static final String RMNODEID = "rmnodeid";
    public static final String UPDATEDCONTAINERINFOID = "updatedcontainerinfoid";
    public static final String PENDING_EVENT_ID = "pendingeventid";
  }

}
