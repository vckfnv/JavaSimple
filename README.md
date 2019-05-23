## JAVAPRACTICE by LEEDAEHEE

### Before 0523, get JAVA files through Github
> Install VScode as deb file at your firefox, EC2 server(VNC) then install deb file

### 0516 Setup Desktop on EC2, AWS
> Process
>> 1. Install **tasksel** in your EC2 server
>> 2. Install **ubuntu mate core**
>>> ```sudo tasksel install ubuntu-mate-core```
>> 3. Install **VNC server**
>>> ```sudo apt install vnc4server```
>> 4. Install **RealVNC** or tightVNC on your host!
>> 5. then open your **xstartup** as vi at .vnc directory / **modify** as below
>>>  ``` 
>>> #!/bin/sh
>>>    # Uncomment the following two lines for normal desktop:
>>>    unset SESSION_MANAGER         ## uncomment
>>>    exec /etc/X11/xinit/xinitrc   ## uncomment
>>>    [ -x /etc/vnc/xstartup ] && exec /etc/vnc/xstartup
>>>    [ -r $HOME/.Xresources ] && xrdb $HOME/.Xresources
>>>    xsetroot -solid grey
>>>    vncconfig -iconic &
>>>    ## commented out following two lines
>>>    #x-terminal-emulator -geometry 80x24+10+10 -ls -title "$VNCDESKTOP Desktop" &
>>>    #x-window-manager &
>>>    ```
>> 6. then reboot & tunneling - this step must be done when using VNC viewer
>>> ``` sudo reboot now
>>>ssh -L 5901:localhost:5901 -i <pem-file> ubuntu@<public-ip> ```
>> 7. Enter **vncserver** on your EC2 and Open your **VNC viewer and connet to host 5901**
### 0508 Make Calulator 'Finalcal' more like *OOP* 'Newcal'
> still chainging...

### 0430 Calculator 'Finalcal' finalize.
> calculator with rounded border buttons
>> Button functions<br>
>> - Trigonometric function
>> - Clear
>> - Delete(Backspace)Basic Operations(+,-,×,÷)

### 0423 mid-term test!
> Funny exam~



 












- This is LEEDAEHEE's **JAVA** Practice repository.  
- Every codes and scripts will be uploaded in here.  
- I'm interested in Art&Culture, also Mathmatics  
(*since I'm majored Mathmatics*)

[My Instagram link!@daehee_dayday](https://www.instagram.com/daehee_dayday/?hl=ko)  

And my favorite!  
![image](https://user-images.githubusercontent.com/48408497/54598910-e3d07380-4a7c-11e9-8d5a-c571c1859363.png)  
Thesedays, I've learned Data Analysis
```python
import pandas
data=pandas.read_csv(/path,sep='\t')
...
```
| Major | Hobby | Programming Language  |
| --- |:---:| ---:|
| Mathmatics | watching Youtube | Python |
| Interdisciplinary <br> Program of Convergent Software | Singing |Java|
| Infomatics | Taking a picture&`Photo adjusting(?)` |R|
