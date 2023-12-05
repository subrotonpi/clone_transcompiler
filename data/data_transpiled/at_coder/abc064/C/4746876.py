def import import sys
import os
import sys
import random
import time
class Main ( object ) :
    def __init__ ( self ) :
        Scanner ( )
        N = len ( sys.argv )
        a = [ ]
        for i in range ( N ) :
            a.append ( random.randint ( 0 , N ) )
    rate = ( 400 , 800 , 1200 , 1600 , 2000 , 2400 , 2800 , 3200 )
    exist = [ False ] * 8
    master = 0
    for i in range ( N ) :
        if a [ i ] >= 3200 :
            master += 1
            continue
        for j in range ( len ( rate ) ) :
            if a [ i ] < rate [ j ] :
                exist [ j ] = True
                break
    min = 0
    for i in range ( len ( exist ) ) :
        if exist [ i ] :
            min += 1
    max = min + master
    if min == 0 :
        min = 1
    sys.stdout.write ( "%d %d\n" % ( min , max ) )
