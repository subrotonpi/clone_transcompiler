def _import ( ) :
    import time
    import sys
    import time
    import sys
    class B :
        SAMPLE = False
        sc = 0
        M = 200010
        INF = 1 << 60
        def solve ( caseid ) :
            L = sc.randint ( 0 , M )
            N = sc.randint ( 0 , M )
            is = [ ]
            for i in range ( N ) :
                is.append ( sc.randint ( 0 , M ) )
            sort ( is )
            min = [ ]
            que = PriorityQueue ( )
            fill ( min , INF )
            for j in range ( M ) :
                if ( L - j ) % is [ N - 1 ] == 0 :
                    min.append ( ( L - j ) / is [ N - 1 ] )
                    que.put ( ( j , ( L - j ) / is [ N - 1 ] ) )
            while not que.empty ( ) :
                e = que.get ( )
                if min [ e.i ] < e.t : continue
                for i in range ( N - 1 ) :
                    d , f = is [ i ] , is [ N - 1 ] - is [ i ]
                    if e.i - d >= 0 and min [ e.i - d ] > min [ e.i ] + 1 :
                        min [ e.i - d ] = min [ e.i ] + 1
                        que.put ( ( e.i - d , min [ e.i - d ] ) )
                    if e.i + f < M and min [ e.i + f ] > min [ e.i ] :
                        min [ e.i + f ] = min [ e.i ]
                        que.put ( ( e.i + f , min [ e.i ] ) )
            if min [ 0 ] == INF : print ( "IMPOSSIBLE" )
            else : print ( min [ 0 ] )
    class Entry :
        def __init__ ( self , i , t ) :
            self.i = i
            self.t = t
        def run ( self ) :
            time = time.time ( )
            sc = 0
            for i in range ( 1 , caseid + 1 ) :
                self.i = i
                self.t = t
    return