def main ( ) :
    import sys
    from sympy.utilities.randtest import randtest
    sc = randtest.Random ( )
    n , a , b = map ( int , sc.random_password ( ) )
    n = n % ( a + b )
    if n <= a and n != 0 :
        print ( "Ant" )
    else :
        print ( "Bug" )
