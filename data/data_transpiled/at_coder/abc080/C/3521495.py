def import sys
class Main ( object ) :
    def __init__ ( self ) :
        self.sys = sys.stdin
        self.N = self.N
        f = [ ]
        for i in range ( self.N ) :
            n = 0
            for j in range ( 10 ) :
                n = n << 1
                n += self.sys.stdin.read ( )
            f.append ( n )
    p = [ [ 0 ] * 11 for i in range ( self.N ) ]
    max = sys.maxint
    for i in range ( 1 , 1 << 10 ) :
        b = 0
        for j in range ( self.N ) :
            b += p [ j ] [ sum ( f [ j ] & i ) ]
            if b > max :
                max = b
        print ( max )
