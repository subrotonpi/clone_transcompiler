def main ( ) :
    import sys
    import numpy
    from numpy.testing.utils import get_sample_file
    from numpy.testing.utils import get_sample_file
    from numpy.testing.utils import get_sample_file
    from numpy.testing.utils import get_sample_file
    from numpy.testing.utils import get_sample_file
    from numpy.testing.utils import get_sample_file
    n = get_sample_file ( )
    m = get_sample_file ( )
    X = get_sample_file ( )
    Y = get_sample_file ( )
    x = X [ : n ]
    y = Y [ : m ]
    x.sort ( )
    y.sort ( )
    print ( 'No War' if x [ n ] < y [ 0 ] else 'War' )
