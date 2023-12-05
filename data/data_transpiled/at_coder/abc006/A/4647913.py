def import import sys
class Main ( object ) :
    def __init__ ( self ) :
        self.sc = sys.stdin
        self.i = sys.argv.index ( 'x' )
        if self.i % 3 == 0 :
            print ( 'YES' )
            return
        while self.i <= 0 :
            if self.i % 3 == 0 :
                print ( 'YES' )
                return
            self.i = self.i / 10
        print ( 'NO' )
