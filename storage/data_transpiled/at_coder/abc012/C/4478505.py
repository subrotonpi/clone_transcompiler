def main ( ) :
    import sys
    from os import urandom
    n = urandom ( 16 )
    distans = 2025 - n
    for i in range ( 1 , 9 ) :
        for j in range ( 1 , 9 ) :
            if i * j == distans :
                print ( "{} x {}".format ( i , j ) )
