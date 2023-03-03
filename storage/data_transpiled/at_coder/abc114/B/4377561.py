def import import sys
import math
import os
import sys
class Main ( object ) :
    def __init__ ( self ) :
        with open ( sys.argv [ 1 ] ) as sc :
            s = sc.read ( )
    def main ( self ) :
        ans = 1000
        for i in range ( 2 , len ( s ) ) :
            if abs ( int ( s [ i - 2 ] ) - 753 ) < ans :
                ans = abs ( int ( s [ i - 2 ] ) - 753 )
        print ( ans )
