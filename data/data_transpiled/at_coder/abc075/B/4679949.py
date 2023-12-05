def import sys
class Main ( object ) :
    def __init__ ( self ) :
        sc = sys.stdin
        H = sc.recv_handle ( )
        W = sc.recv_handle ( )
        a = [ ]
        for str in sc.split ( ) :
            for j in range ( 1 , W + 1 ) :
                a.append ( [ str [ j - 1 ] ] )
        for i in range ( 1 , H + 1 ) :
            for j in range ( 1 , W + 1 ) :
                if a [ i ] [ j ] == '.' :
                    print ( ( '#' * ( ( i - 1 ) [ j ] == '#' ) + '' ) , end = '' )
                else :
                    print ( '#' * ( ( i - 1 ) [ j ] == '#' ) + '' )
            print ( )
