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
        x = [ ]
        y = [ ]
        for i in range ( M ) :
            x.append ( random.randint ( 0 , M ) )
            y.append ( random.randint ( 0 , M ) )
    red_exists = [ False ] * ( N + 1 )
    nums = [ 1 ] * ( N + 1 )
    nums [ 1 ] = 1
    for i in range ( M ) :
        if red_exists [ x [ i ] ] :
            if nums [ x [ i ] ] == 1 :
                red_exists [ x [ i ] ] = False
            red_exists [ y [ i ] ] = True
        nums [ x [ i ] ] -= 1
        nums [ y [ i ] ] += 1
    cnt = 0
    for n in range ( 1 , N + 1 ) :
        if red_exists [ n ] :
            cnt += 1
    print ( cnt )
