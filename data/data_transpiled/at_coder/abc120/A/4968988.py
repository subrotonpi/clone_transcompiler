def main ( ) :
    import sys
    from sympy.utilities.randtest import randtest
    A = randtest ( )
    B = randtest ( )
    C = randtest ( )
    if B >= A * C :
        ans = C
    else :
        ans = int ( B ) // A
    print ( ans )
