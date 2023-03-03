def import import sys
import os
import sys
class Main ( object ) :
    def __init__ ( self ) :
        self.sys = sys
    def __call__ ( self , * args ) :
        with open ( self.sys , "r" ) as f :
            A = f.read ( )
            B = f.read ( )
            while A and sys.stdin.isatty ( ) :
                flip = sys.stdin.read ( 1 )
                A ^= flip
                B ^= flip
            if B == 0 :
                print ( 1 )
                return
            first = len ( sys.stdin.read ( 1 ) )
            second = - 1
            if B == ( 1 << first ) :
                second = - 1
            else :
                second = len ( sys.stdin.read ( 1 ) )
            l1 = A
            r1 = ( ( 1 << first ) + ( ( 1 << ( second + 1 ) ) - 1 ) )
            l2 = A + ( 1 << first )
            r2 = ( 1 << ( first + 1 ) ) - 1
            res = - 1
            if l2 <= r1 <= r2 :
                res = r2 - l1 + 1
            elif l1 <= r2 <= r1 :
                res = r1 - l1 + 1
            elif r1 <= l2 :
                res = ( r1 - l1 + 1 ) + ( r2 - l2 + 1 )
            print ( res )
    def tr ( self , * args ) :
        print ( "".join ( map ( str , args ) ) )
