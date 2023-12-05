def main ( args ) :
    import sys
    from string import ascii_lowercase
    from string import ascii_lowercase
    from string import digits
    H , W = [ int ( ascii_lowercase.index ( x ) ) for x in ascii_lowercase ]
    A = [ ]
    a = [ [ 0 ] * H , [ 0 ] * W ]
    N = True
    for i in range ( H ) :
        A.append ( ascii_lowercase.index ( i ) )
        for j in range ( W ) :
            if A [ i ] [ j ] == '#' :
                a [ i ] [ j ] = 1
            else :
                a [ i ] [ j ] = 0
    for i in range ( H ) :
        for j in range ( W ) :
            if a [ i ] [ j ] == 1 :
                for k in range ( i + 1 , H ) :
                    for l in range ( j ) :
                        if a [ k ] [ l ] == 1 :
                            N = False
    if N :
        print ( "Possible" )
    else :
        print ( "Impossible" )
