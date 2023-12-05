def import import sys
class Main ( object ) :
    def __init__ ( self ) :
        sc = sys.stdin
        H , W = sc.recv_match ( type = 'N' )
        a = sc.split ( )
        for i in range ( H * 2 ) :
            print ( a [ i // 2 ] )
