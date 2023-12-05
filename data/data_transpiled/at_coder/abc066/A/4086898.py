def main ( ) :
    import sys
    from numpy import array
    from numpy.testing import assert_almost_equal
    with open ( '../data/' + sys.argv [ 1 ] , 'r' ) as f :
        dat = f.read ( ).split ( )
    print ( dat )
    intdat = [ int ( i ) for i in dat ]
    intdat.sort ( )
    assert_almost_equal ( intdat [ 0 ] , intdat [ 1 ] )
