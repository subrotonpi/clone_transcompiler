def import _main
class Main ( object ) :
    def __init__ ( self ) :
        sc = _main ( )
        N = sc.recv_handle ( )
        M = sc.recv_handle ( )
        x = [ sc.recv_handle ( ) for _ in range ( M ) ]
        y = [ sc.recv_handle ( ) for _ in range ( M ) ]
        num = [ 1 ] + [ 0 ] * N
        red = [ 1 ] + [ True ] * N
        for from_i , to_i in zip ( x , y ) :
            if red [ from_i ] :
                red [ to_i ] = True
            num [ from_i ] -= 1
            num [ to_i ] += 1
            if num [ from_i ] == 0 :
                red [ from_i ] = False
        ans = 0
        for i in range ( 1 , N + 1 ) :
            if red [ i ] :
                ans += 1
        print ( ans )
