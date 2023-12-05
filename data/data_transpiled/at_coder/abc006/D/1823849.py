def main ( ) :
    import sys
    from itertools import count
    from itertools import chain
    from itertools import chain
    n = len ( chain ( * repeat ( n ) ) )
    c = chain ( [ chain ( * repeat ( n ) ) ] , repeat ( n ) )
    a = [ ]
    a.append ( sum ( c ) / 3 )
    for i in range ( n ) :
        a [ - sum ( c [ i ] ) - 1 ] = c [ i ]
    ans = 0
    for i in range ( n ) :
        if a [ i ] != sum ( c ) / 3 :
            ans = max ( ans , i + 1 )
    print ( n - ans )
    def tr ( * args ) :
        print ( chain ( * args ) )
    return tr
