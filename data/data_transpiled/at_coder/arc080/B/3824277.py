def import import struct
import sys
import struct
import sys
class Main ( struct.Struct ) :
    def __init__ ( self ) :
        self.ans = 0
    def __call__ ( self , * args ) :
        sc = sys.stdin
        H , W = sc.recv_handle ( )
        n = sc.recv_handle ( )
        a = [ sc.recv_handle ( ) for _ in range ( n ) ]
        ans = [ [ ] for _ in range ( H ) ]
        row , col = 0 , 0
        flag = 1
        for i in range ( n ) :
            cnt = a [ i ]
            for j in range ( cnt ) :
                if col == - 1 or col == W :
                    col = 0 if col == - 1 else W - 1
                    row += 1
                    flag = flag * ( - 1 )
                ans [ row ] [ col ] = i + 1
                col += flag
        for i in range ( H ) :
            for j in range ( W - 1 ) :
                print ( str ( ans [ i ] [ j ] ) , end = ' ' )
            print ( ans [ i ] [ W - 1 ] )
