def main ( ) :
    import sys
    from math import sin , cos , pi
    from os.path import join
    N = int ( sys.argv [ 1 ] )
    A = sin ( N )
    B = sin ( N )
    if abs ( A - B ) % 2 == 0 :
        print ( "Alice" )
    elif abs ( A - B ) % 2 == 1 :
        print ( "Borys" )
