def import import sys
import os
import sys
class Main ( object ) :
    def __init__ ( self ) :
        sc = sys.stdin
        n = int ( sc.readline ( ) )
        d = [ int ( i ) for i in sc.readline ( ).split ( ) ]
        num = [ 0 ] * 101
        for i in range ( n ) :
            num [ d [ i ] ] += 1
        cnt = 0
        for i in range ( 101 ) :
            if num [ i ] > 0 :
                cnt += 1
        print ( cnt )
