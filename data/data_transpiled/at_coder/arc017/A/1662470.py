def main ( ) :
    import sys
    from itertools import repeat
    sc = raw_input ( "Enter the number of numbers in the list of numbers" )
    N = sc.__next__ ( )
    pn = [ 1 for i in range ( N + 1 ) ]
    k = 2
    while k * k <= N :
        if pn [ k ] == 1 :
            for i in range ( k , N // k + 1 ) :
                pn [ i * k ] = 0
        k += 1
    if pn [ N ] == 1 :
        print ( "YES" )
    else :
        print ( "NO" )
