def main ( ) :
    import sys
    from numpy import sin , cos , pi
    from numpy.linalg import norm
    a = norm ( a )
    b = norm ( b )
    x = 0
    if ( a + b ) % 2 == 0 :
        x = ( a + b ) / 2
    else :
        x = ( ( a + b ) / 2 ) + 1
    print ( int ( x ) )
