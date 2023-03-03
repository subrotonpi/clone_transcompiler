def import import readline
import sys
class B ( readline ) :
    def __init__ ( self ) :
        self.stdin = readline
        self.stdout = sys.stdout
        self.stdout = open
        self.stdout = sys.stdout
        self.get ( '+' )
        return 0 if self.get ( '+' ) == '' else 1
    def solve ( self ) :
        tc = readline.readline ( )
        for t in range ( tc ) :
            self.stdout.write ( 'Case #%d: ' % ( t + 1 ) )
        s = readline.strip ( )
        n = len ( s )
        dp = [ [ 0 ] * ( n + 1 ) ]
        dp [ 0 ] [ 0 ] = dp [ 1 ] [ 0 ] = 0
        for len in range ( 1 , n + 1 ) :
            for it in range ( 2 ) :
                for want in range ( 2 ) :
                    dp [ want ] [ len ] = min ( dp [ want ] [ len ] , dp [ 1 - want ] [ len ] + 1 )
                    if get ( s [ - 1 ] ) == want :
                        dp [ want ] [ len ] = min ( dp [ want ] [ len ] , dp [ 1 - want ] [ len ] )
        self.stdout.write ( dp [ 0 ] [ n ] )
        sys.stderr.write ( '%d/%d done\n' % ( t + 1 , tc ) )
    def run ( self ) :
        try :
            self.stdin = open ( 'B.in' , 'r' )
            self.stdout = open ( 'B.out' , 'w' )
            self.solve ( )
            self.stdout.close ( )
        except IOError :
            pass
    def runIO ( self ) :
        self.stdin = open ( 'B.in' , 'r' )
        self.stdout = open ( 'B.out' , 'w' )
        self.solve ( )
        self.stdout.close ( )
