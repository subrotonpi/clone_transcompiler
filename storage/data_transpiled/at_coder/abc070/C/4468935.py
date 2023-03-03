def _import ( ) : return _import ( )
import sys
class Main ( object ) :
    def __init__ ( self ) :
        self.__main__ = sys.__main__
    def main ( self ) :
        print ( lcm ( intbv ( ) [ 0 ] ) )
    def lcm ( * args ) :
        j , temp = divmod ( args [ 0 ] , 256 )
        for arg in args [ 1 : ] :
            j = j * ( temp = int ( arg ) ) / j.gcd ( temp )
        return j
