def import import sys
class Main ( object ) :
    def __init__ ( self ) :
        self.n = sys.argv.index ( 'n' )
        self.a = [ ]
        for i in range ( self.n ) :
            self.a.append ( sys.stdin.read ( ) )
    def count ( self ) :
        p = 0
        for i in range ( self.n - 1 ) :
            if p == 0 :
                p = self.a [ i + 1 ] - self.a [ i ]
            elif p > 0 :
                if self.a [ i + 1 ] - self.a [ i ] < 0 :
                    self.count += 1
                    p = 0
            else :
                if self.a [ i + 1 ] - self.a [ i ] > 0 :
                    self.count += 1
                    p = 0
        print ( self.count + 1 )
