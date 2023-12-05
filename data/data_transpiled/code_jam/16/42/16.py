def import import sys , StringIO , getopt
class B ( object ) :
    def __init__ ( self ) :
        self.out = sys.stdout
    def solve ( self ) :
        tc = [ ]
        for t in range ( tc ) :
            self.out.write ( "Case #%d: " % ( t + 1 ) )
        self.n = [ ]
        self.k = [ ]
        p = [ ]
        for i in range ( n ) :
            p.append ( getopt.getopt ( self.out , i ) )
        self.sort ( )
        np = [ ]
        res = 0.0
        for left in range ( 0 , self.n ) :
            right = self.k - left
            if right >= 0 :
                for i in range ( left ) :
                    np.append ( p [ i ] )
                for i in range ( right ) :
                    np.append ( p [ - 1 - i ] )
            dp = [ 1 ]
            for i in range ( k ) :
                ndp = [ ]
                for j in range ( 0 , k ) :
                    ndp.append ( dp [ j ] * ( 1 - np [ i ] ) )
                    if j + 1 <= k :
                        ndp.append ( dp [ j + 1 ] * np [ i ] )
                dp = ndp
            res = max ( res , dp [ k / 2 ] )
        print ( res , file = sys.stderr )
        print ( "%d/%d done" % ( self.t + 1 , tc ) , file = sys.stderr )
    def run ( self ) :
        try :
            f = open ( "B.in" , "r" )
            out = sys.stdout
            solve ( )
            out.close ( )
        except IOError :
            pass
        else :
            f.close ( )
    def runIO ( self ) :
        f = open ( "B.out" , "w" )
        solve ( )
        f.close ( )
