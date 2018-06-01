# Android Phone application

**Application to input user enterd phone number, validating it and opening the phone dialer with the user entered number or displaying Toast messages accordingly** 

### Project functional speciﬁcation.

+ The app starts off with a main activity containing a welcome text and two buttons.
+ Upon pressing the ﬁrst button, app displays a second activity containing only a one-line editor ﬁeld.
+ The second activity allows the interactive user to enter a phone number.
+ The phone number must conform to the following format “(xxx) xxx-xxxx”, where “x” denotes a digit, although the phone number could be preceded and followed by a random number of white spaces. 
+ When the user is done entering the number and presses the “Done” or “return” key on the soft keyboard, the second activity reads the number entered by the user. The number is packed (as a string) into the intent that the ﬁrst activity used to start the second activity.
+ In addition, the second activity checks whether the number just entered conforms exactly to the above format. If this is the case, the second activity sets a result code of “RESULT OK”; otherwise, it sets a result code of “RESULT CANCELED”. 
+ Finally, the second activity terminates itself, thereby causing the ﬁrst activity to become visible again. 

+ Upon returning from the second activity, the ﬁrst activity checks whether the result code was “RESULT OK”. In the case, the user may press the second button in the ﬁrst activity causing the device to display the phone dialer activity (without making the call), while displaying the number that was entered in the second activity in the dialer window.
+ However, if the result code was “RESULT CANCELED”, when the user presses the second button, the ﬁrst activity displays a toast message informing that device user that she entered an incorrect number and includes the number.

+ The second activity must return automatically to the ﬁrst activity after a user enters a phone number and presses the return or done key.** 

### Implementation notes

The app has no knowledge of the speciﬁc phone app to be invoked. Not responsible for coding or downloading additional phone apps; assumed that a suitable phone app is already installed on the device even though you don’t know what that app is.

Uses an intent extra to pass the phone number from the second activity to the ﬁrst activity. 

Creates an instance of the Toast class with the static message makeText(), which takes as input 3 arguments. Display the toast by calling method show() on the instance. See the online documentation for additional details. 

Used an EditText widget to enter the phone number in the second activity. 

Implemented Java interface TextView.OnEditorActionListener when deﬁning a listener for the edit text. Read the Android documentation on the TextView class in order to deﬁne the listener. 

### Androidplatform

Tested the applcation on: Pixel XL AVD running Nougat API 25. 
