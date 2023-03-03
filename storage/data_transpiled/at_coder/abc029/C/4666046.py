def import import sys
import string
import sys
class Main ( object ) :
    def __init__ ( self ) :
        Scanner ( )
        N = sys.stdin.readline ( ).split ( ) [ 0 ]
        self.solve ( N , '' )
    def solve ( self , n , str ) :
        if n == 0 :
            self.out ( str )
        else :
            self.n -= 1
            for c in [ 'a' , 'b' , 'c' ] :
                next_str = str + c
                self.solve ( self , n , next_str )
