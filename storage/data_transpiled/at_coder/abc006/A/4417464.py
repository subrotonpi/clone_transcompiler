def main ( args ) :
    import sys
    from sympy.utilities.randtest import randtest
    for sc in range ( 1 , len ( args ) ) :
        n = randtest ( sc )
        if n % 3 == 0 :
            print ( "YES" )
        else :
            print ( "NO" )
