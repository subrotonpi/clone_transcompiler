def import import sys , randint , max_int , minint
from itertools import product , repeat
class Main ( object ) :
    def __init__ ( self ) :
        self.sc = sys.stdin
    def __next__ ( self , n ) :
        return int ( self.sc.next ( ) )
    def __next__ ( self , n ) :
        return intbv ( 0 ) [ n : ]
    def max ( self , * ar ) :
        ar.sort ( )
        return max ( * ar )
    def min ( self , * ar ) :
        ar.sort ( )
        return min ( * ar )
    def max_ ( self ) :
        a , b = randint ( 0 , min ( ) )
        out = max ( ( a + 1 ) * b , ( b + 1 ) * a )
        return out
