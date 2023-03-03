def import import sys , randint , random , randint , random , max_int , minint
from math import ceil
from random import randint
class Main ( object ) :
    def __init__ ( self ) :
        self.sc = sys.stdin
    def __next__ ( self , n ) :
        return randint ( 0 , random ( ) )
    def __next__ ( self , n ) :
        return intbv ( 0 ) [ n : ]
    def max ( self , * ar ) :
        ar.sort ( )
        return max ( self , ar [ - 1 ] )
    def min ( self , * ar ) :
        ar.sort ( )
        return min ( self , ar [ 0 ] )
    def max_ ( self ) :
        a , b = randint ( 0 , min ( ) ) , randint ( 0 , max ( ) )
        out ( int ( ceil ( float ( b ) / float ( a ) ) ) )
