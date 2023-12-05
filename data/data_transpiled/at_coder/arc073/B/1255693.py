def _main ( ) :
    import sys
    import os
    from itertools import count
    class Main ( object ) :
        def __init__ ( self ) :
            sc = sys.stdin
            f = open ( "/dev/null" , "w" )
            N = sc.count ( )
            W = sc.count ( )
            hash = { }
            min_w = - 1
            for w in range ( N ) :
                if min_w == - 1 :
                    min_w = w
                if not hash [ w ] :
                    hash [ w ] = [ ]
                hash [ w ].append ( sc.read ( ) )
        for i in range ( min_w , min_w + 3 ) :
            if hash [ i ] :
                hash [ i ].sort ( )
                hash [ i ].reverse ( )
        ans = 0
        for i in range ( 0 , N ) :
            if i * min_w > W :
                continue
            for j in range ( 0 , N ) :
                if i + j > N :
                    continue
                if i * min_w + j * ( min_w + 1 ) > W :
                    continue
                for k in range ( 0 , N ) :
                    if i + j + k > N :
                        continue
                    if i * min_w + j * ( min_w + 1 ) + k * ( min_w + 2 ) > W :
                        continue
                    for l in range ( 0 , N ) :
                        if i + j + k + l > N :
                            continue
                        if i * min_w + j * ( min_w + 1 ) + k * ( min_w + 2 ) + l * ( min_w + 3 ) > W :
                            continue
        if hash [ min_w ] :
            for i in range ( 0 , N ) :
                ans += hash [ min_w ] [ i ]
    return ans
