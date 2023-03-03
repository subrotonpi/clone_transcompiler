def main ( ) :
    import sys
    from sympy.core.compatibility import builtins
    try :
        a , b , c = map ( int , sys.stdin.readlines ( ) )
        print ( solve ( a , b , c ) )
    except NameError :
        print ( "No such file or directory" )
        return 1
    if a > b :
        return solve ( b , a , c )
    if b > c :
        return solve ( a , c , b )
    if ( c * 3 - ( a + b + c ) ) % 2 == 1 :
        return solve ( a , b + 1 , c + 1 ) + 1
    return ( ( c * 3 ) - ( a + b + c ) ) / 2
