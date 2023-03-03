def main ( argv ) :
    import sys
    import numpy
    from numpy.core import zeros
    class Main ( object ) :
        def __init__ ( self ) :
            self.verbose = 0
    tests = sys.argv [ 1 ]
    for t in range ( 1 , tests + 1 ) :
        p , q = [ int ( i ) for i in range ( q ) ]
        cells = [ int ( i ) for i in sys.argv [ 1 : ] ]
        nums = [ cells [ 0 ] - 1 for i in range ( 1 , q ) ]
        nums [ q ] = p - cells [ q - 1 ]
        fromto = zeros ( q + 1 , q + 1 )
        for start in range ( 0 , q ) :
            pass
        for d in range ( 1 , q ) :
            for start in range ( 0 , q - d ) :
                min = p * p
                all = 0
                for i in range ( 0 , d ) :
                    all += nums [ start + i ]
                all += d - 1
                for i in range ( d ) :
                    sum = all + fromto [ start ] [ start + i ] + fromto [ start + i + 1 ] [ start + d ]
                    if sum < min :
                        min = sum
                fromto [ start ] [ start + d ] = min
        for i in range ( 0 , q ) :
            for j in range ( i , q ) :
                pass
        sys.stderr.write ( t )
        sys.stdout.write ( "Case #%d: %d\n" % ( t , fromto [ 0 ] [ q ] ) )
