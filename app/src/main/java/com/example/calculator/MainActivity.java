package com.example.calculator;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    //创建栈类
    public class Stack {
        private double[] stack;
        private int point;

        public void stackInit(int num) {
            this.stack = new double[num];
            this.point = 0;
        }

        public void add(double str) {
            this.stack[point] = str;
            this.point += 1;
        }

        public double pop() {
            this.point -= 1;
            return this.stack[this.point];
        }
    }
    public class StackStr {
        private String[] stack;
        public int point;

        public void stackInit(int num) {
            this.stack = new String[num];
            this.point = 0;
        }

        public void add(String str) {
            this.stack[point] = str;
            this.point += 1;
        }

        public String pop() {
            this.point -= 1;
            return this.stack[this.point];
        }
        public int len()
        {
            return this.point;
        }
        public String top()
        {
            return this.stack[point-1];
        }
    }

    private Button aButton_0;
    private Button aButton_1;
    private Button aButton_2;
    private Button aButton_3;
    private Button aButton_4;
    private Button aButton_5;
    private Button aButton_6;
    private Button aButton_7;
    private Button aButton_8;
    private Button aButton_9;
    private Button aButton_Point;
    private Button aButton_Clear;
    private Button aButton_Division;
    private Button aButton_Multiplication;
    private Button aButton_Minus;
    private Button aButton_Plus;
    private Button aButton_Equal;
    private Button aButton_Del;
    private Button aButton_Percent;
    private TextView aText_in;
    private TextView aText_out;
    ///创建输入字符串
    private String strInAll = "";
    ///创建输出字符串
    private String strOut = "";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        getSupportActionBar().hide();
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //初始化textview
        aText_in = (TextView) findViewById(R.id.text_in);
        aText_out = (TextView) findViewById(R.id.text_out);
        ///初始化各个按钮
        aButton_0 = (Button) findViewById(R.id.btn_0);
        aButton_1 = (Button) findViewById(R.id.btn_1);
        aButton_2 = (Button) findViewById(R.id.btn_2);
        aButton_3 = (Button) findViewById(R.id.btn_3);
        aButton_4 = (Button) findViewById(R.id.btn_4);
        aButton_5 = (Button) findViewById(R.id.btn_5);
        aButton_6 = (Button) findViewById(R.id.btn_6);
        aButton_7 = (Button) findViewById(R.id.btn_7);
        aButton_8 = (Button) findViewById(R.id.btn_8);
        aButton_9 = (Button) findViewById(R.id.btn_9);
        aButton_Point = (Button) findViewById(R.id.btn_point);
        aButton_Clear = (Button) findViewById(R.id.btn_clear);
        aButton_Division = (Button) findViewById(R.id.btn_division);
        aButton_Multiplication = (Button) findViewById(R.id.btn_multiplication);
        aButton_Del = (Button) findViewById(R.id.btn_del);
        aButton_Minus = (Button) findViewById(R.id.btn_minus);
        aButton_Plus = (Button) findViewById(R.id.btn_plus);
        aButton_Percent = (Button) findViewById(R.id.btn_percent);
        aButton_Equal = (Button) findViewById(R.id.btn_equal);
        //创建监听器
        aButton_0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                strInAll += "0";
                aText_in.setText(strInAll);
                strOut = "";
            }
        });
        aButton_1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                strInAll += "1";
                aText_in.setText(strInAll);
                strOut = "";
            }
        });
        aButton_2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                strInAll += "2";
                aText_in.setText(strInAll);
                strOut = "";
            }
        });
        aButton_3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                strInAll += "3";
                aText_in.setText(strInAll);
                strOut = "";
            }
        });
        aButton_4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                strInAll += "4";
                aText_in.setText(strInAll);
                strOut = "";
            }
        });
        aButton_5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                strInAll += "5";
                aText_in.setText(strInAll);
                strOut = "";
            }
        });
        aButton_6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                strInAll += "6";
                aText_in.setText(strInAll);
                strOut = "";
            }
        });
        aButton_7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                strInAll += "7";
                aText_in.setText(strInAll);
                strOut = "";
            }
        });
        aButton_8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                strInAll += "8";
                aText_in.setText(strInAll);
                strOut = "";
            }
        });
        aButton_9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                strInAll += "9";
                aText_in.setText(strInAll);
                strOut = "";
            }
        });
        aButton_Point.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                strInAll += ".";
                aText_in.setText(strInAll);
                strOut = "";
            }
        });
        aButton_Clear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                strInAll = "";
                aText_in.setText(strInAll);
                strOut = "";
                aText_out.setText(strOut);
            }
        });
        aButton_Division.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                strInAll += "÷";
                aText_in.setText(strInAll);
                strOut = "";
            }
        });
        aButton_Multiplication.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                strInAll += "×";
                aText_in.setText(strInAll);
                strOut = "";
            }
        });
        aButton_Del.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                strInAll = strInAll.substring(0, strInAll.length() - 1);
                aText_in.setText(strInAll);
                strOut = "";
                aText_out.setText(strOut);
            }
        });
        aButton_Minus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                strInAll += "-";
                aText_in.setText(strInAll);
                strOut = "";
            }
        });
        aButton_Plus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                strInAll += "+";
                aText_in.setText(strInAll);
                strOut = "";
            }
        });
        aButton_Percent.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                strInAll += "%";
                aText_in.setText(strInAll);
                strOut = "";
            }
        });
        aButton_Equal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //调用函数计算式子结果并输出
                System.out.print("1");
                strOut = calculate(" "+strInAll);
                aText_out.setText(strOut);
            }
        });


    }

    ///定义函数用于计算表达式结果
    public String calculate(String strIn)
    {

        String[] dicSign = {"+", "×", "÷"};
        Stack aStackNum1 = new Stack();
        aStackNum1.stackInit(100);
        StackStr aStackSign1 = new StackStr();
        aStackSign1.stackInit(100);
        Stack aStackNum2 = new Stack();
        aStackNum2.stackInit(100);
        StackStr aStackSign2 = new StackStr();
        aStackSign2.stackInit(100);
        strIn=addPlus(strIn);
        int i = strIn.length()-1;
        int j = strIn.length()-1;
        while(j>=0)
        {
            if(strIn.substring(j,j+1).equals(" "))
            {
                aStackNum1.add(change(strIn.substring(j+1,i+1)));
                j--;
            }
            else if(!belong(dicSign,strIn.substring(j,j+1)))
            {
                j--;
            }
            else
            {
                String hc = strIn.substring(j+1,i+1);
                aStackNum1.add(change(strIn.substring(j+1,i+1)));
                aStackSign1.add(strIn.substring(j,j+1));
                j--;
                i=j;
            }
        }
        while(aStackSign1.len()!=0||aStackSign2.len()!=0)
        {
            if (aStackSign1.len()!=0)
            {
                aStackSign2.add(aStackSign1.pop());
                aStackNum2.add(aStackNum1.pop());
            }
            if((aStackSign1.len()==0)||(!compare(aStackSign2.top(),aStackSign1.top())))
            {
                aStackNum1.add(cal(aStackNum2.pop(),aStackNum1.pop(),aStackSign2.pop().charAt(0)));
            }
        }
        return ""+aStackNum1.pop();
    }

    public boolean belong(String[] dic, String str) {
        for (int i = 0; i < dic.length; i++) {
            if (dic[i].equals(str)) {
                return true;
            }
        }
        return false;
    }

    public double change(String str)
    {

        if (str.substring(str.length() - 1, str.length()).equals("%")) {
            str = str.substring(0, str.length() - 1);
            return (Double.parseDouble(str) / 100);
        } else {
            return Double.parseDouble(str);
        }
    }
    public double cal(double pop2,double pop1,char sign)
    {

        switch (sign)
        {
            case ('+'):
                return pop2+pop1;
            case('×'):
                return pop2*pop1;
            case('÷'):
                return pop2/pop1;
        }
        return 0.1;
    }
    public boolean compare(String str1,String str2)//判断str1是否权重小于str2
    {
        if ((str1.equals("+"))&&(str2.equals("÷")||str2.equals("×")))
        {
            return true;
        }
        else {
            return false;
        }
    }
    public String addPlus(String str)
    {
        for(int i = 0;i<str.length();i++)
        {
            if (str.substring(i,i+1).equals("-"))
            {
                str = str.substring(0, i) + "+" + str.substring(i);
                i++;
            }
        }
        return str;
    }

}