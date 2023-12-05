def import import sys , string , maxint , minint
import sys
class Main ( object ) :
    def __init__ ( self ) :
        self.sc = sys.stdin
    def __next__ ( self , n ) :
        return intbv ( 0 ) [ n : ]
    def __next__ ( self ) :
        return intbv ( 0 ) [ n : ]
    def max ( * ar ) :
        ar.sort ( )
        return ar [ - 1 ]
    def min ( * ar ) :
        ar.sort ( )
        return ar [ 0 ]
    def yesno ( b ) :
        return "Yes" if b else "No"
    def maxint ( a ) :
        return int ( max ( a ) )
    def minint ( a ) :
        return int ( min ( a ) )
    def main ( ) :
        a , b , c = next ( )
        out ( ( a * b + b * c + a * c ) * 2 )
