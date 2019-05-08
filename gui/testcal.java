if (j != 19){
    btn[j].addActionListener(e -> {
        currCom = btn[j].getActionCommand();
        currCal = currCal+currCom;
        label.setText(currCal);
        preNum = currNum;
        currNum ="0";
    });