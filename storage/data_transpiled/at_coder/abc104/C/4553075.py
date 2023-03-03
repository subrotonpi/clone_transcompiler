def main ( ) :
    import sys
    from itertools import repeat
    from itertools import chain
    from itertools import chain
    from itertools import chain
    from itertools import repeat
    from itertools import chain
    from itertools import chain
    from itertools import chain
    from itertools import chain
    from itertools import chain
    D , G = chain ( chain ( [ 0 ] , repeat ( D ) ) )
    p = chain ( chain ( [ 1 ] , repeat ( G ) ) )
    ans = chain ( [ ] , repeat ( [ ] , repeat ( [ ] , repeat ( [ ] , repeat ( [ ] , repeat ( [ ] , repeat ( [ ] , repeat ( [ ] , repeat ( [ ] , repeat ( [ ] , repeat ( [ ] , repeat ( [ ] , repeat ( [ ] , repeat ( [ ] , repeat ( [ ] , repeat ( [ ] , repeat ( [ ] , [ ] ) [ ] ) ) ) ) ) ) ) ) ) ) ) for i in range ( 1 , D ) ] ) )
    for i in range ( ( 1 , D ) ) ) :
        solve = 0
        need = G
        for j in chain ( range ( D ) ) :
            if ( i >> j & 1 ) == 1 :
                solve += p [ j ] [ 0 ]
                need -= ( ( j + 1 ) * 100 * p [ j ] [ 0 ] + p [ j ] [ 1 ] )
        if need > 0 :
            for k in range ( D - 1 , - 1 , - 1 ) :
                if ( ( i >> k ) & 1 ) == 1 :
                    continue
                count = 0
                while p [ k ] [ 0 ] > count :
                    need -= ( k + 1 ) * 100
                    solve += 1
                    count += 1
                    if need <= 0 :
                        break
                if need > 0 :
                    solve = chain ( [ i ] , repeat ( [ i ] , repeat ( [ i ] , repeat ( [ i ] , repeat ( [ i ] , repeat ( [ i ] , repeat ( [ j ] , repeat ( [ ] , repeat [ ] , repeat ( [ repeat [ ] , repeat ( [ ] , repeat ( [ repeat [ ] , repeat ( [ ] , repeat ( [ repeat [ ] , repeat [ ] , repeat ( [ ] , repeat [ repeat [ ] , repeat [ ] ) ) ) ) ) ) ] ) ) ) )