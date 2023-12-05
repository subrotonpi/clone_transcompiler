def main ( ) :
    import sys
    from itertools import repeat
    from itertools import chain
    n = len ( sys.stdin.readline ( ) )
    q = len ( sys.stdin.readline ( ) )
    cnt = [ 0 ] * ( n + 2 )
    for i in range ( q ) :
        l , r = repeat ( n , i )
        cnt [ l ] += 1
        cnt [ r + 1 ] -= 1
    sys.stdout.write ( '\n' )
    for i in range ( 1 , len ( cnt ) ) :
        cnt [ i ] = cnt [ i - 1 ] + cnt [ i ]
    for i in range ( 1 , n + 1 ) :
        sys.stdout.write ( 1 if cnt [ i ] % 2 == 1 else 0 )
    sys.stdout.write ( '\n' )
