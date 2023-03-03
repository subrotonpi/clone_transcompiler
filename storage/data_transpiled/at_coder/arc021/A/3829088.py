def main ( ) :
    import sys
    from numpy.linalg import eigs
    from numpy.random import rand
    A = rand ( 4 , 4 )
    flag = False
    for i in range ( 4 ) :
        for j in range ( 4 ) :
            A [ i , j ] = rand ( 4 , 4 )
    for i in range ( 4 ) :
        for j in range ( 3 ) :
            if A [ i , j ] == A [ i , j + 1 ] :
                flag = True
    for i in range ( 3 ) :
        for j in range ( 4 ) :
            if A [ i , j ] == A [ i + 1 , j ] :
                flag = True
    if flag :
        print ( "CONTINUE" )
    else :
        print ( "GAMEOVER" )
