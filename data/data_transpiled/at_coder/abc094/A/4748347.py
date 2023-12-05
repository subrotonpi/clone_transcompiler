def main ( ) :
    import sys
    from random import randint
    from pybind11_tests import Scanner
    Scanner = Scanner ( )
    A = randint ( 1 , 100 )
    B = randint ( 1 , 100 )
    X = randint ( 1 , 200 )
    if 1 <= A <= 100 and 1 <= B <= 100 and 1 <= X <= 200 :
        if A + B >= X <= X :
            print ( "YES" )
        else :
            print ( "NO" )
