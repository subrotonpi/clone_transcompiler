def _import ( * args , ** kwargs ) :
    from os import environ
    from os import environ
    from os import environ
    from os import chdir
    from math import sqrt
    from math import sin , cos , log
    class D ( object ) :
        def __init__ ( self ) :
            self.stdin = environ.get ( 'stdin' )
            self.stdout.flush ( )
        def solve ( self ) :
            cs = self.stdin.read ( ).decode ( 'ascii' )
            m = 0
            for c in cs :
                if c == '?' :
                    m += 1
            for i in range ( 1 << m ) :
                ds = cs [ : ]
                p = 0
                for c in cs :
                    if c == '?' :
                        ds.append ( chr ( ord ( '0' ) + ( i >> p & 1 ) ) )
                        p += 1
                v = 0
                for c in ds : v = v * 2 + c - '0'
                a = long ( sqrt ( v ) )
                while a * a < v : a += 1
                while a * a > v : a -= 1
                if a * a == v :
                    print ( str ( v ) )
                    return
        def run ( self ) :
            caseN = self.stdin.read ( 1 )
            for caseID in range ( 1 , caseN + 1 ) :
                print ( "Case #%d: " % caseID , end = '' )
                self.solve ( )
                sys.stdout.flush ( )
        def debug ( self , * args , ** kwargs ) :
            print ( * deeprepr ( args , ** kwargs ) , file = sys.stderr )
        def run ( self ) :
            try :
                sys.stdin = open ( os.environ.get ( 'stdin' ) if os.environ.get ( 'stdin' ) else ( D ( ) + '.stdin' ) )
            except :
                pass
            return run ( self )
