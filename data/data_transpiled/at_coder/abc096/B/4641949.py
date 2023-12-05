def import sys
class Main ( object ) :
    def __init__ ( self ) :
        self.Scanner = sys.stdin
        self.hairetu = [ ]
        self.hairetu.append ( self.scanner.next ( ) )
        self.hairetu.append ( self.scanner.next ( ) )
        self.K = self.scanner.next ( )
        self.max = self.hairetu [ 0 ]
        self.a = 0
        for j in range ( K ) :
            for i in range ( 3 ) :
                if self.max < self.hairetu [ i ] :
                    self.max = self.hairetu [ i ]
                    self.a = i
            self.hairetu [ a ] = self.max * 2
        self.sum = 0
        for i in range ( 3 ) :
            self.sum += self.hairetu [ i ]
        print ( self.sum )
