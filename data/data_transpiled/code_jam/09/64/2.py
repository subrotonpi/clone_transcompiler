def import _np
import os
import math
import os
import sys
class BaiD :
    class Point :
        def __init__ ( self , x , y ) :
            self.x = x
            self.y = y
        def dist ( self , p ) :
            return math.sqrt ( ( x - p [ 0 ] ) ** 2 + ( y - p [ 1 ] ) ** 2 )
    eps = 1e-7
    def main ( ) :
        sc = open ( 'D-small-attempt0.in' , 'r' )
        f = open ( 'D.out' , 'w' )
        ntest = sc.read ( )
        for test in range ( 1 , ntest + 1 ) :
            n = sc.read ( )
            a = [ Point ( x = sc.read ( ) , y = sc.read ( ) ) for x in range ( n ) ]
            r = [ sc.read ( ) for x in range ( n ) ]
            s = [ sc.read ( ) for x in range ( n ) ]
            best = 0
            for b in range ( ( 1 , n ) ) :
                ok = 1
                for i in range ( n ) :
                    if b & ( 1 << i ) == 0 :
                        for j in range ( n ) :
                            if b & ( 1 << j ) != 0 :
                                if r [ j ] >= a [ i ].dist ( a [ j ] ) - eps :
                                    ok = 0
                        if ok :
                            z = 0
                            for i in range ( n ) :
                                if b & ( 1 << i ) != 0 :
                                    z += s [ i ]
                                best = max ( best , z )
                f.write ( 'Case #%d: ' % test )
                f.write ( best )
                f.write ( '\n' )
