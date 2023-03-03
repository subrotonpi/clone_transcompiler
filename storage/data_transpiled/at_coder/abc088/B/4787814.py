def import _calc
import sys
import os
import sys
class Main ( object ) :
    def __init__ ( self , arg ) :
        sc = sys.stdin
        N = sc.readline ( )
        sc.readline ( )
        A = sc.readline ( )
        a = [ ]
        sc.close ( )
        for i in range ( N ) :
            s = A.split ( )
            a.append ( int ( s [ i ] ) )
        print ( calc ( a ) )
    def calc ( a ) :
        Alice = 0
        Bob = 0
        a.sort ( key = lambda x : x [ 1 ] )
        for i , x in enumerate ( a ) :
            if i % 2 == 0 :
                Alice += x
            else :
                Bob += x
        return Alice - Bob
