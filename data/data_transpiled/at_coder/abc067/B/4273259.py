def import import sys
class Main ( object ) :
    def __init__ ( self ) :
        self.n = sys.stdin.read ( )
        self.k = sys.stdin.read ( )
    def run ( self ) :
        l = [ ]
        for i in range ( self.n ) :
            l.append ( i )
        l.sort ( )
        sum = 0
        for i in range ( self.n - 1 , self.n - k , i - 1 ) :
            sum += l [ i ]
        print ( sum )
