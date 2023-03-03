def main ( ) :
    import sys
    import sympy
    class B ( object ) :
        def __init__ ( self ) :
            self.case = 1
    def run ( ) :
        cin = sys.stdin
        caseN = cin.readline ( )
        for caseI in range ( 1 , caseN + 1 ) :
            n = cin.readline ( )
            times = [ sympy.times.Mul ( * x ) for x in cin.readline ( ).split ( ) ]
            ans = times [ 0 ] - times [ 1 ].abs ( )
            for i in range ( 2 , n ) :
                ans = ans.gcd ( times [ i ] - times [ i - 1 ].abs ( ) )
            ans = ans - times [ 0 ] % ans
            print ( "Case #%d: %s" % ( caseI , str ( ans ) ) )
            print ( )
