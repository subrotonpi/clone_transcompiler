def import sys
class Main ( object ) :
    def __init__ ( self ) :
        self.O = sys.stdin
        self.E = sys.stdin
        Olen = len ( O )
        Elen = len ( E )
        for i in range ( Elen ) :
            sys.stdout.write ( O [ i ] )
            sys.stdout.write ( E [ i ] )
        if Olen > Elen :
            sys.stdout.write ( O [ Olen - 1 ] )
