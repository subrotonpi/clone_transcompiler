def main ( ) :
    import sys
    from numpy.linalg import solve
    from numpy.random import randint
    N = randint ( 1 , 6 )
    M = randint ( 1 , 6 )
    L = randint ( 1 , 6 )
    P = randint ( 1 , 6 )
    Q = randint ( 1 , 6 )
    R = randint ( 1 , 6 )
    volume = [ ( N / P ) * ( M / Q ) * ( L / R ) , ( N / P ) * ( M / Q ) * ( L / R ) , ( M / P ) * ( N / Q ) * ( L / R ) , ( M / Q ) * ( N / R ) , ( L / P ) * ( M / Q ) * ( N / R ) , ( L / Q ) * ( N / R ) , ( M / P ) * ( N / Q ) * ( M / R ) , ( L / P ) * ( N / Q ) * ( M / R ) , ( L / P ) * ( N / Q ) * ( M / R ) , ( L / Q ) * ( N / R ) , ( M / Q ) * ( N / R ) , ( L / P ) * ( N / Q ) * ( M / R ) , ( L / Q ) * ( N / R ) , ( M / Q ) * ( N / R ) , ( L / P ) * ( N / Q ) * ( M / R ) , ( L / Q ) * ( N / R ) , ( M / Q ) * ( N / R ) , ( L / P ) * ( M / Q ) * ( N / R ) , ( L / Q ) * ( N / R ) , ( M / Q ) * ( N / R ) , ( L / P ) * ( M / Q ) * ( N / R ) , ( L / P ) * ( M / Q ) * ( N / R ) , ( L / P ) * ( M / Q ) * ( N / R ) , ( L / P ) * ( M / Q ) * ( N / R ) , ( L / P ) * ( M / Q ) * ( N / R ) , ( L / Q ) * ( N / R ) , ( M / Q ) * ( N / R ) ]
    solve ( )
