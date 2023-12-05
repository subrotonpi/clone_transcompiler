def import decimal
import sys
import decimal
class Main ( decimal.Decimal ) :
    def __init__ ( self ) :
        Scanner ( )
        N = Scanner ( ).next ( )
        K = Scanner ( ).next ( )
        print ( decimal.Decimal ( K ) * decimal.Decimal ( K - 1 ) ** ( N - 1 ) )
