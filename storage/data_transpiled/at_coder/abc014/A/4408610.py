def import import sys , randint , random , randint , max_ , min_
from itertools import chain
class Main ( object ) :
    def __init__ ( self ) :
        self.sc = sys.stdin
    def __next__ ( self , n ) :
        return randint ( 0 , n )
    def __next__ ( self ) :
        return intbv ( 0 ) [ n : ]
    def max ( self , * ar ) :
        ar.sort ( )
        return max ( self , ar [ - 1 ] )
    def min ( self , * ar ) :
        ar.sort ( )
        return min ( self , ar [ 0 ] )
    def max_ ( self ) :
        a , b = randint ( 0 , min ( self , a ) )
        out ( a % b or 0 , b - ( a % b ) )
