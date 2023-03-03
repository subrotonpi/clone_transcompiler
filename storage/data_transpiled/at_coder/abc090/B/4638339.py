def import import sys
class Main ( object ) :
    def __init__ ( self ) :
        self.A = sys.stdin.read ( )
        self.B = sys.stdin.read ( )
        self.C = sys.stdin.read ( )
        self.count = 0
        for l in range ( A , B + 1 ) :
            s = str ( l )
            ss = s.split ( '' )
            if ss [ 0 ] == ss [ 4 ] and ss [ 1 ] == ss [ 3 ] :
                count += 1
        print ( count )
