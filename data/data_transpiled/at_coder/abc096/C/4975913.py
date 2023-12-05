def import import string
import sys
import getopt
class Main ( object ) :
    def __init__ ( self ) :
        self.usage = ""
    def __init__ ( self , size , line ) :
        self.size = size
    H = int ( sys.stdin.read ( ) )
    W = int ( sys.stdin.read ( ) )
    S = [ ]
    for i in range ( H ) :
        S.append ( line )
    xs = [ - 1 , 1 , 0 , 0 ]
    ys = [ 0 , 0 , 1 , - 1 ]
    for y in range ( H ) :
        for x in range ( W ) :
            ks = [ False ] * 4
            if S [ y ] [ x ] == '#' :
                for k in range ( 4 ) :
                    if 0 <= x + xs [ k ] < W and 0 <= y + ys [ k ] < H and S [ y + ys [ k ] ] [ x + xs [ k ] ] == '#' :
                        ks [ k ] = True
                ans = False
                for i in range ( 4 ) :
                    if ks [ i ] :
                        ans = True
                if not ans :
                    self.print ( "No" )
                    return
    self.print ( "Yes" )
