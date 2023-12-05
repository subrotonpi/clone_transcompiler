def main ( ) :
    import sys
    import numpy
    from numpy.testing.utils import get_scanner
    a = [ ]
    for i in range ( 3 ) :
        a.append ( sc.randint ( 1 , 3 ) )
    a.sort ( )
    print ( a [ 0 ] + a [ 1 ] == a [ 2 ] and 'Yes' or 'No' )
