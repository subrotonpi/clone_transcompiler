def import import sys , string , traceback
from os import urandom
class Main ( object ) :
    def __init__ ( self ) :
        self.found = False
    def __init__ ( self ) :
        self.found = False
    def run ( self ) :
        sc = sys.stdin
        h = sc.readline ( ).split ( ) [ 1 ]
        w = sc.readline ( ).split ( ) [ 2 ]
        board = [ ]
        for line in sc.readlines ( ) :
            board.append ( line.decode ( 'utf-8' ) )
    dt = ( ( 1 , 0 ) , ( - 1 , 0 ) , ( 0 , 1 ) , ( 0 , - 1 ) , )
    for i in range ( h ) :
        for j in range ( w ) :
            if board [ i ] [ j ] == '#' :
                ok = False
                for k in range ( len ( dt ) ) :
                    x = i + dt [ k ] [ 0 ]
                    y = j + dt [ k ] [ 1 ]
                    if ( 0 <= x < h ) and ( 0 <= y < w ) :
                        if board [ x ] [ y ] == '#' :
                            ok = True
                if not ok :
                    print ( 'No' )
                    return
    print ( 'Yes' )
