/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.outliner.listener;

import com.mycompany.outliner.view.NavBarLink;


public interface NavBarLinkListener {
    public void onNavBarLinkClicked(NavBarLink navBarLink, String title, String link);
}
