# PhoneNumberDialingActiviy
Project functional speciﬁcation. Design and implement an app with the following functionality. The appstartsoffwithamainactivitycontainingawelcometextandtwobuttons. Uponpressingtheﬁrstbutton, your app displays a second activity containing only a one-line editor ﬁeld. The second activity allows the interactive user to enter a phone number. The phone number must conform to the following format “(xxx) xxx-xxxx”, where “x” denotes a digit, although the phone number could be preceded and followed by a random number of white spaces. When the user is done entering the number and presses the “Done” or “return” key on the soft keyboard, the second activity reads the number entered by the user. The number is packed (as a string) into the intent that the ﬁrst activity used to start the second activity. In addition, the second activity checks whether the number just entered conforms exactly to the above format. If this is the case, the second activity sets a result code of “RESULT OK”; otherwise, it sets a result code of “RESULT CANCELED”. Finally, the second activity terminates itself, thereby causing the ﬁrst activity to become visible again. 

Upon returning from the second activity, the ﬁrst activity checks whether the result code was “RESULT OK”. In the case, the user may press the second button in the ﬁrst activity causing the device to display the phone dialer activity (without making the call), while displaying the number that was entered in the second activity in the dialer window. You must use an existing Phone app previously installed in your device when displaying the dialer activity. (You are not allowed to specify what Phone app should be used for the dialer activity.) However, if the result code was “RESULT CANCELED”, when the user presses the second button, the ﬁrst activity displays a toast message informing that device user that she entered an incorrect number and includes the number.

**Note that the second activity must return automatically to the ﬁrst activity after a user enters a phone number and presses the return or done key.** 

Implementation notes. Your app has no knowledge of the speciﬁc phone app to be invoked. You are not responsible for coding or downloading additional phone apps; you may assume that a suitable phone app is already installed on your device even though you don’t know what that app is.

Use an intent extra to pass the phone number from the second activity to the ﬁrst activity. 

Create an instance of the Toast class with the static message makeText(), which takes as input 3 arguments. You can then display the toast by calling method show() on the instance. See the online documentation for additional details. 

Use an EditText widget to enter the phone number in the second activity. Implement Java interface TextView.OnEditorActionListener when deﬁning a listener for the edit text. Read the Android documentation on the TextView class in order to deﬁne the listener. 

**Androidplatform.** For this project use a Pixel XL AVD running Nougat API 25, that you downloaded for Homework 1. You are not required to provide backward compatibility with previous Android versions.
