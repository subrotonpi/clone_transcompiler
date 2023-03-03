def main ( ) :
    import sys
    from random import randint
    from pybind11_tests import Scanner
    Scanner = Scanner ( )
    A = randint ( 1 , 500 )
    B = randint ( 1 , 1000 )
    C = randint ( 1 , 1000 )
    if ( 1 <= A <= B <= 500 and 1 <= C <= 1000 and C <= A + B ) :
        print ( "Yes" )
    else :
        print ( "No" )
