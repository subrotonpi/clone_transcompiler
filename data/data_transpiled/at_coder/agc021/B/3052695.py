def import math
class Main ( object ) :
    def __init__ ( self ) :
        sc = sys.stdin
        n = sc.recv_handle ( )
        x = [ [ sc.recv_handle ( ) , sc.recv_handle ( ) ] for i in range ( n ) ]
    def main ( ) :
        if n == 2 :
            print ( 0.5 )
            print ( 0.5 )
            return
        num = [ 0 ] * n
        import math
        N = 3500000
        r = math.pow ( 10 , 11 )
        for i in range ( N ) :
            theta = 2.0d * math.pi * float ( i ) / float ( N )
            mx = r * math.cos ( theta )
            my = r * math.sin ( theta )
            min = math.pow ( 10 , 200 )
            minpos = 0
            for j in range ( n ) :
                len = math.pow ( float ( x [ j ] [ 0 ] ) - mx , 2 ) + math.pow ( float ( x [ j ] [ 1 ] ) - my , 2 )
                if len < min :
                    min = len
                    minpos = j
            num [ minpos ] += 1
        for i in range ( n ) :
            print ( float ( num [ i ] ) / float ( N ) )
