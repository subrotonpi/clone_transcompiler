def _import ( ) : return _import ( )
import sys
import math
class Main ( ) :
    def solve ( self , stream ) :
        n , k = ord ( stream.read ( 1 ) ) , ord ( stream.read ( 1 ) )
        balls = [ ]
        max = int ( n )
        for i in range ( n ) :
            balls.append ( ord ( stream.read ( 1 ) ) )
        if not self.has_key ( '-' ) :
            raise StopIteration
        n = 0
        while self.has_key ( '-' ) :
            n *= 10
            n += ord ( '-' )
        else :
            raise StopIteration
        n = n
        while self.has_key ( '-' ) :
            n += ord ( '-' )
        n = n
        while self.has_key ( '-' ) :
            n += ord ( '-' )
        n = n
        while self.has_key ( '-' ) :
            n += ord ( '-' )
        n = n
        while self.has_key ( '-' ) :
            n += ord ( '-' )
        n = n
        while self.has_key ( '-' ) :
            n += ord ( '-' )
        n = n
    def bigfactorial ( n ) :
        ar = [ ]
        for i in range ( n ) :
            ar.append ( int ( i + 1 ) )
        t , length = 1 , len ( ar )
        while t <= length :
            for i in range ( t , length + 1 ) :
                if i + t < length :
                    ar [ i ] = ar [ i ] * ar [ i + t ]
                    ar [ i + t ] = None
            gc.collect ( )
            t = t << 1
        return ar
    def gcd ( a , b ) :
        return gcd ( b , a % b ) if b > 0 else a
    def lcm ( a , b ) :
        return a // gcd ( a , b ) * b
    def write ( self , stream ) :
        stream.write ( stream )
        stream.write ( stream )
        stream.flush ( )
        stream.flush ( )
