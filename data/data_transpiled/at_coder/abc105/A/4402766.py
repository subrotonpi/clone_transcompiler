def main ( ) :
    import sys
    from sympy.utilities.randtest import randtest
    sc = randtest ( )
    n , k = map ( int , sc.symbols )
    if n % k == 0 :
        print ( 0 )
    else :
        print ( 1 )
