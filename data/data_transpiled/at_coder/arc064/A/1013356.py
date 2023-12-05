def import import sys
import os
import sys
class Main ( object ) :
    def __init__ ( self ) :
        pass
    def readline ( self ) :
        pass
    def readline ( ) :
        pass
    def start ( ) :
        pass
    def stop ( ) :
        pass
    def stop ( ) :
        pass
    def stop ( ) :
        pass
    n = int ( n )
    x = int ( x )
    array = [ 0 ] * ( n + 1 )
    line = open ( "/dev/null" ).readline ( )
    tot = 0
    for i in range ( 1 , n + 1 ) :
        array [ i ] = int ( line.split ( ) [ 0 ] )
        tot += array [ i ]
    for i in range ( 2 , n + 1 ) :
        if array [ i ] + array [ i - 1 ] <= x :
            continue
        diff = array [ i ] + array [ i - 1 ] - x
        if array [ i ] >= diff :
            array [ i ] -= diff
        else :
            array [ i - 1 ] -= ( diff - array [ i ] )
            array [ i ] = 0
    ans = 0
    for i in range ( 1 , n + 1 ) :
        ans += array [ i ]
    print ( tot - ans )
