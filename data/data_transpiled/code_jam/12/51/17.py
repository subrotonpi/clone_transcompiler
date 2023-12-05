def import _py_func
import sys
import os
import sys
import time
class A :
    def __init__ ( self , a , b ) :
        self.a = a
        self.b = b
    def __lt__ ( self , other ) :
        if self.a [ 1 ] > other.a [ 1 ] :
            return - 1
        if self.a [ 1 ] < other.a [ 1 ] :
            return 1
        return self.a [ 0 ] - other.a [ 0 ]
    def main ( args ) :
        Scanner = sys.stdin
        T = Scanner.number
        for ca in range ( 1 , T + 1 ) :
            n = Scanner.number
            for i in range ( n ) :
                Scanner.number = i
            a = [ ( i , a [ i ] ) for i in range ( n ) ]
            a.sort ( cmp = __lt__ )
            print ( "Case #%d:" % ca , end = ' ' )
            for i in range ( n ) :
                print ( " %s" % a [ i ] , end = ' ' )
            print ( )
