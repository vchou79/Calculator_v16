// *****************************************************************************
// * MainActivity.java: calculator instances creation and API handling
// *****************************************************************************
// * Copyright (C) 2021 Vincent Chou
// *
// * Authors: Vincent Chou <vchou79@gmail.com>
// *
// * This program is free software; you can redistribute it and/or modify it
// * under the terms of the GNU Lesser General Public License as published by
// * the Free Software Foundation; either version 2.1 of the License, or
// * (at your option) any later version.
// *
// * This program is distributed in the hope that it will be useful,
// * but WITHOUT ANY WARRANTY; without even the implied warranty of
// * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the
// * GNU Lesser General Public License for more details.
// *
// * You should have received a copy of the GNU Lesser General Public License
// * along with this program; if not, write to the Free Software Foundation,
// * Inc., 51 Franklin Street, Fifth Floor, Boston MA 02110-1301, USA.
// *****************************************************************************

package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    calculator c;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        c=new calculator();
    }

    public void showInfo(View v) {
        Button b=findViewById(v.getId());
        TextView in=findViewById(R.id.formula);
        TextView out=findViewById(R.id.answer);

        c.parse(b.getText().toString(), out, in);
        if(b.getText().toString().equals("A") || !c.isAMode(b.getText().toString())) {
            c.parse(";", out, in);
        }
    }
}
