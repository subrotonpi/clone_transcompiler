def import math
class Main ( object ) :
    def __init__ ( self ) :
        sc = sys.stdin
        N = sc.recv_handle ( )
        x = [ sc.recv_handle ( ) for _ in range ( N ) ]
        y = [ sc.recv_handle ( ) for _ in range ( N ) ]
        answer = 0
        tmp = 0
        for i in range ( N ) :
            for j in range ( i + 1 , N ) :
                tmp = ( x [ i ] - x [ j ] ) ** 2 + ( y [ i ] - y [ j ] ) ** 2
                if answer < tmp :
                    answer = tmp
        print ( math.sqrt ( answer ) )
        sc.close ( )
