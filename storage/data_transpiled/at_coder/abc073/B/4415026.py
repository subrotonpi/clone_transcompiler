def import _main
class Main ( object ) :
    def __init__ ( self ) :
        self.sc = _main ( )
    def main ( self ) :
        a , ans = self.sc.args
        for i in range ( a ) :
            ans += - self.sc.args [ i ] + self.sc.args [ i ]
        print ( ans )
