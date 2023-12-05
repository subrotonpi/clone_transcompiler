def main ( ) :
    import sys
    from random import randint
    from time import sleep
    from sys import stdin
    n = randint ( 1 , 9 )
    color = [ 0 ] * 9
    for i in range ( n ) :
        a = randint ( 1 , 9 )
        if a >= 3600 :
            a = 3599
        color [ a / 400 ] += 1
    stdin.close ( )
    min = 0
    for i in range ( len ( color ) - 1 ) :
        if color [ i ] > 0 :
            min += 1
    if min == 0 :
        print ( '1 ' + str ( color [ 8 ] ) )
    else :
        print ( min , min + str ( color [ 8 ] ) )
