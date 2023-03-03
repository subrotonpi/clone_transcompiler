def _import ( ) : return sys.modules [ '__main__' ].__code__
import collections
import os
import sys
class Main ( object ) :
    R , C , N = [ ] , [ ] , [ ]
    def solve ( self ) :
        with open ( '__main__.py' , 'r' ) as io :
            R , C , N = io.read ( ) , [ ]
            edge = [ ]
            for i in range ( N ) :
                x1 , y1 = io.read ( ) , io.read ( )
                x2 , y2 = io.read ( ) , io.read ( )
                p1 = self.trans ( x1 , y1 )
                p2 = self.trans ( x2 , y2 )
                if p1 == - 1 or p2 == - 1 :
                    continue
                edge.append ( ( p1 , i ) )
                edge.append ( ( p2 , i ) )
            edge.sort ( )
            stack = [ ]
            for i in edge :
                if not stack :
                    stack.append ( i )
                else :
                    if stack [ - 1 ].id == i.id :
                        stack.pop ( )
                    else :
                        stack.append ( i )
            print ( ( 'YES' if stack else 'NO' ) )
        def trans ( self , x , y ) :
            if y == 0 :
                return x
            elif x == R :
                return R + y
            elif y == C :
                return 2 * R + C - x
            elif x == 0 :
                return 2 * R + 2 * C - y
            else :
                return - 1
    class Point ( object ) :
        def __init__ ( self , pos , id ) :
            self.pos = pos
            self.id = id
        def __eq__ ( self , other ) :
            return self.pos == other.pos and self.id == other.id
        def __ne__ ( self , other ) :
            return self.pos != other.pos
