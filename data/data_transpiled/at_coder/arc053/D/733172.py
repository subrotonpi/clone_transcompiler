def main ( ) :
    import sys
    import random
    MOD = 1_000_000_000 + 7
    def solve ( ) :
        with open ( '/proc/sys/exit.txt' , 'r' ) as f :
            n = f.read ( )
        a = [ ]
        b = [ ]
        for i in range ( n ) :
            a.append ( i + ( i == len ( map ) - 1 ) )
        for i in range ( n ) :
            b.append ( i + ( i == len ( map ) - 1 ) )
    map = [ ]
    duplicate = [ 0 , 1 ]
    q = deque ( )
    q.append ( ( 0 , 0 ) )
    arrived = [ ]
    while not q.empty ( ) :
        p = q.popleft ( )
        for i in range ( 2 ) :
            nx = p [ 0 ] + dx [ i ]
            ny = p [ 1 ] + dy [ i ]
            if 0 <= nx < n and 0 <= ny < n and nx <= ny :
                if not arrived [ ny ] and nx != ny :
                    q.append ( ( nx , ny ) )
                    arrived [ ny ] = True
                duplicate [ ny ] [ nx ] = ( duplicate [ ny ] [ nx ] + duplicate [ p [ 1 ] ] ) % MOD
    for i in range ( n ) :
        for j in range ( n ) :
            arrived [ i ] = False
        map [ 0 ] = 1
        q = deque ( )
        q.append ( ( 0 , 0 ) )
        while not q.empty ( ) :
            p = q.popleft ( )
            if a [ p [ 0 ] ] == b [ p [ 1 ] ] :
                now = 0
                nx = p [ 0 ] + 1
                ny = p [ 1 ] + 1
                for nx in range ( n ) :
                    if a [ nx ] == b [ nx ] :
                        now += 1
                map [ nx ] [ ny ] = ( p [ 1 ] + 1 ) % MOD
    return map
