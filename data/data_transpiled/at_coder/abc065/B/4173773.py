def main ( ) :
    import sys
    from itertools import repeat
    from itertools import chain
    a = next ( iter ( sys.stdin ) )
    b = chain ( a )
    fig = 0
    for i in range ( 0 , a ) :
        b [ i ] = next ( iter ( sys.stdin ) )
    za = 0
    count = 0
    for i in range ( 0 , a + 1 ) :
        if b [ za ] == 2 :
            fig = 1
            count = i + 1
            break
        za = b [ za ] - 1
    print ( count if fig == 1 else - 1 )
