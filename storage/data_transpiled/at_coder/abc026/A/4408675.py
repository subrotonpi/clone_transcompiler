def import import sys , randint , rl_max , min , maxint , minint
from time import time
class Main ( object ) :
    def __init__ ( self ) :
        self.sc = sys.stdin
    def __next__ ( self , n ) :
        return int ( time ( ) )
    def __next__ ( self ) :
        return intbv ( 0 ) [ n : ]
    def max ( self , * ar ) :
        ar.sort ( )
        return max ( self.sc , ar [ - 1 ] )
    def min ( self , * ar ) :
        ar.sort ( )
        return min ( self.sc , ar [ 0 ] )
    def maxint ( self ) :
        return max ( self.sc , 0 )
    def minint ( self ) :
        return min ( self.sc , 0 )
    def main ( self ) :
        n = randint ( 0 , n )
        out ( n / 2 * ( n - n / 2 ) )
