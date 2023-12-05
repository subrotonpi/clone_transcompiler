def import import sys
import os
import sys
import random
import time
class Main ( object ) :
    def __init__ ( self ) :
        Scanner ( )
        N = int ( sys.stdin.readline ( ) )
        M = int ( sys.stdin.readline ( ) )
        Q = int ( sys.stdin.readline ( ) )
        sum = [ [ 0 ] * ( N + 1 ) for i in range ( M ) ]
        for i in range ( N + 1 ) :
            sum [ i ] [ i ] += 1
        p = [ ]
        q = [ ]
        for i in range ( Q ) :
            p.append ( i )
            q.append ( i )
        for i in range ( 1 , N + 1 ) :
            for j in range ( 1 , N + 1 ) :
                sum [ i ] [ j ] += sum [ i - 1 ] [ j ]
                sum [ i ] [ j ] += sum [ i ] [ j - 1 ]
                sum [ i ] [ j ] -= sum [ i - 1 ] [ j - 1 ]
        for i in range ( Q ) :
            self.out.write ( sum [ q [ i ] ] [ q [ i ] ] - sum [ p [ i ] - 1 ] [ q [ i ] ] - sum [ q [ i ] ] [ p [ i ] - 1 ] + sum [ p [ i ] - 1 ] [ p [ i ] - 1 ] )
