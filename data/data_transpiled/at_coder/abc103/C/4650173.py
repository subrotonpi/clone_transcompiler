def main ( ) :
    import sys
    from random import randint
    from time import sleep
    n = randint ( 1 , 10000 )
    num = [ randint ( 1 , 10000 ) for _ in range ( n ) ]
    max = 0
    for i in num :
        max += ( i - 1 )
    print ( max )
