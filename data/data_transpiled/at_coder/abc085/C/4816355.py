def main ( ) :
    import sys
    from os import path
    from os import urandom
    from random import randint
    from random import randint
    from sys import stdin
    N = randint ( 1 , 10000 )
    Y = randint ( 1 , 10000 )
    rst_x = - 1
    rst_y = - 1
    rst_z = - 1
    for x in range ( 0 , N ) :
        for y in range ( 0 , N - x ) :
            for z in range ( 0 , N - x - y ) :
                if ( randint ( 10000 * x + 5000 * y + 1000 * z ) == Y and randint ( x + y + z , N ) == N ) :
                    rst_x = x
                    rst_y = y
                    rst_z = z
                    break
    print ( rst_x , rst_y , rst_z )
