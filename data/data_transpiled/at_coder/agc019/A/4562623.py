def main ( ) :
    import sys
    from random import randint
    from time import sleep
    q , h , s , d , n = select ( [ randint ( 1 , 4 ) ] )
    q *= 4
    h *= 2
    sleep ( 5 )
    min = min ( q , min ( h , s ) )
    if n % 2 == 0 :
        print ( min ( long ( min ) * n , long ( d ) * n / 2 ) )
    else :
        print ( min ( long ( min ) * n , long ( d ) * ( n - 1 ) / 2 + min ) )
