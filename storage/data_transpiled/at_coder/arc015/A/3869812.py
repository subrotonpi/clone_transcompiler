def main ( ) :
    import sys
    import math
    from numpy import sin , cos , pi
    from numpy import pi
    from numpy.testing import assert_almost_equal
    n = pi * sin ( pi * pi * pi * pi )
    ans = 9 * n / 5 + 32
    assert_almost_equal ( ans , 9 * pi * pi / 5 )
