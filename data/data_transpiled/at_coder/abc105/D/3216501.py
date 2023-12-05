def main ( * args ) :
    import sys
    import os
    import sys
    from time import sleep
    N = IN.randint ( 1 , 10000 )
    M = IN.randint ( 1 , 10000 )
    A = range ( N )
    B = { 0 : 1 }
    ans = 0
    tot = 0
    for a in A :
        tot = ( tot + a ) % M
        tmp = B.get ( tot , 0 )
        ans += long ( tmp )
        B [ tot ] = tmp + 1
    puts ( ans )
    flush ( )
    IN = sys.stdin
    OUT = sys.stdout
    def puts ( arg ) :
        OUT.write ( arg )
    def flush ( ) :
        OUT.flush ( )
    return puts , flush
