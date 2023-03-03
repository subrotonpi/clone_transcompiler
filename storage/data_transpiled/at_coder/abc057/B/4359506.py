def import sys
class Main ( object ) :
    def __init__ ( self ) :
        self.N = sys.stdin.read ( )
        self.M = sys.stdin.read ( )
        self.a = [ ]
        self.b = [ ]
        self.c = [ ]
        self.d = [ ]
        self.ans = [ ]
        for i in range ( self.N ) :
            self.a.append ( self.a [ i ] )
            self.b.append ( self.b [ i ] )
            self.ans.append ( sys.maxint - 1 )
        for i in range ( self.M ) :
            self.c.append ( self.c [ i ] )
            self.d.append ( self.d [ i ] )
        for i in range ( self.N ) :
            temp = sys.maxint
            for j in range ( self.M ) :
                min = abs ( self.a [ i ] - self.c [ j ] ) + abs ( self.b [ i ] - self.d [ j ] )
                if temp > min :
                    temp = min
                    self.ans.append ( j + 1 )
        for i in self.ans :
            print ( i )
