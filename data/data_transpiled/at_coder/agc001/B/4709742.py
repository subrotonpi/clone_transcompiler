def import import sys , time
from math import sin , cos , tan
from os import urandom
from os import urandom
from math import sin , cos , tan
class Main ( object ) :
    def __init__ ( self , * args ) :
        Scanner ( )
        n = int ( urandom ( 1 ) )
        x = int ( urandom ( 1 ) )
        self.out.write ( f ( x , n - x ) + n )
    def f ( a , b ) :
        if a > b :
            t = a
            a , b = b , t
        if b % a == 0 :
            return ( b // a - 1 ) * 2 * a + a
        return 2 * a * ( b // a ) + f ( b % a , a )
