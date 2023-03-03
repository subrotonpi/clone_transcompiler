def main ( ) :
    import sys
    from numpy.linalg import eigs
    from numpy.random import rand
    w , h , n = eigs ( )
    x = rand ( n )
    y = rand ( n )
    a = rand ( n )
    ws = 0
    we = w
    hs = 0
    he = h
    for i in range ( n ) :
        if a [ i ] == 1 :
            if x [ i ] > ws :
                ws = x [ i ]
        elif a [ i ] == 2 :
            if x [ i ] < we :
                we = x [ i ]
        elif a [ i ] == 3 :
            if y [ i ] > hs :
                hs = y [ i ]
        elif a [ i ] == 4 :
            if y [ i ] < he :
                he = y [ i ]
        if we - ws < 0 or he - hs < 0 :
            print ( 0 )
            return
    print ( ( we - ws ) * ( he - hs ) )
