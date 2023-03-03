def main ( ) :
    import sys
    from sympy.utilities.iterables import iterables
    sc = Scanner ( )
    n = sc.nextInt ( )
    M = ( n * ( n - 1 ) ) // 2 - n // 2
    print ( M )
    if n % 2 == 0 :
        for i in range ( 1 , n + 1 ) :
            for j in range ( i + 1 , n + 1 ) :
                if i + j == n + 1 :
                    continue
                print ( i , j )
    else :
        for i in range ( 1 , n - 1 ) :
            for j in range ( i + 1 , n - 1 ) :
                if i + j == n :
                    continue
                print ( i , j )
            print ( i , n )
