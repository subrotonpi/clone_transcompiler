def import import sys
import os
import sys
import itertools
class Main ( object ) :
    def __init__ ( self ) :
        Scanner ( )
        N = len ( sys.stdin )
        cnt = set ( )
        for i in range ( N ) :
            a = sys.stdin.read ( )
            if a in cnt :
                cnt.remove ( a )
            else :
                cnt.add ( a )
        print ( len ( cnt ) )
