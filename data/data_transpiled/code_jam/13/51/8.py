def _import ( * args ) : return _import ( * args )
import sys
import os
import sys
import struct
class A ( object ) :
    def __init__ ( self ) :
        Scanner.__init__ ( self )
    def read ( self ) :
        B = struct.unpack ( 'B' , self.read ( ) ) [ 0 ]
        N = struct.unpack ( 'N' , self.read ( ) ) [ 0 ]
        X = [ ]
        for i in range ( N ) :
            X.append ( struct.unpack ( 'B' , self.read ( ) ) [ 0 ] )
    def solve ( self ) :
        self.sort ( X )
        X = sorted ( [ ] )
        for i in range ( 37 ) :
            for j in range ( - 2 , 2 ) :
                if i + j > 0 :
                    X.append ( i + j )
        res = 0
        for k in range ( 1 , 37 ) :
            loop :
                for x in X :
                    need = can = int ( x )
                    num = 0
                    for i in range ( k ) :
                        if i > x :
                            continue loop
                        need += x - X [ i ]
                        num += 1
                    need2 = num2 = 0
                    for i in range ( k ) :
                        if i <= x :
                            need2 += x - X [ i ] + 1
                            num2 += 1
                        else :
                            can = min ( can , X [ i ] - 1 )
                    if need + need2 <= B :
                        i = 0
                        for add in range ( 10000000000L , 0 , 10000000000L ) :
                            for x in range ( i , can + num * i + need2 + num2 * i ) :
                                res = max ( res , ( need + num * i ) * 36.0 / k - need - num * i - need2 - num2 * i )
                            i -= add
            sys.stdout.write ( "%.10f" % res )
    def debug ( * os ) :
        print ( * map ( debug , os.listdir ( * os ) ) )
    def run ( self ) :
        caseN = struct.unpack ( 'B' , self.read ( ) ) [