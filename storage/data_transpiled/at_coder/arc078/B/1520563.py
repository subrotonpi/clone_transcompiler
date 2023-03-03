def _import ( ) : return _import ( )
import sys
import os
import sys
import getopt
import time
import time
class ConsoleScanner ( object ) :
    def __init__ ( self , args ) :
        self.stdin = sys.stdin
        self.stdout = open ( '' )
        self.stdin.readline ( )
        self.stdin.readline ( )
        self.stdin.readline ( )
        self.stdin.readline ( )
        self.stdin.readline ( )
        self.stdin.readline ( )
        self.stdin.readline ( )
        self.stdin.readline ( )
        self.stdin.readline ( )
        self.stdin.readline ( )
        self.stdin.readline ( )
    def trace ( * args ) :
        assert hasattr ( sys , '__file__' )
        self.stdout.write ( 'trace:%s\n' % ' '.join ( [ repr ( x ) for x in args ] ) )
    def solve ( self , cin , cout ) :
        n = cin ( )
        abs = [ [ cin ( ) , cin ( ) ] for x in range ( n - 1 ) ]
        start = time.time ( )
        ans = self.solve ( n , abs )
        if ans : cout ( 'Fennec' )
        else : cout ( 'Snuke' )
        self.trace ( 'elapsed' , time.time ( ) - start )
    def solve ( self , n , abs ) :
        vis = [ ]
        vis.append ( - 1 )
        FEN = 1
        SNU = 2
        adj = [ [ ] for i in range ( n + 1 ) ]
        for ab in abs :
            adj [ ab [ 0 ] ].append ( ab [ 1 ] )
            adj [ ab [ 1 ] ].append ( ab [ 0 ] )
        q = deque ( [ 1 ] )
        vis.append ( FEN )
        q.append ( n )
        vis.append ( SNU )
        while not q.empty ( ) :
            v = q.popleft ( )
            for u in vis [ v ] :
                if u in adj [ v ] : continue
                vis [ v ] = q.popleft ( )
        return vis [ 0 ]
