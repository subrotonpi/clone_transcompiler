def import import sys
import os
import sys
import getopt
class Main ( object ) :
    def __init__ ( self ) :
        self.out = sys.stdin
    def __init__ ( self , n ) :
        self.out = sys.stdout
    def readline ( ) :
        r = getopt.gnu_readline ( )
        n = int ( r [ 0 ] )
        a = [ int ( i ) for i in r [ 1 : ] ]
        x = [ int ( i ) for i in r [ 2 : ] ]
        if a [ 0 ] > 0 :
            print ( - 1 )
            sys.exit ( )
        for i in range ( n ) :
            if a [ i + 1 ] - a [ i ] > 1 :
                print ( - 1 )
                sys.exit ( )
        v = 0
        for i in range ( 1 , n + 1 ) :
            if a [ i - 1 ] + 1 == a [ i ] :
                v += 1
            else :
                v += a [ i ]
        print ( v )
