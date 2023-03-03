def import _np
import sys
import itertools
import os
import sys
class Main ( object ) :
    def __init__ ( self ) :
        self.sc = sys.stdin
        self.N , b , c , d = self.sc.count ( )
        self.a = [ ]
        for i in range ( self.N ) :
            b = self.sc.next ( )
            self.a.append ( b )
        self.a = sorted ( list ( reversed ( a ) ) )
        for i in range ( self.N ) :
            c += self.a [ i ]
            self.i += 1
            if i < self.N :
                d += self.a [ i ]
        print ( c - d )
        self.sc.close ( )
