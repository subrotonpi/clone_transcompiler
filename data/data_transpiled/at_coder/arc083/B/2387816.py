def main ( ) :
    import sys
    from numpy.linalg import norm
    from numpy.random import uniform
    from numpy.core import zeros
    from numpy.core import linalg
    from numpy.core import norm
    n = len ( [ x for x in range ( 0 , n ) ] )
    dist = [ [ x for x in range ( n ) ] for y in range ( 0 , n ) ]
    print ( calc ( dist ) )
    def calc ( dist ) :
        n = len ( dist [ 0 ] )
        omit = [ [ x for x in range ( n ) ] for y in range ( 0 , n ) ]
        for i in range ( n ) :
            for j in range ( i + 1 , n ) :
                for k in range ( j + 1 , n ) :
                    if dist [ i ] [ j ] + dist [ i ] [ k ] < dist [ j ] [ k ] :
                        return - 1
                    elif dist [ i ] [ j ] + dist [ i ] [ k ] == dist [ j ] [ k ] :
                        omit [ j ] [ k ] = True
                    if dist [ i ] [ j ] + dist [ i ] [ k ] < dist [ j ] [ k ] :
                        return - 1
                    elif dist [ i ] [ j ] + dist [ i ] [ k ] == dist [ j ] [ k ] :
                        omit [ i ] [ k ] = True
                    if dist [ i ] [ k ] + dist [ j ] [ k ] < dist [ i ] [ k ] :
                        return - 1
                    elif dist [ i ] [ k ] + dist [ i ] [ k ] == dist [ i ] [ k ] :
                        return - 1
                    elif dist [ i ] [ k ] + dist [ i ] [ k ] == dist [ i ] [ k ] :
                        omit [ i ] [ k ] = True
        total = 0
        for i in range ( n ) :
            for j in range ( i + 1 , n ) :
                if not omit [ i ] [ j ] :
                    total += dist [ i ] [ j ]
        return total
