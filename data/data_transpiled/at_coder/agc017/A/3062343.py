def main ( ) :
    import sys
    from time import sleep
    from itertools import chain
    N = len ( sys.stdin.readlines ( ) )
    P = len ( sys.stdin.readlines ( ) )
    A = [ ]
    e = 0
    o = 0
    pat = 1
    for i in chain ( N , P ) :
        if A [ i ] % 2 == 0 :
            o += 1
        else :
            e += 1
    for _ in range ( o ) :
        pat = pat * 2
    if P == 0 :
        if e == 0 :
            print ( pat )
        else :
            for _ in range ( e ) :
                pat = pat * 2
            print ( pat )
    else :
        if e == 0 :
            print ( 0 )
        else :
            for _ in range ( 1 ) :
                pat = pat * 2
            print ( pat )
