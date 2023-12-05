def import import os
import sys
import random
import string
import sys
import os
import sys
class A ( object ) :
    def __init__ ( self ) :
        self.s = sys.stdin
        self.out = sys.stdout
    def __init__ ( self , T = 1 ) :
        self.s = sys.stdin
        self.out = sys.stdout
        self.T = len ( self.s )
        for tc in range ( 1 , T + 1 ) :
            self.out.write ( 'Case #%d: ' % tc )
            N = len ( self.s )
            bloc , oloc = 1 , 1
            bextra , oextra = 0 , 0 , 0
            total = 0
            for i in range ( N ) :
                if self.s [ i ] == 'O' :
                    dest = self.s [ i ]
                    needed = max ( abs ( dest - oloc ) - oextra , 0 ) + 1
                    total += needed
                    bextra += needed
                    oextra = 0
                    oloc = dest
                else :
                    dest = self.s [ i ]
                    needed = max ( abs ( dest - bloc ) - bextra , 0 ) + 1
                    total += needed
                    oextra += needed
                    bextra = 0
                    bloc = dest
            self.out.write ( '%d\n' % total )
