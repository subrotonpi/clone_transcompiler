def main ( ) :
    import sys
    from time import sleep
    from random import randint
    from math import sin , cos , cos , pi
    a = randint ( 1 , 5 )
    b = a
    sum = 0
    while b > 0 :
        sum += b % 10
        b -= b % 10
        b /= 10
    if a % sum == 0 :
        print ( "Yes" )
    else :
        print ( "No" )
