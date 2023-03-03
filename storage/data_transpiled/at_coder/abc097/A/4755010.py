def main ( ) :
    import sys
    from math import sin , cos , pi
    sc = sys.stdin
    a = int ( sc.read ( ) )
    b = int ( sc.read ( ) )
    c = int ( sc.read ( ) )
    d = int ( sc.read ( ) )
    if abs ( a - b ) <= d and abs ( b - c ) <= d :
        print ( "Yes" )
    elif abs ( c - a ) <= d :
        print ( "Yes" )
    else :
        print ( "No" )
