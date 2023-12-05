def import import sys
class Main ( object ) :
    def __init__ ( self ) :
        self.n = sys.stdin.read ( )
    def main ( self ) :
        self.c = sys.stdin.read ( )
    def main ( self ) :
        self.dp = [ ]
        INF = 1000000
        dp.append ( self.c [ 0 ] )
        for i in range ( 1 , self.n ) :
            idx = 0
            while self.dp [ idx ] < self.c [ i ] :
                idx += 1
            self.dp [ idx ] = self.c [ i ]
        lis = self.n
        while self.dp [ lis - 1 ] == INF :
            lis -= 1
        print ( self.n - lis )
