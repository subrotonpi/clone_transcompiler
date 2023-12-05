def import import sys
import os
import sys
class cookie ( object ) :
    def __init__ ( self ) :
        self.stdin = sys.stdin
        self.a = int ( sys.stdin.readline ( ) )
        for i in range ( self.a ) :
            data = self.stdin.readline ( )
            cost , rate , goal = [ float ( x ) for x in data.split ( ) ]
            mintime = goal / 2
            temptime = cps = 2
            for j in range ( 1000001 ) :
                temptime += cost / cps
                cps += rate
                mintime = min ( mintime , temptime + goal / cps )
            print ( "Case #%s: %.7f" % ( self.a + 1 , mintime ) )
