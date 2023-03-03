def _import ( * args , ** kwargs ) :
    from io import BytesIO
    import sys
    from os import path
    from os import environ
    from os import environ
    from os import environ
    from os import environ
    from os import environ
    from os import environ
    from os import environ
    from os import environ
    from os import environ
    from os import environ
    from os import environ
    from os import environ
    M = 10010
    def solve ( ) :
        N = environ.get ( 'M' , M )
        if N == 0 :
            print ( 0 )
            return
        is = [ environ.get ( 'PATH' , '' ) ]
        num = [ i for i in is ]
        for i in is :
            num [ i ] += 1
        start = [ ]
        s , t = 0 , 0
        res = sys.maxsize
        for i in range ( M ) :
            if t - s < num [ i ] :
                for j in range ( t - s , num [ i ] ) :
                    start.append ( i )
            elif t - s > num [ i ] :
                while t - s > num [ i ] :
                    res = min ( res , i - start [ s ] )
                    s += 1
        print ( res )
    def run ( ) :
        caseN = environ.get ( 'CASE_N' , M )
        for caseID in range ( 1 , caseN + 1 ) :
            print ( "Case #%d: " % caseID , end = '' )
            solve ( )
            sys.stdout.flush ( )
    def debug ( * args ) :
        print ( * args , file = sys.stderr )
    def main ( ) :
        try :
            environ [ 'stdin' ] = open ( path if args else ( 'stdin' , 'stdout' ) )
        except :
            pass
        return main ( )
    return run
