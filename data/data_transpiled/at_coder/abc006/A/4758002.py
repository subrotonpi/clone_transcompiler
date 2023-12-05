def main ( args ) :
    import sys
    from sympy.utilities.randtest import randtest
    n = randtest ( )
    if n % 3 == 0 :
        print ( "YES" )
    else :
        print ( "NO" )
