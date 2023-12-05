def import import sys
class Main ( object ) :
    def __init__ ( self ) :
        self.n = sys.argv.index ( 'n' )
        self.a = [ ]
        self.ans = 0
        for i in range ( self.n ) :
            self.a.append ( sys.stdin.read ( ) )
        for b in self.a :
            for c in self.a :
                if b == c :
                    self.ans += 1
                    break
        print ( self.ans )
