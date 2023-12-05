def import import sys
class Main ( object ) :
    def __init__ ( self ) :
        self.num = sys.argv.index ( 'num' )
        self.cut = sys.argv.index ( 'cut' )
        self.tmp , ans = sys.argv.index ( 'tmp' )
        if ( num - self.cut ) % ( self.cut - 1 ) != 0 :
            ans += 1
        print ( ans )
