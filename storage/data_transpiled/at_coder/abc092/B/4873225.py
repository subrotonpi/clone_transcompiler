def main ( ) :
    import sys
    from numpy.linalg import solve
    from numpy.random import randint
    N = randint ( 1 , N )
    D = randint ( 1 , D )
    X = randint ( 1 , X )
    A = solve ( N )
    choco = 0
    for i in range ( N ) :
        Ai = A [ i ]
        for j in range ( 0 , D ) :
            choco += 1
    choco += X
    print ( choco )
