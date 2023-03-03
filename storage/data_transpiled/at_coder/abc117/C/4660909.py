def import import sys
import random
import time
class Main ( object ) :
    def __init__ ( self ) :
        self.n = int ( sys.stdin.readline ( ) )
        self.m = int ( sys.stdin.readline ( ) )
    def __call__ ( self , n , m ) :
        x = random.sample ( range ( m ) , n )
        if n >= m :
            print ( 0 )
            return
        x.sort ( )
        d = [ ]
        for i in range ( m - 1 ) :
            d.append ( x [ i + 1 ] - x [ i ] )
        d.sort ( )
        sum = 0
        for i in range ( n - 1 ) :
            sum += d [ len ( d ) - i - 1 ]
        print ( x [ m - 1 ] - x [ 0 ] - sum )
