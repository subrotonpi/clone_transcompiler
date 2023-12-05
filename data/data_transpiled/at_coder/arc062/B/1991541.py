def import import sys
import os
import sys
import getopt
class Main ( object ) :
    def __init__ ( self ) :
        self.out = sys.stdout
    def readline ( self ) :
        return sys.stdin.readline ( )
r = getopt.GetoptFromOpts ( sys.argv [ 1 : ] , None , None )
s = r [ 0 ]
n = len ( s )
a = [ [ 0 , - 1 ] , [ 1 , 0 ] ]
p = 0
for i in range ( n ) :
    p += a [ i % 2 ] [ s [ i ] == 'g' ]
print ( p )
