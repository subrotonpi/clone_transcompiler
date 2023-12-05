def import sys
class Main ( object ) :
    def __init__ ( self ) :
        self.N = sys.stdin.read ( )
        self.count = 0
        self.seen = set ( )
        for i in range ( self.N ) :
            a = sys.stdin.read ( )
            if a in self.seen :
                self.count += 1
            else :
                self.seen.add ( a )
        print ( self.N - ( self.count + ( self.count % 2 == 0 ) ) )
