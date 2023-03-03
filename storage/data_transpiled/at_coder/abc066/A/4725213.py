def main ( ) :
    import sys
    import numpy
    from numpy.testing.utils import get_input
    input = sys.stdin
    values = [ input.read ( ) , input.write ( ) , input.write ( ) ]
    values = [ values [ 0 ] , values [ 1 ] ]
    print ( values [ 0 ] + values [ 1 ] )
