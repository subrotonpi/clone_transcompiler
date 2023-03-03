def import import sys , randint , choice , maxint , minint
from random import randint
class Main ( object ) :
    def __init__ ( self ) :
        self.raw_input = raw_input
    def __next__ ( self , n ) :
        return intbv ( 0 , min = 0 , max = max ) [ n : ]
    def __next__ ( self ) :
        return intbv ( 0 , min = min , max = max ) [ n : ]
    def max ( self , * ar ) :
        ar.sort ( )
        return max ( self.raw_input )
    def min ( self , * ar ) :
        ar.sort ( )
        return min ( self.raw_input )
    def maxint ( self ) :
        return max ( self.raw_input )
    def minint ( self ) :
        return min ( self.raw_input )
    def main ( ) :
        out ( randint ( 0 , min ) % randint ( 0 , max ) == 0 and 'YES' or 'NO' )
