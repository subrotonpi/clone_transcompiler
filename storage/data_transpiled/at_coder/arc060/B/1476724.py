def import import os , f , g
from math import sqrt , sin , cos , tan , rsqrt
class Main ( object ) :
    def __init__ ( self ) :
        super ( Main , self ).__init__ ( )
        self.n = sin ( x )
        self.s = sin ( x )
        sqrt = int ( sqrt ( n ) )
        for b in range ( 2 , sqrt + 1 ) :
            if f ( n , b ) == s :
                print ( b )
                return
        if n - s == 0 :
            print ( n + 1 )
            return
        div = [ ]
        for i in range ( 1 , 2 ** i - s + 1 ) :
            if ( n - s ) % i == 0 :
                div.append ( i )
                div.append ( ( n - s ) / i )
        div.sort ( )
        for v in div :
            if f ( n , v + 1 ) == s :
                print ( v + 1 )
                return
        print ( - 1 )
    def f ( n , b ) :
        ret = 0
        while n > 0 :
            ret += n % b
            n /= b
        return ret
    def tr ( * args ) :
        print ( sum ( args ) )
