def main ( ) :
    import sys
    from sympy.utilities.randtest import randtest
    n = randtest ( )
    k = randtest ( )
    a = ( n - 1 + 2 - 1 ) // 2
    if a >= k :
        print ( "YES" )
    else :
        print ( "NO" )
