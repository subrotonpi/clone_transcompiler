def _ ( ) : return next ( cin ( ) )
class Solution :
    def __init__ ( self ) :
        self.stdin = sys.stdin
        self.readline = None
        self.readline = None
        def next ( self ) :
            while self.readline is None or not self.readline.strip ( ) :
                self.readline = self.readline ( )
            return self.readline.strip ( )
        def __next__ ( self ) : return int ( next ( ) )
    def code_jam ( ) : return "welcome to code jam"
    def main ( ) :
        N = randint ( 1 , N )
        for i in range ( N ) :
            s = cin ( )
            L = len ( s )
            ans = [ [ 1 ] * ( L + 1 ) for i in range ( 20 ) ]
            for j in range ( 1 , L + 1 ) :
                for k in range ( 19 ) :
                    if code_jam ( k ) == s [ j - 1 ] :
                        for m in range ( j ) :
                            ans [ j ] [ k + 1 ] = ( ans [ j ] [ k + 1 ] + ans [ m ] [ k ] ) % 10000
            sum = 0
            for j in range ( 0 , L ) :
                sum = ( sum + ans [ j ] [ 19 ] ) % 10000
            print ( "Case #%d: %s%s" % ( i + 1 , sum < 1000 and "0" or "" , sum < 100 and "0" or "" , sum < 10 and "0" or "" , sum ) )
