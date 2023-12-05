def import import sys
class Main ( object ) :
    def __init__ ( self ) :
        sc = sys.stdin
    def main ( self ) :
        n = sc.randint ( 1 , 51 )
        a = sc.randint ( 1 , 51 )
        d = [ sc.randint ( 1 , 51 ) for i in range ( 51 ) ]
        dp = [ [ 0 , 0 , 0 ] for i in range ( 60 ) ]
        dp = [ [ 0 , 0 , 0 ] for i in range ( 60 ) ]
        for x in d :
            for j in range ( n ) :
                for k in range ( 2500 ) :
                    if dp [ i ] [ j ] [ k ] > 0 :
                        dp [ i + 1 ] [ j ] [ k ] += dp [ i ] [ j ] [ k ]
                        dp [ i + 1 ] [ j + 1 ] [ k + x ] += dp [ i ] [ j ] [ k ]
    ret = 0
    for i in range ( 1 , n + 1 ) :
        for j in range ( 1 , 2500 ) :
            if i * a == j and dp [ n ] [ i ] [ j ] > 0 :
                ret += dp [ n ] [ i ] [ j ]
    print ( ret )
