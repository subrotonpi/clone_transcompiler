def import _divmod
import math
import numpy
import os
import sys
class Main ( object ) :
    def __init__ ( self ) :
        self.N = 0
    def __call__ ( self , * args ) :
        self.N = len ( args )
    def __init__ ( self ) :
        self.N = 0
    def __init__ ( self ) :
        self.N = 0
    def total ( self ) :
        map = [ ]
        old = old2 = 0
        for i in range ( self.N ) :
            a = sys.stdin.read ( 1 )
            total += abs ( a - old )
            if i != 0 :
                if abs ( a - old ) + abs ( old - old2 ) == abs ( old2 - a ) :
                    map.append ( 0 )
                else :
                    map [ i - 1 ] = abs ( a - old ) + abs ( old - old2 ) - abs ( old2 - a )
            old2 = old
            old = a
        total += abs ( old )
        if abs ( 0 - old ) + abs ( old - old2 ) == abs ( old2 - 0 ) :
            map.append ( 0 )
        else :
            map [ N - 1 ] = abs ( 0 - old ) + abs ( old - old2 ) - abs ( old2 - 0 )
        for i in range ( self.N ) :
            print ( total - map [ i ] )
