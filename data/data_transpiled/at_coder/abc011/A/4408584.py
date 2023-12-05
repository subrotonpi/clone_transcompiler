def import import sys , string , count , maxint , minint
from time import time
class Main ( object ) :
    def __init__ ( self ) :
        self.Scanner = Scanner
    def __next__ ( self ) :
        return int ( self.Scanner.next ( ) )
    def __next__ ( self , n ) :
        return intbv ( 0 , min = 0 , max = n ) [ n : ]
    def max ( self , * ar ) :
        [ max ( self , n ) for n in ar ]
        return max ( self , n )
    def min ( self , * ar ) :
        [ min ( self , n ) for n in ar ]
        return min ( self , n )
    def maxint ( self ) :
        return int ( self.Scanner.max ( ) )
    def minint ( self ) :
        return int ( self.Scanner.min ( ) )
    def main ( ) :
        n = randint ( 0 , 12 )
        out ( n == 1 , n + 1 )
