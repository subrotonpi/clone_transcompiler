def import import _sys , os , sys
class Main ( object ) :
    def __init__ ( self ) :
        self.n = int ( sys.stdin.read ( ) )
        self.x = int ( sys.stdin.read ( ) )
        self.a = [ _sys.stdin.read ( ) ]
    def main ( self ) :
        sc = _sys.stdin.read ( )
        self.n = sc.n
        self.x = int ( sys.stdin.read ( ) )
        self.a = [ sc.x for _ in range ( self.n ) ]
        self.dp = [ [ ] for _ in range ( self.n ) ]
        for i in range ( self.n ) :
            self.dp [ 0 ] [ i ] = self.a [ i ]
        for i in range ( 1 , self.n ) :
            for j in range ( self.n ) :
                self.dp [ i ] [ j ] = min ( self.dp [ i - 1 ] [ ( self.n + j - 1 ) % self.n ] , self.dp [ i - 1 ] [ j ] )
        ret = sys.maxsize
        for i in range ( self.n ) :
            sum = 0
            for j in range ( self.n ) :
                sum += self.dp [ i ] [ j ]
            ret = min ( ret , sum + x * i )
        print ( ret )
