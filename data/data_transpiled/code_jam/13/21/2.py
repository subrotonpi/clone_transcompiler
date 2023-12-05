def _import ( ) :
    from locale import getlocale
    from locale import getlocale
    from locale import getlocale
    from locale import getlocale
    from locale import getlocale
    from locale import getlocale
    from locale import getlocale
    from locale import getlocale
    class Main ( object ) :
        def __init__ ( self , problem ) :
            self.problem = problem
            self.filename = "%s-large" % self.problem
        def solve ( self ) :
            A , N = self.iread ( ) , self.N
            sz = [ getlocale ( ) [ 0 ] for i in range ( N ) ]
            sz.sort ( )
            ans = N
            k = 0
            if A > 1 :
                for i in range ( N ) :
                    while A <= sz [ i ] :
                        A = 2 * A - 1
                        k += 1
                    A += sz [ i ]
                    ans = min ( ans , N - i - 1 + k )
                self.out.write ( "%s" % ans )
        def solve_gcj ( self ) :
            tests = self.iread ( )
            for test in range ( 1 , tests + 1 ) :
                self.out.write ( "Case #%d: " % test )
                self.solve ( )
                self.out.write ( "\n" )
        def run ( self ) :
            try :
                f = open ( self.filename + ".in" , "r" )
                f.write ( "\n" )
                f.close ( )
            except :
                sys.stderr.write ( "Error opening file %s\n" % self.filename )
                sys.exit ( 1 )
        def iread ( self ) :
            return int ( self.readword ( ) )
        def dread ( self ) :
            return float ( self.readword ( ) )
        def lread ( self ) :
            return long ( self.readword ( ) )
    return Main
