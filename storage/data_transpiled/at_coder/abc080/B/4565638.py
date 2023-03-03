def main ( ) :
    import sys
    from random import randint
    from time import sleep
    from math import sin , cos , cos , pi
    N = randint ( 1 , 10000 )
    value = N
    sum = 0
    while value != 0 :
        sum += ( value % 10 )
        value /= 10
    if N % sum == 0 :
        print ( "Yes" )
    else :
        print ( "No" )
