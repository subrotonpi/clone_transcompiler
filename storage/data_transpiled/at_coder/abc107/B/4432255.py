def main ( ) :
    import sys
    from numpy import zeros
    from numpy.linalg import solve
    from numpy.random import choice
    from numpy.random import choice
    from numpy.random import choice
    from numpy.random import choice
    H , W = choice ( range ( 1 , M ) )
    board = [ choice ( range ( H ) ) for _ in range ( W ) ]
    row = [ False for _ in range ( H ) ]
    col = [ False for _ in range ( W ) ]
    for i in range ( H ) :
        for j in range ( W ) :
            if board [ i ] [ j ] == '#' :
                row [ i ] = True
                col [ j ] = True
    for i in range ( H ) :
        if row [ i ] :
            for j in range ( W ) :
                if col [ j ] :
                    print ( board [ i ] [ j ] , end = ' ' )
            print ( )
