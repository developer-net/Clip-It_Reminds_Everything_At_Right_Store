/*
Clip-It

 Copyright (C) <2018>  <Royal Benny>

    This program is free software: you can redistribute it and/or modify
    it under the terms of the GNU General Public License as published by
    the Free Software Foundation, either version 3 of the License, or
    (at your option) any later version.

    This program is distributed in the hope that it will be useful,
    but WITHOUT ANY WARRANTY; without even the implied warranty of
    MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
    GNU General Public License for more details.

    You should have received a copy of the GNU General Public License
    along with this program.  If not, see <https://www.gnu.org/licenses/>.

*/
package com.clipit.cliptit2.helpSupport

import android.content.Intent
import android.os.Bundle
import android.support.v4.app.Fragment
import android.support.v7.app.AppCompatActivity
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.view.Window

import com.clipit.cliptit2.R
import com.clipit.cliptit2.loginDirectory.LoginActivity
import kotlinx.android.synthetic.main.activity_instruction_.*
import kotlinx.android.synthetic.main.fragment_help_support.*
import kotlinx.android.synthetic.main.fragment_help_support.view.*
import kotlinx.android.synthetic.main.fragment_message_view.view.*

class HelpSupport : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.fragment_help_support)
        if(android.os.Build.VERSION.SDK_INT >= 23){
            val windows : Window = this.window
            windows.statusBarColor  = this.getColor(R.color.material_new_grey_strong_200)
        }
        tool_bar_at_help.setNavigationOnClickListener {
            super.onBackPressed()
        }

    }

}
