def main ( ) :
    import sys
    from random import randint
    a = [ 1 , 2 , 3 , 4 , 5 , 6 ]
    N = randint ( 1 , 30 )
    if N > 29 :
        N = N % 30
    for i in range ( N ) :
        temp = a [ ( i % 5 ) ]
        a [ ( i % 5 ) ] = a [ ( i % 5 + 1 ) ]
        a [ ( i % 5 + 1 ) ] = temp
    print ( a [ 0 ] , a [ 1 ] , a [ 2 ] , a [ 3 ] , a [ 4 ] , a [ 5 ] )
