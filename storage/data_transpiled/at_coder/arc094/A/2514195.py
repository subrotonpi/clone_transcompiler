def import solve
import sys
import os
class Main ( object ) :
    def __init__ ( self ) :
        self.solve ( )
    def solve ( self ) :
        sc = sys.stdin
        a = [ ]
        max = 0
        for i in range ( 3 ) :
            a.append ( sc.read ( ) )
            max = int ( max )
        count = 0
        for i in range ( 3 ) :
            x = ( max - a [ i ] ) / 2
            a [ i ] += x * 2
            count += x
        a = sorted ( a )
        if a [ 0 ] == a [ 1 ] and a [ 1 ] == a [ 2 ] :
            pass
        elif a [ 2 ] == a [ 1 ] :
            count += 2
        else :
            count += 1
        print ( count )
