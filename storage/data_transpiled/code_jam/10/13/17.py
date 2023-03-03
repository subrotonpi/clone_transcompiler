def import number_game
import math
import os
import math
import math
import math
import math
import random
import math
import random
import sys
infile = open ( 'C-large.in' )
outfile = open ( 'C.out' , 'w' )
alow , ahigh , blow , bhigh , cases = [ int ( x ) for x in infile.readlines ( ) ]
gold = ( 1 + math.sqrt ( 5 ) ) / 2
for i in range ( 1 , cases + 1 ) :
    line = infile.readline ( ).split ( )
    alow , ahigh , blow , bhigh , count = [ int ( x ) for x in line [ : alow ] ]
    for a in range ( alow , ahigh + 1 ) :
        low = max ( int ( a / gold + 1 ) , blow )
        high = min ( bhigh , int ( a * gold ) )
        if low <= bhigh and high >= blow :
            count -= high - low + 1
    outfile.write ( 'Case #%d: %d\n' % ( i , count ) )
