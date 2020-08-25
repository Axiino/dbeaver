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
    /*DashboardEditDialog*/
    public static String dashboard_edit_dialog_create_info_label;
    public static String dashboard_edit_dialog_main_info_group_label;
    public static String dashboard_edit_dialog_id_label;
    public static String dashboard_edit_dialog_database_label;
    public static String dashboard_edit_dialog_select_button;
    public static String dashboard_edit_dialog_data_type_label;
    public static String dashboard_edit_dialog_data_type_hint;
    public static String dashboard_edit_dialog_calc_type_label;
    public static String dashboard_edit_dialog_calc_type_hint;
    public static String dashboard_edit_dialog_value_type_label;
    public static String dashboard_edit_dialog_value_type_hint;
    public static String dashboard_edit_dialog_interval_label;
    public static String dashboard_edit_dialog_interval_hint;
    public static String dashboard_edit_dialog_fetch_type_label;
    public static String dashboard_edit_dialog_fetch_type_hint;
    public static String dashboard_edit_dialog_queries_group_label;
    public static String dashboard_edit_dialog_queries_info;
    public static String dashboard_edit_dialog_rendering_group_label;
    public static String dashboard_edit_dialog_default_view_label;
    public static String dashboard_edit_dialog_default_view_hint;
    public static String dashboard_edit_dialog_update_period_label;
    public static String dashboard_edit_dialog_maximum_items_label;
    /*DashboardItemConfigDialog*/
    public static String dashboard_item_config_dialog_dashboard_info_group_label;
    public static String dashboard_item_config_dialog_sql_queries_text;
    public static String dashboard_item_config_dialog_sql_viewer_title;
    public static String dashboard_item_config_dialog_dashboard_update_group_label;
    public static String dashboard_item_config_dialog_dashboard_view_group_label;
    public static String dashboard_item_config_dialog_view_label;
    public static String dashboard_item_config_dialog_legend_checkbox;
    public static String dashboard_item_config_dialog_legend_checkbox_hint;
    public static String dashboard_item_config_dialog_grid_checkbox;
    public static String dashboard_item_config_dialog_grid_checkbox_hint;
    public static String dashboard_item_config_dialog_domain_axis_checkbox;
    public static String dashboard_item_config_dialog_domain_axis_checkbox_hint;
    public static String dashboard_item_config_dialog_range_axis_checkbox;
    public static String dashboard_item_config_dialog_range_axis_checkbox_hint;
    public static String dashboard_item_config_dialog_configuration_button;
    /*DashboardItemViewDialog*/
    public static String dashboard_item_view_dialog_window_name;
    public static String dashboard_item_view_dialog_close_button;
    

    


    static {
        // initialize resource bundle
        NLS.initializeMessages(BUNDLE_NAME, UIDashboardMessages.class);
    }

    private UIDashboardMessages() {
    }
}
