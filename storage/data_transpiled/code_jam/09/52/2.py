def import import sys , StringIO , traceback
class Main ( object ) :
    def __init__ ( self ) :
        self.stdin = sys.stdin
        self.stdout = StringIO ( )
        self.M = 10009
    def run ( self ) :
        with open ( "input.txt" , "w" ) as f :
            self.stdout.write ( "\n" )
            self._ = sys.stdin.read ( )
    def run ( self ) :
        with open ( "output.txt" , "w" ) as f :
            self._ = sys.stdin.read ( )
    for __ in range ( self._ ) :
        print ( "Case #%d:" % ( __ + 1 ) , end = " " )
        p = self.p
        k = self.k + 1
        n = self.n
        s = [ ]
        cou = [ [ 0 ] * ( n - 1 ) for _ in range ( 26 ) ]
        pp = p.split ( "+" )
        re = [ ]
        for o , r in pp :
            res = [ 1 ] * ( k + 1 )
            res [ 0 ].append ( 1 )
            for i in range ( k ) :
                for j in range ( ( 1 << r ) ) :
                    for l in range ( n ) :
                        for jj in range ( ( 1 << r ) ) :
                            if ( j & jj ) == jj :
                                t = res [ i ] [ jj ]
                                for kk in range ( r ) :
                                    if ( j & ( 1 << kk ) ) != ( jj & ( 1 << kk ) ) :
                                        t = ( t * cou [ l ] [ r [ kk ] - 'a' ] ) % M
                            res [ i + 1 ] [ j ] = ( res [ i + 1 ] [ j ] + t ) % M
