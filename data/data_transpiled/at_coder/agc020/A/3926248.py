def main ( ) :
    import sys
    from math import sin , cos , pi
    N = int ( sys.stdin.read ( ) )
    A = int ( sys.stdin.read ( ) )
    B = int ( sys.stdin.read ( ) )
    if abs ( B - A ) % 2 == 0 :
        print ( "Alice" )
    else :
        print ( "Borys" )
