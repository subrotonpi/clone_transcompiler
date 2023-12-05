def import import sys
class Main ( object ) :
    def __init__ ( self ) :
        self.n = sys.stdin.readline ( ).strip ( )
        self.m = sys.stdin.readline ( ).strip ( )
        self.c = sys.stdin.readline ( ).strip ( )
        self.b = [ ]
        for i in range ( self.m ) :
            self.b.append ( sys.stdin.readline ( ).strip ( ) )
        self.count = 0
        for i in range ( self.n ) :
            sum = 0
            for j in range ( self.m ) :
                a = sys.stdin.readline ( ).strip ( )
                sum += a * b [ j ]
            if ( sum + c ) > 0 :
                count += 1
            self.count += 1
        print ( count )
