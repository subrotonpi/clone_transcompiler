def main ( args ) :
    import sys
    from itertools import count
    with open ( sys.argv [ 1 ] ) as f :
        N = int ( f.read ( ) )
    A = [ count ( i ) for i in range ( N ) ]
    A.sort ( )
    sum = 0
    if len ( A ) % 2 == 0 :
        for i in range ( ( N - 2 ) // 2 , - 1 , - 1 ) :
            sum += A [ 2 * i + 1 ]
    elif len ( A ) % 2 != 0 :
        for i in range ( ( N - 1 ) // 2 , - 1 , - 1 ) :
            sum += A [ 2 * i ]
    print ( sum )
