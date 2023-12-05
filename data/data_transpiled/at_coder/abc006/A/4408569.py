def import import sys , string , count , repeat , max_int , min_int
from itertools import repeat
class Main ( object ) :
    def __init__ ( self ) :
        self.sc = sys.stdin
    def __next__ ( self ) :
        return int ( self.sc )
    def __next__ ( self , n ) :
        return intbv ( 0 ) [ n : ]
    def max ( self , * ar ) :
        self.ar.sort ( )
        return max ( self.ar [ - 1 ] )
    def min ( self , * ar ) :
        self.ar.sort ( )
        return min ( self.ar [ 0 ] )
    def max_ ( self ) :
        self.ar.sort ( )
        return max ( self.ar )
    def min_ ( self ) :
        self.ar.sort ( )
        return min ( self.ar )
    def main ( ) :
        n = randint ( 1 , 3 )
        out ( 'YES' if n % 3 == 0 or str ( n ) in "3" else 'NO' )
