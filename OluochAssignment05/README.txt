Name: Luke Oluoch
Assignment: 05
TA: Joseph Traversy

This app sends a message from a middle frame to the top, and a message from the top fram to the bottom. The top and bottom frames are generated with Fragments.
Issues that came up: For some reason, TextViews made programmatically wouldnt show up in the fragment, even though EditTexts and Buttons did. I resorted to putting them in through the xml, but along side with that, their setText methods didn't work, even though it said it changed in the logs.