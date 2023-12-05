def _import ( ) : return
import sys
import tokenize
import tokenize
import os
import sys
class Repeater ( tokenize ) :
    def __init__ ( self ) :
        self.stdin = sys.stdin
        self.stdin = sys.stdin
        self.stdin = sys.stdin
        self.stdin = sys.stdin
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
        self.stdin.readline ( )
        self.stdin.close ( )
    def func ( self ) :
        T = self.stdin.readline ( )
        for t in range ( 1 , T + 1 ) :
            print ( "Case #%d: " % t , end = ' ' )
            self.solve ( )
    def solve ( self ) :
        N = self.stdin.readline ( ).strip ( )
        words = [ s for s in self.stdin.readline ( ) if s != self.stdin.readline ( ) ]
        stripped = self.func ( words [ 0 ] )
        freqs = [ ]
        for s in self.stdin.readline ( ) :
            freqs.append ( self.func2 ( s ) )
            if not s in stripped :
                print ( "%s\n" % ( "Fegla won" , ) )
                return
        totalmoves = 0
        for k in stripped :
            freq2 = [ ( freqs [ k ] [ k ] , freqs [ k ] [ k ] ) for k in range ( N ) ]
            freq2 = [ freq2 [ k ]
            median = freq2 [ N // 2 ]