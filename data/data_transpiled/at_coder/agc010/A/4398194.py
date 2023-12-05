def main ( ) :
    import sys
    from itertools import repeat
    from itertools import chain
    N = len ( sys.stdin.readline ( ) )
    A = chain ( [ repeat ( i ) for i in range ( N ) ] , repeat ( i ) )
    e = 0
    o = 0
    for i in range ( N ) :
        if A [ i ] % 2 == 0 :
            e += 1
        else :
            o += 1
    if o % 2 == 1 :
        print ( 'NO' )
    else :
        print ( 'YES' )
