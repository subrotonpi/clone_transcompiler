def import import sys
class Main ( object ) :
    def main ( sc ) :
        n = sc.recv_number ( )
        a = [ sc.recv ( 3 * n ) for i in range ( 3 * n ) ]
        sumr = [ 0 ] * ( n + 1 )
        sumb = [ 0 ] * ( n + 1 )
        rq = Queue ( ( lambda x , y : cmp ( x , y ) ) )
        bq = Queue ( ( lambda x , y : cmp ( x , y ) ) )
        for i in range ( n ) :
            rq.put ( a [ i ] )
            sumr [ 0 ] += a [ i ]
            bq.put ( a [ 2 * n + i ] )
            sumb [ n ] += a [ 2 * n + i ]
        for i in range ( n , 2 * n ) :
            sumr [ i - n + 1 ] = sumr [ i - n ] + a [ i ]
            rq.put ( a [ i ] )
            sumr [ i - n + 1 ] -= rq.get ( )
            sumb [ 2 * n - i - 1 ] = sumb [ 2 * n - i ] + a [ 3 * n - i - 1 ]
            bq.put ( a [ 3 * n - i - 1 ] )
            sumb [ 2 * n - i - 1 ] -= bq.get ( )
        ans = sumr [ n ] - sumb [ n ]
        for i in range ( n ) :
            ans = max ( ans , sumr [ i ] - sumb [ i ] )
        print ( ans )
