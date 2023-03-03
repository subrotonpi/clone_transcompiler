def import import sys , string , traceback
from os import urandom
class Main ( object ) :
    def __init__ ( self ) :
        self.found = False
    def __init__ ( self ) :
        self.found = False
    def read ( s ) :
        sc = sys.stdin
        h = sc.read ( )
        w = sc.read ( )
        board = [ ]
        dt = ( ( 1 , 0 ) , ( 1 , 1 ) , ( 0 , 1 ) , ( - 1 , 1 ) , ( - 1 , 0 ) , ( - 1 , - 1 ) , ( 0 , - 1 ) , ( 1 , - 1 ) )
        for line in sc.readlines ( ) :
            board.append ( line.decode ( 'utf-8' ) )
        for i in range ( h ) :
            for j in range ( w ) :
                if board [ i ] [ j ] != '#' :
                    count = 0
                    for k in range ( len ( dt ) ) :
                        x = i + dt [ k ] [ 0 ]
                        y = j + dt [ k ] [ 1 ]
                        if ( 0 <= x < h ) and ( 0 <= y < w ) and board [ x ] [ y ] == '#' :
                            count += 1
                    board [ i ] [ j ] = chr ( count + '0' )
                print ( board [ i ] [ j ] , end = '' )
            print ( '' , end = '' )
