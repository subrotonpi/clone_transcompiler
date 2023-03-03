def main ( ) :
    import math
    from numpy import log10
    from numpy.core import zeros
    from numpy.core import zeros
    from numpy.core import log
    with open ( "../data/" ) as sc :
        A = log10 ( sc.read ( ) )
        B = log10 ( sc.read ( ) )
        if A > B :
            print ( "GREATER" )
        elif A < B :
            print ( "LESS" )
        else :
            print ( "EQUAL" )
