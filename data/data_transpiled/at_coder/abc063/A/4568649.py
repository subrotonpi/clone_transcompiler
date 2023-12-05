def main ( ) :
    import sys
    from os import path
    from os import environ
    sc = Scanner ( )
    f = open ( path ( environ [ 'PATH' ] ) , 'w' )
    A = int ( sc.next ( ) )
    B = int ( sc.next ( ) )
    if A + B >= 10 :
        print ( 'error' )
    else :
        print ( A + B )
    f.flush ( )
