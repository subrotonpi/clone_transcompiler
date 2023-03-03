def import import sys
import os
import sys
class Main ( object ) :
    def __init__ ( self ) :
        self.n = sys.maxint
        self.k = sys.maxint
    def __init__ ( self ) :
        self.n = n
        self.k = k
    def solve ( n , k ) :
        a = [ ]
        sum = [ 0 ] * n
        sum = [ 0 ] * n
        for i in range ( n ) :
            sum [ i ] = sum [ i - 1 ] + a [ i ]
        su = sum [ k - 1 ]
        for i in range ( k , n ) :
            su += sum [ i ] - sum [ i - k ]
        print ( su )
