def main ( ) :
    import sys
    import numpy
    from numpy.testing.utils import get_scanner
    class Main ( object ) :
        def __init__ ( self ) :
            sc = sys.stdin
            a = [ ]
            for i in range ( 3 ) :
                a.append ( sc.randint ( 1 , 3 ) )
            a.sort ( )
            print ( a [ 1 ] )
    return Main
