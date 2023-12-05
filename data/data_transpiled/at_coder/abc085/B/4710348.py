def import sys
class Main ( object ) :
    def __init__ ( self ) :
        self.Scanner = sys.stdin
        self.N = self.N
        self.hairetu = [ ]
        self.ans = 1
        for i in range ( self.N ) :
            self.hairetu.append ( self.scanner.next ( ) )
        for i in range ( self.N - 1 ) :
            for j in range ( self.N - 1 - i ) :
                if self.hairetu [ j ] < self.hairetu [ j + 1 ] :
                    temp = self.hairetu [ j ]
                    self.hairetu [ j ] = self.hairetu [ j + 1 ]
                    self.hairetu [ j + 1 ] = temp
        now = self.hairetu [ 0 ]
        for i in range ( self.N ) :
            if now > self.hairetu [ i ] :
                now = self.hairetu [ i ]
                self.ans += 1
        print ( self.ans )
