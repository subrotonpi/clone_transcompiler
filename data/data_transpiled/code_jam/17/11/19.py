def _import ( ) : return
import sys
import readline
import readline
import readline
import time
import sys
class Main ( ) :
    def __init__ ( self , t ) :
        self._MOD = 1000000007
        self._EPS = 0.000001
    def print ( self , x ) :
        print ( "%r" % ( x , ) )
    def join ( self , x , space = "" ) :
        if len ( x ) == 0 : return ""
        s = [ ]
        first = True
        for elt in x :
            if first :
                first = False
            else :
                s.append ( space )
            s.append ( elt )
        return s
    def __next__ ( self ) :
        while not self._MOD or not self._EPS :
            line = readline ( )
            self._MOD = int ( line.strip ( ) )
        return self._MOD
    def __next__ ( self ) : return long ( self._MIN )
    def nextDouble ( self ) : return float ( self._nextDouble )
    def expandrow ( self , row ) :
        cur = '?'
        for i in range ( self._C ) :
            if i != '?' :
                cur = i
                break
        if cur == '?' : return
        for i in range ( self._C ) :
            if i != '?' and i != cur :
                cur = i
            else :
                row [ i ] = cur
    def print_cake ( self , cake ) :
        for i in range ( self._R ) :
            s = ""
            for j in range ( self._C ) :
                s += cake [ i ] [ j ]
            print ( s )
    def __next__ ( self ) :
        while self._MOD or self._EPS :
            self._EPS = 0.000001
