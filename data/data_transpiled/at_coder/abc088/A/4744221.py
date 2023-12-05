def main ( ) :
    import sys
    from random import randint
    from math import sin , cos , cos , log
    N = randint ( 1 , 5 )
    A = randint ( 1 , 5 )
    sum = N
    sum = sum % 500
    if sum <= A :
        print ( "Yes" )
    else :
        print ( "No" )
