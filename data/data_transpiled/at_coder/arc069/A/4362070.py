def import import _raw_input
import time
import math
import random
class Main ( object ) :
    def raw_input ( self ) :
        return int ( self.raw_input ( ) )
    def raw_input ( self ) :
        return float ( self.raw_input ( ) )
    def next_tuple ( self , n ) :
        return intbv ( 0 ) [ n : ]
    def max ( * ar ) :
        ar.sort ( )
        return ar [ - 1 ]
    def min ( * ar ) :
        ar.sort ( )
        return ar [ 0 ]
    def yesno ( b ) :
        return "Yes" if b else "No"
    def maxint ( ) :
        return int ( max ( ) )
    def minint ( ) :
        return int ( min ( ) )
    def main ( ) :
        s , c = random.randint ( 0 , max ( ) ) , random.randint ( 0 , min ( ) )
        if s > c / 2 :
            print ( c / 2 )
        else :
            ans = 0
            ans += s
            c -= s * 2
            ans += c / 4
            print ( ans )
