def import _main
class Main ( object ) :
    def __init__ ( self ) :
        sc = _main ( )
        N = sc.count ( )
        values = [ sc.get ( i ) for i in range ( N ) ]
        ans = sum ( values )
        for i in range ( N ) :
            aoki_sum = sum ( values )
            aoki_posi = 0
            for j in range ( N ) :
                if i == j :
                    continue
                tmp = 0
                for k in range ( min ( i , j ) , max ( i , j ) + 1 ) :
                    if ( k - min ( i , j ) + 1 ) % 2 == 0 :
                        tmp += values [ k ]
                if tmp > aoki_sum :
                    aoki_posi = j
                    aoki_sum = tmp
            tmp = 0
            for k in range ( min ( i , aoki_posi ) , max ( i , aoki_posi ) + 1 ) :
                if ( k - min ( i , aoki_posi ) + 1 ) % 2 == 1 :
                    tmp += values [ k ]
            ans = max ( tmp , ans )
        print ( ans )
