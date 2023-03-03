def _import ( ) : return _readline
import readline
import readline
import time
import math
import random
import string
import string
import int
import math
import random
import string
import time
import sys
class Main ( ) :
    def __init__ ( self ) :
        sc = FastScanner ( )
        S = sc.next
        print ( self.solve ( ) )
    def solve ( self ) :
        C = [ ]
        for i in range ( len ( self ) - 1 , - 1 , - 1 ) :
            c = self.S [ i ]
            C.append ( c )
            if c == '+' :
                C [ i - 1 ] += 1
            elif c == '-' :
                C [ i - 1 ] -= 1
        L = [ ]
        R = [ ]
        for i in range ( len ( self.S ) ) :
            if self.S [ i ] == 'M' :
                L.append ( - C [ i ] )
                R.append ( C [ i ] )
        self.sort ( )
        L.reverse ( )
        R.reverse ( )
        ans = 0
        for i in range ( len ( L ) // 2 ) :
            ans += L [ i ]
        for i in range ( len ( R ) // 2 ) :
            ans += R [ i ]
        return ans
    @ staticmethod
    def readline ( ) :
        if not sys.stdin.isatty ( ) or not sys.stdin.isatty ( ) :
            try :
                return readline ( )
            except EOFError :
                pass
        return None
