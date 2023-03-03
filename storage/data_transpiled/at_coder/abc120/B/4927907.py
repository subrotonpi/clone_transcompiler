def import sys
class Main ( object ) :
    def __init__ ( self ) :
        self.A = sys.stdin.read ( )
        self.B = sys.stdin.read ( )
        self.K = sys.stdin.read ( )
        self.mini = min ( self.A , self.B )
        a = [ i for i in range ( self.mini + 1 ) if A % i == 0 and B % i == 0 ]
        a.append ( self.A )
        a.append ( self.B )
        a.append ( self.K )
    def main ( self ) :
        print ( a [ - K : ] )
