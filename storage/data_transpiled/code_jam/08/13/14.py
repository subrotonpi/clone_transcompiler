def _f_small ( N ) :
    import decimal
    import os
    import sys
    import os
    import math
    import random
    class CMain ( object ) :
        def __init__ ( self ) :
            self.r = decimal.Decimal ( '1' )
            self.a = decimal.Decimal ( '3' )
            self.a = a + decimal.Decimal ( '2.2360679774997896964091736687313' )
            for i in range ( N ) :
                self.r = self.r * self.a
        def f ( self ) :
            return self.r
    with open ( 'C-small.out' , 'w' ) as outf :
        with open ( 'C-small.in' , 'r' ) as inf :
            try :
                inf.seek ( 0 )
                outf.write ( inf.read ( ) )
            except Exception :
                pass
    T = sys.stdin.read ( )
    for t in range ( 1 , T + 1 ) :
        N = sys.stdin.read ( )
        rs = F ( N )
        while len ( rs ) < 3 :
            rs = '0' + rs
        outf.write ( 'Case #%s: %s\n' % ( str ( t ) , rs ) )
    outf.flush ( )
