def import _dict2
import os
import sys
class Main ( object ) :
    def __init__ ( self ) :
        with open ( sys.argv [ 1 ] ) as sc :
            w = sc.read ( ).split ( '' )
    d = { }
    for x in w :
        if x in d :
            d [ x ] = d [ x ] + 1
            continue
        d [ x ] = 1
    for key in d :
        if d [ key ] % 2 == 1 :
            print ( "No" )
            return
    print ( "Yes" )
