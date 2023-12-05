def import import os
import sys
import string
import sys
import math
class Main ( object ) :
    def __init__ ( self ) :
        sc = sys.stdin
        N = sc.readline ( )
        sc.readline ( )
        line = sc.readline ( )
        M = sc.readline ( )
        line_list = line.split ( )
        T = [ int ( i ) for i in line_list ]
        P = [ ]
        X = [ ]
        for i in range ( N ) :
            T.append ( int ( i ) )
        for i in range ( M ) :
            P.append ( sc.readline ( ) )
            X.append ( sc.readline ( ) )
        for i in range ( M ) :
            sum = 0
            for j in range ( N ) :
                if P [ i ] - 1 == j :
                    sum += X [ i ]
                else :
                    sum += T [ j ]
            print ( sum )
