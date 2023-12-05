def import _main
import sys
import os
import sys
import random
import time
import sys
class Main ( object ) :
    def __init__ ( self ) :
        self.n = int ( sys.stdin.readline ( ) )
        self.g = [ ]
        self.deg = [ ]
        for i in range ( n ) :
            self.g.append ( [ ] )
        for i in range ( 1 , n ) :
            a = random.randint ( 0 , 1 ) - 1
            self.g [ a ].append ( i )
            self.g [ i ].append ( a )
        self.dfs ( 0 , - 1 )
        print ( self.deg [ 0 ] )
    def dfs ( cur , par ) :
        if cur != 0 and len ( self.g ) == 1 :
            self.deg [ cur ] = 0
            return
        elif len ( self.g ) == 0 :
            self.deg [ cur ] = 0
            return
        v = [ ]
        for dst in self.g :
            if dst == par :
                continue
            dfs ( dst , cur )
            v.append ( cur )
