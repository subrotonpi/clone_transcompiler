def main ( ) :
    import sys
    from random import randint
    from numpy import array
    N = randint ( 1 , N )
    sum = max = 0
    arr = array ( N )
    for i in range ( N ) :
        arr [ i ] = randint ( 1 , N )
        sum = sum + arr [ i ]
        if max < arr [ i ] :
            max = arr [ i ]
    if max * 2 < sum :
        print ( "Yes" )
    else :
        print ( "No" )
