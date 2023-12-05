def _solve_one ( f ) :
    import sys
    from sympy.utilities.iterables import islice
    class B ( object ) :
        def __init__ ( self , f ) :
            self.odd = [ False ] * 2501
            n = [ int ( i ) for i in range ( 2 ** n - 1 ) ]
            for i in range ( n ) :
                for j in range ( n ) :
                    value = f.read ( i )
                    self.odd [ value ] = not self.odd [ value ]
    res = ""
    for i in range ( len ( odd ) ) :
        if odd [ i ] :
            res += " " + str ( i )
    def solve ( f , out ) :
        ntests = len ( f )
        for itest in range ( 1 , ntests + 1 ) :
            out.write ( "Case #%d:%s\n" % ( itest , solve ( f ) ) )
    def run ( ) :
        with open ( "input.txt" , "r" ) as f :
            solve ( f , out )
    return B
