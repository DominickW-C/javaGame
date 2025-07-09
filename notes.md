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

** 6-22-25 **
- Pipes can now spawn with hte gaps being random (although always the same size) and will reset once the edge of the screen
  is reached. Also added the collision to the floor and to the ceiling, not yet the pipes though. Maybe something like if
  at Y val to hit pipe, check X val? Not sure yet. Also added JavaDocs to most things.

** 6-28-25 **
- Added a score counter to the screen. While right now you get points even if you touch a pipe, that won't be a worry when the
  game is done as it will end before you gain the point. Added the collision to the bottom pipes and did some cleaning up. 
  Probably could add a for loop to shorten the amount of code but I am not sure if it will run slower (not that it is any 
  demanding of a game) or if it is worth it since if only has to check for two pipes. Leaving how it is for now. I guess if
  I really wanted to improve the performace I could check which pipe is currently ahead and only check to collision on that one
  but this game is too simple to need all that. Might add if bored just to try. Also added some debugging options that let you
  move the player around freely. These options are currently commented out. This was mostly so that I could check collision 
  better. I wonder how many typos are in this document?

- SECOND UPDATE: I added the gravity to the game and made it so the bird could flap. I didn't want to just copy and paste 
  something from google for it so I tried to do it myself and I think it came out pretty good. It is a very wide quadratic
  function that starts at a negative x val. If the x val is negative, then we wanna add to our y val since we are on the left
  side of our peek, and then if it is positive then subtract is because we are on the right side. I could have probably found
  a way to do this without the weird check but it works and I can say I did it myself. Since the function is so wide, I was 
  running into an issue where the player will just stop at the top for a while, so to fix this I added a loop that will increment
  the x val if it returns a y val between -1 and 1 so there is no odd wait. I was worried that this would cause a slowdown cause
  of the loop but it didn't. And then to flap it just resets the x val back to a negative number. I also realize that this is the
  third commit today, although after making my first commit I realized I wanted to change some lines in this file so I edited them
  and made another commit, and thought since I only pushed once it would only count on Github as one commit, but it ended up being
  two. So the second commit was pretty much nothing. 

** 7-8-25 **
- Added the ability to reset when a collision happens. Also made the game end when a collision happens. Also went and made it so
  many hardcoded numbers are now variables, making it easier to change things like that gaps on the pipes with only one number
  instead of having to go through and do it in every method that can draw a pipe. Also changed offsets to variables which didn't
  really do much but it made the pipe reset method a little more clear. Also now I have resetPipe and reset method which is a bit
  confusing but one resets a single pipe and the other both. The reason why I have two methods is becasue when resetting one pipe
  at a time you don't have to worry about the offset, but when resetting both you do. While I could have found a way to do this 
  in one method I think it is a little more clear this way despite the similar names.
