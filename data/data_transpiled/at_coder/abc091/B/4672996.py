def import import os , sys , getopt
from io import StringIO
import sys
class Main ( object ) :
    def __init__ ( self , f ) :
        self.f = f
        self.n = int ( self.n )
        for i in range ( self.n ) :
            key = os.path.basename ( self.f.readline ( ) )
            if self.f.readline ( ) in map :
                map [ key ] = map [ key ] + 1
            else :
                map [ key ] = 1
        m = int ( self.m )
        for i in range ( self.m ) :
            key = os.path.basename ( self.f.readline ( ) )
            if self.f.readline ( ) in map :
                map [ key ] = map [ key ] - 1
            else :
                map [ key ] = - 1
    sys.stdout.write ( '\n' )
    max = - 1
    for val in getopt.getopts ( ) :
        if val < 0 :
            max = val
    print ( max < 0 )
