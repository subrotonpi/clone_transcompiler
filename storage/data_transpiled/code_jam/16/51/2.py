def _import ( ) :
    from os import urandom
    from random import randint
    class A ( object ) :
        def __init__ ( self ) :
            self.s = urandom ( )
            self.n = len ( self.s )
            self.ss = [ ]
            m = 0
            res = 0
            for i in range ( n ) :
                self.ss.append ( self.s [ i ] )
                if m >= 2 and self.ss [ m - 1 ] == self.ss [ m - 2 ] :
                    m -= 2
                    res += 10
            self.res += m / 2 ** 5
            return res
        def solve ( self ) :
            n = randint ( 1 , 4 )
            for i in range ( n ) :
                res = self.solve_test ( )
                print ( "Case #%d: %d" % ( i + 1 , res ) )
                self.out.write ( "Case #%d: %d\n" % ( i + 1 , res ) )
    if sys.version_info [ 0 ] < 3 or not sys.version_info [ 1 ] >= 3 :
        sys.stdout.write ( "\n".join ( [ "%s %d" % ( i , j ) for j in range ( 3 ) ] ) )
    else :
        sys.stdout.write ( "\n".join ( [ "%s %d" % ( i , j ) for i , j in range ( 3 ) ] ) )
    def main ( self ) :
        with open ( self.__file__ , "r" ) as f :
            self.stdin = f
            self.stdout = f
            try :
                self.solve ( )
            except SystemExit :
                pass
