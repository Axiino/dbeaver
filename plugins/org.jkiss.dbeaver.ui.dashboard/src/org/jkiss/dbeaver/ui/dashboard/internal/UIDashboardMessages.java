/*
 * DBeaver - Universal Database Manager
 * Copyright (C) 2010-2020 DBeaver Corp and others
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
package org.jkiss.dbeaver.ui.dashboard.internal;

import org.eclipse.osgi.util.NLS;

public class UIDashboardMessages extends NLS {
    public static final String BUNDLE_NAME = "org.jkiss.dbeaver.ui.dashboard.internal.UIDashboardMessages"; //$NON-NLS-1$

    public static String pref_page_dashboards_group_common;
    public static String pref_page_dashboards_open_separate_connection_label;
    /*New strings*/
    /*DashboardAddDialog*/
    public static String dashboard_add_dialog_window_name;
    public static String dashboard_add_dialog_table_name;
    public static String dashboard_add_dialog_table_description;
    public static String dashboard_add_dialog_over_control_message;
    public static String dashboard_add_dialog_manager_button;
    public static String dashboard_add_dialog_add_button;
    public static String dashboard_add_dialog_cancel_button;
    /*DashboardDatabaseSelectDialog*/
    public static String dashboard_database_select_dialog_window_name;


    static {
        // initialize resource bundle
        NLS.initializeMessages(BUNDLE_NAME, UIDashboardMessages.class);
    }

    private UIDashboardMessages() {
    }
}
