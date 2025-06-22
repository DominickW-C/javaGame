** 6-7-25 **
- The initial commit for this repo not a lot was done besides starting it. I have a blank screen appearing
  and that is about it. I currently don't have much of an idea for the game, probably going to do some 2D
  platformer because it seems like a good start.

** 6-13-25 **
- Wow I really need to work on this more. Today I was able to make it so that the window size is 640x480
  as I feel like that is a good size to start with. I also figured out how to make it so the window will
  always make itself in the middle of the screen. Lastly, I added a main panel along with a label in order
  to add text to the screen. The next few things planned will be event listeners and refreshing the screen.

** 6-16-25 **
- Another small commit that adds the main event loop to the program. I was lost for a bit as to why it would
  not refresh correctly although I ended up finding the repaint and revalidate methods (thanks google AI 
  search suggestions). After adding those to my clear method it worked how I intended. I also have a game idea 
  now for this, which is a flappy bird game. While that is kinda lame it is a simple start that will teach me
  what I need to know for a more original game.

  Another thing is google AI suggestions make me mad. I am just trying to google something although the first 
  thing to come up is the AI response with what I needed. Like now I feel like I got to mention I used AI when
  all I did is make a google search and it told me two methods I could use. Do I have to cite it? Does it matter?
  Do I now have to cite every resource I use? I have no clue, but that's what this is for. I could also probably
  turn off AI suggestions but is it worth it? Who knows.

** 6-19-25 **
- I decided to look up some tutorials which helped me better understand what I am doing. Now I know to use the 
  invoke later method, although that did creates some issues with the main loop. I then figured out about swing timer
  which fixed that issue. I NEED TO DO A LOT OF CLEANING UP IN THIS. This commit is very ugly but oh well. also I had 
  to make an import to awt.* and awt.event.*? Seems kinda dumb but thanks Google AI answers for that one. I am also
  not going to be mentioning it in these notes anymore as it's annoying to do. Like I am still trying to do this on my
  own, if I am Googling something I am trying to learn what it does (although some of the frame stuff I am still confused
  on), I am doing this to try and learn ok I am gonna be Googling things I don't know.

** 6-21-25 **
- I finally figured out how to draw graphics on the screen that took way too much time for me to do but it works now.
  Updated TODO so see that for next things that will be done. I also tried cleaning up the code a lot to make it a lot
  more readable. I should still go back and add JavaDocs to the classes and stuff though.

- SECOND UPDATE: Added the keyboard handler. This was also a good learning expirience as I learned the difference between
  extending and implementing with classes and interfaces. I am also getting better at reading through the Java documentation
  which is super helpful. 

** 6-22-25
- Pipes can now spawn with hte gaps being random (although always the same size) and will reset once the edge of the screen
  is reached. Also added the collision to the floor and to the ceiling, not yet the pipes though. Maybe something like if
  at Y val to hit pipe, check X val? Not sure yet. Also added JavaDocs to most things.
