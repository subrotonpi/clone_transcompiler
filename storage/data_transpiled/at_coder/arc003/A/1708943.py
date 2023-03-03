def import import sys , string , ** kwargs ) :
    from numpy import array
    from numpy.linalg import eigs
    with open ( '../data/data/' ) as sc :
        N = int ( sc.read ( ) )
        S = sc.read ( )
        sum = 0
        for i in range ( N ) :
            if S [ i ] == 'A' :
                sum += 4
            if S [ i ] == 'B' :
                sum += 3
            if S [ i ] == 'C' :
                sum += 2
            if S [ i ] == 'D' :
                sum += 1
            if S [ i ] == 'F' :
                sum += 0
        print ( float ( sum ) / N )
