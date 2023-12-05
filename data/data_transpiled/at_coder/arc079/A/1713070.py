def import sys
class Main ( object ) :
    def __init__ ( self ) :
        self.Scanner = sys.stdin
        self.first = set ( )
        self.second = set ( )
        self.N = self.N
        self.M = self.M
        for i in range ( self.M ) :
            a = self.first.get ( i )
            b = self.second.get ( i )
            if a == 1 :
                self.first.add ( b )
            if b == self.N :
                self.second.add ( a )
    for k in self.first :
        if k in self.second :
            print ( "POSSIBLE" )
            return
    print ( "IMPOSSIBLE" )
