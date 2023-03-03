def import import sys
class Main ( object ) :
    def __init__ ( self ) :
        self.pieceNumOf500yen = sys.stdin.readline ( ).strip ( ).split ( ) [ 0 ] + 1
        self.pieceNumOf100yen = sys.stdin.readline ( ).strip ( ).split ( ) [ 0 ] + 1
        self.pieceNumOf50yen = sys.stdin.readline ( ).strip ( ).split ( ) [ 0 ] + 1
        self.totalX = sys.stdin.readline ( ).strip ( ).split ( ) [ 0 ]
        self.queryset = [ [ ] for _ in range ( self.pieceNumOf500yen ) ]
        self.queryset = [ [ ] for _ in range ( self.pieceNumOf100yen ) ]
        self.queryset = [ [ ] for _ in range ( self.pieceNumOf50yen ) ]
        self.count = 0
        for i in self.queryset :
            for j in self.queryset [ i ] :
                for k in self.queryset [ i ] [ j ] :
                    if totalX == 500 * i + 100 * j + 50 * k :
                        self.count += 1
        print ( self.count )
