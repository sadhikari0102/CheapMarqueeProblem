# CheapMarqueeProblem

PROBLEM DESCRIPTION-
You have purchased some of the world's cheapest scrolling marquees.

They are so cheap, that if too many of the individual lights turn on at the same time, they will blow a fuse.

The text to be displayed on your marquees will be 4x5 pixel font

The sign is capable of displaying the following characters: ABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789.,!?
As well as the space character which is 2 pixels wide.

Each character is separated by 1 pixel.

Given the message and the width of the marquee (in pixels), return the maximum number of pixels that will be lit up as the message scrolls across the marquee.

Since the marquee can only display upper-case letters, you will need to convert any lower-case letters in the input to uppercase. If the input contains a character outside of the specified set, it will be ignored and not printed.

Example
For message = "HEY" and width = 6, the output should be
cheapMarquee(message, width) = 18.

The marquee is 6 pixels wide.
The letter 'E' is 4 pixels wide.
The letter 'E' contains 13 pixels.
The last displayable portion of 'H' contains 5 pixels.
13 + 5 = 18 pixels lit up at once.

Input/Output

[execution time limit] 3 seconds (java)

[input] string message

The message to scroll across the marquee.

Guaranteed constraints:
0 ≤ message.length ≤ 2000.

[input] integer width

The width of the marquee

Guaranteed constraints:
0 ≤ width ≤ 200.

[output] integer

The maximum number of pixels that will need to be lit at any moment in order to display the message.


