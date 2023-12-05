def import import _randint , lcm , lcm , lcm , out
import math
import random
import math
class Main ( object ) :
    def __init__ ( self ) :
        Scanner ( )
    def __next__ ( self , n ) :
        return int ( random.choice ( range ( n ) ) )
    def __next__ ( self ) :
        return intbv ( 0 ) [ n : ]
    def max ( self , * ar ) :
        ar.sort ( )
        return ar [ - 1 ]
    def min ( self , * ar ) :
        ar.sort ( )
        return ar [ 0 ]
    def maxInt ( self ) :
        return max
    def minInt ( self ) :
        return min
    def main ( ) :
        a , b , n = next ( )
        lcm = lcm ( a , b )
        out ( ( lcm * int ( math.ceil ( float ( n ) / float ( lcm ) ) ) ) )
    def gcd ( a , b ) :
        return gcd ( b , a % b ) if b else a
    def lcm ( a , b ) :
        return a * b / gcd ( a , b )
