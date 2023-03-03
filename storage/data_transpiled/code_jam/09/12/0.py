def _main ( ) : return 0
import os
import os
import sys
import os
import time
import time
class Main ( object ) :
    taskname = "B-large"
    def time_x ( self , time , S , W , T ) :
        d = ( time - T ) % ( S + W )
        if d < 0 :
            d += S + W
        h = 0
        if d >= S :
            h = S + W - d
        return time + h
    def iread ( self ) :
        return int ( self.readword ( ) )
    def dread ( self ) :
        return float ( self.readword ( ) )
    def lread ( self ) :
        return long ( self.readword ( ) )
    def readline ( self ) :
        b = [ ]
        c = readline ( )
        while c >= 0 and c <= ' ' :
            c = readline ( )
            if c < 0 : return ""
            while c > ' ' :
                b.append ( ord ( c ) )
                c = readline ( )
            return b
    def main ( ) :
        return Main ( )
ans = [ ]
was = [ ]
for x in range ( 2 * N ) :
    ans.append ( [ 0 ] )
ans.append ( [ 0 ] )
while True :
    min_x , min_y = - 1 , - 1
    for x in range ( 2 * N ) :
        for y in range ( 2 * M ) :
            if was [ x ] [ y ] : continue
            if ans [ x ] [ y ] == sys.maxint : continue
            if min_x < 0 or ans [ min_x ] [ y ] > ans [ x ] [ y ] : continue
            if min_x > 0 : continue
            if ans [ min_x ] [ y ] == 0 : continue
            if ans [ min_y ] [ x ] == 0 : continue
            if ans [ min_y ] [ x ] == 0 : continue
            if ans [ min_y ] [ x ] == 0 : continue
            if ans [ min_y ] [ x ] == 0 : continue
            if ans [ min_y ] [ x ] == 0 : continue
return ans
