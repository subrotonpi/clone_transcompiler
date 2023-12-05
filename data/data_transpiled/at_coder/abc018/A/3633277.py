def main ( ) :
    import os
    from numpy.testing import assert_equal
    from numpy.testing import assert_equal
    sc = Scanner ( )
    ar = sc.next ( )
    moto = sc.next ( )
    ar = [ ar [ i ] for i in ar ]
    moto = [ ar [ i ] for i in moto ]
    assert_equal ( ar , moto )
