def code_pyam2015 ( ) :
    import sys
    from pyam2015 import pyam2015
    class A ( object ) :
        def __init__ ( self ) :
            self.T = self.T
        def __repr__ ( self ) :
            return "A(%s)" % self.T
    for cases in range ( 1 , T + 1 ) :
        Smax = pyam2015.get_max_cases ( cases )
        s = pyam2015.get_s ( )
        additional = 0
        total = 0
        for i in range ( 0 , Smax + 1 ) :
            if total < i :
                additional += ( i - total )
                total = i
            total += s [ i ] - '0'
        print ( "Case #%d: %d" % ( cases , additional ) )
