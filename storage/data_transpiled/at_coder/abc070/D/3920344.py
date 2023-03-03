def import _main
import sys
import os
import sys
import getopt
class Main ( object ) :
    def __init__ ( self ) :
        self.list = [ ]
        self.dist = [ ]
    def __init__ ( self , to , cost ) :
        self.to = to
        self.cost = cost
    def __call__ ( self , * args ) :
        sc = open ( "/proc/" , "r" )
        n = sc.read ( )
        self.list = [ ]
        self.dist = [ ]
        for i in range ( n ) :
            self.list.append ( [ ] )
        for a , b , c in zip ( sc.list [ : - 1 ] , sc.dist [ 1 : ] ) :
            self.list [ a ].append ( ( b , c ) )
    q = len ( sys.argv )
    k = len ( sys.argv )
    dfs ( k , - 1 , 0 )
    for i in range ( q ) :
        x = sys.argv [ i ]
        y = sys.argv [ i + 1 ]
        print ( dist [ x ] + dist [ y ] )
