def _import ( ) : return _import ( None , _Chick , '' , 1 << 20 )
class Chick :
    def __init__ ( self , * args ) :
        self.write ( "%s\n" % ( "Case #%d: %s\n" % ( self.test , args [ 0 ] ) , args [ 1 ] ) )
    def write ( self , * o ) :
        print ( "%s\n" % ( self.test , ) , file = self.file )
    def write ( self , * o ) :
        print ( "%s\n" % ( self.test , ) , file = self.file )
        print ( "Case #%d: %s\n" % ( self.test , o ) , file = self.file )
    file = "B-large"
    with open ( file + ".in" , "r" ) as input :
        with open ( file + ".out" , "w" ) as out :
            TEST = int ( input.readline ( ) )
            for test in range ( 1 , TEST + 1 ) :
                print ( "Running on testcase #%d" % test )
                solve ( test )
            input.close ( )
            out.close ( )
    def solve ( self ) :
        x = [ ]
        v = [ ]
        can = [ ]
        x.append ( x [ 0 ] )
        v.append ( v [ 0 ] )
        for i in range ( N ) :
            if ( B - x [ i ] ) <= v [ i ] * T :
                can.append ( True )
        k = 0
        front = 0
        res = 0
        for i in range ( N - 1 , - 1 , - 1 ) :
            if k >= K : break
            if can [ i ] :
                k += 1
                res += front
            else :
                front += 1
        if k < K :
            self.write ( "IMPOSSIBLE\n" )
        else :
            self.write ( "%s\n" % ( res ) )
