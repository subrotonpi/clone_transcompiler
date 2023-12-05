def import _main
class Main ( object ) :
    def __init__ ( self ) :
        self.a = [ ]
        self.cost = 0
        self.N = int ( self.N )
        self.dp = int ( self.dp )
        self.INF = int ( self.INF )
    def solve ( self ) :
        with open ( "/proc/stations" , "r" ) as sc :
            N , K = sc.read ( ).split ( )
            A = [ ]
            M = 0
            for i in range ( N ) :
                A.append ( sc.read ( ) )
                M = max ( M , A [ i ] )
            g = A [ 0 ]
            for i in range ( 1 , N ) :
                g = gcd ( g , A [ i ] )
            if K % g == 0 and K <= M :
                print ( "POSSIBLE" )
            else :
                print ( "IMPOSSIBLE" )
    def gcd ( n , m ) :
        if n < m :
            return gcd ( m , n )
        if m == 0 :
            return n
        return gcd ( m , n % m )
