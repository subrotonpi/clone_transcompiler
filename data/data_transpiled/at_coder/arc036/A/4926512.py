def import _main
import sys
import itertools
class Main ( object ) :
    def __init__ ( self , * args , ** kwargs ) :
        s = raw_input ( )
        n , k , t = s.__next__ ( ) , s.__next__ ( ) , s.__next__ ( )
        print ( _int_range ( 2 , n ) + _int_range ( 2 , n ) + _int_range ( 2 , n ) )
