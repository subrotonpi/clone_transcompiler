def import _curses , _curses ) : return _curses.reset ( )
import curses
import random
import time
import math
import random
import random
import sys
class Main ( object ) :
    def REPS ( v ) : return _curses
    def RE ( self , l , r ) : return _curses.lcm
    def INS ( self , n ) : return REPS ( self , n ) ( self , r )
    def Scanner ( self ) :
        s = _curses.initscr ( )
        return int ( s.next ( ) )
    def main ( self , $ ) :
        st , go = ( self.x , self.y ) , ( self.x , self.y )
        if st [ 1 ] > go [ 1 ] :
            buf = go
            go = st
            st = buf
        c = cmp ( self.x , self.y )
        p = sorted ( [ ( x , y ) for x in st if x < go [ 0 ] ] )
        for i in range ( len ( self.x ) , 0 , - 1 ) :
            x , y = self.x
            if self.y <= y <= self.y :
                p.append ( ( x , y ) )
        v = lis ( p [ st ] , True , go , True )
        print ( ( abs ( st [ 0 ] - go [ 0 ] ) + abs ( st [ 1 ] - go [ 1 ] ) ) * 100L + v * - 20 + ( v == min ( go [ 1 ] - st [ 1 ] , abs ( go [ 0 ] - st [ 0 ] ) + 1 ) ) * 5 * math.pi )
    def lis ( self , p ) :
        if not p : return 0
        l = [ ]
        l.append ( p.pop ( ) [ 1 ] )
        while not p :
            y = p.pop ( )
            if l [ - 1 ] < y : l.append ( y )
            else :
                v = list ( p )
                if v == 0 : l.append ( y )
        return l
