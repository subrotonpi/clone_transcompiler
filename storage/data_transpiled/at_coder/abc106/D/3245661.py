def main ( * args ) :
    import sys
    import os
    from sys import stdin , stdout
    from sys import stdin , stdin , stdout
    N = stdin.randint ( 1 , N )
    M = stdin.randint ( 1 , N )
    Q = stdin.randint ( 1 , N )
    A = [ [ 0 ] * ( N + 1 ) for i in range ( M ) ]
    for l in stdin.randint ( 1 , N ) :
        r = stdin.randint ( 1 , N )
        A [ l ] [ r ] += 1
    for i in range ( 1 , N + 1 ) :
        for j in range ( i , N ) :
            A [ i ] [ j + 1 ] += A [ i ] [ j ]
    for j in range ( N , 2 , - 1 ) :
        for i in range ( j , 2 , - 1 ) :
            A [ i - 1 ] [ j ] += A [ i ] [ j ]
    for i in range ( Q ) :
        pi = stdin.randint ( 1 , N )
        qi = stdin.randint ( 1 , N )
        puts ( A [ pi ] [ qi ] )
    flush ( )
    import sys
    IN = stdin.raw_input
    OUT = stdout.write
    def puts ( arg ) :
        OUT.write ( arg )
    def flush ( ) :
        OUT.flush ( )
    return
