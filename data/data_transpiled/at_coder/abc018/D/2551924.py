def import readline
import sys
from io import StringIO
from random import randint
from time import sleep
from itertools import chain
from itertools import chain
class Main ( object ) :
    def __init__ ( self ) :
        super ( Main , self ).__init__ ( )
        self.n , m , p , q , r = next ( iter ( iterable ( repeat ( n ) ) ) )
        xs = [ randint ( 0 , n - 1 ) for n in range ( r ) ]
        ys = [ randint ( 0 , n - 1 ) for n in range ( r ) ]
        zs = [ randint ( 0 , n - 1 ) for n in range ( r ) ]
        self.solve ( )
    def solve ( ) :
        max = 0
        for girls in chain ( ( 1 , ) , repeat ( n ) ) :
            if sum ( girls ) != p :
                continue
            boy_values = [ 0 ] * m
            for i in range ( r ) :
                g = 1 << xs [ i ]
                if g & girls :
                    boy_values [ ys [ i ] ] += zs [ i ]
            boy_values.sort ( )
            value = 0
            for i in range ( m - 1 , m - q , - 1 ) :
                value += boy_values [ i ]
            if max < value :
                max = value
        print ( max )
    class FastReader ( object ) :
        def readline ( self ) :
            while not self.empty or not self.empty :
                try :
                    self.readline ( )
                except EOFError :
                    pass
            return self.readline ( )
        def __next__ ( self ) :
            return int ( next ( self ) )
        def __next__ ( self ) :
            return int ( next ( self ) )
        def __next__ ( self ) :
            return int ( next ( self ) )
        def __next__ ( self ) :
            return int ( next ( self ) )
        def __next__ ( self ) :
            return int ( next ( self ) )
