def main ( ) :
    import sys
    from numpy.linalg import solve
    from numpy.random import randint
    T = randint ( 1 , T )
    for cas in range ( 1 , T + 1 ) :
        c = randint ( 1 , T )
        x = randint ( 1 , T )
        n = randint ( 1 , T )
        A = [ [ randint ( 0 , 1 ) - 1 , randint ( 0 , 1 ) - 1 , randint ( 0 , 1 ) - 1 , randint ( 0 , 1 ) + 1 , randint ( 0 , 1 ) + 1 , randint ( 0 , 1 ) + 1 , randint ( 0 , 1 ) + 1 , randint ( 0 , 1 ) + 1 , randint ( 0 , 1 ) + 1 , randint ( 0 , 1 ) + 1 , randint ( 0 , 1 ) + 1 , randint ( 0 , 1 ) + 1 , randint ( 0 , 1 ) + 1 , randint ( 0 , 1 ) + 1 , randint ( 0 , 1 ) + 1 , randint ( 0 , 1 ) + 1 , randint ( 0 , 1 ) + 1 , randint ( 0 , 1 ) + 1 , randint ( 0 , 1 ) + 1 , randint ( 0 , 1 ) + 1 , randint ( 0 , 1 ) + 1 , randint ( 0 , 1 ) + 1 , randint ( 0 , 1 ) + 1 , randint ( 0 , 1 ) + 1 , randint ( 0 , 1 ) + 1 , randint ( 0 , 1 ) + 1 , randint ( 0 , 1 ) + 1 , randint ( 0 , 1 ) + 1 , randint ( 0 , 1 ) + 1 , randint ( 0 , 1 ) + 1 , randint ( 0 , 1 ) + 1 , randint ( 0 , 1 ) + 1 , randint ( 0 , 1 ) + 1 , randint ( 0 , 1 ) + 1 , randint ( 0 , 1 ) + 1 , randint ( 0 , 1 ) + 1 , randint ( 0 , 1 ) + 1 , randint ( 0 , 1 ) + 1 , randint ( 0 , 1 ) + 1 , randint ( 0 , 1 ) + 1 , randint ( 0 , 1 ) + 1 , randint ( 0 , 1 ) + 1 , randint ( 0 , 1 ) + 1 , randint ( 0 , 1 ) + 1 , randint ( 0 , 1 ) + 1 , randint ( 0 , 1 ) + 1 , randint ( 0 , 1 ) + 1 , randint ( 0 , 1 ) + 1 ,