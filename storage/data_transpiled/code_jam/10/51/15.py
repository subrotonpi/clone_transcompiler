def gcj2010.r3 ( ) :
    import os
    import os
    import os
    import os
    import time
    import time
    import termios
    import os.name
    import time
    import time
    import termios
    import struct
    import time
    import os.name
    import time
    import time
    import os.environ as environ
    import os.environ as environ
    import os.environ as environ
    import os.environ as environ
    import os.environ as environ
    import os.environ as environ
    import os.environ as environ
    import os.environ as environ
    import time
    import time
    SDF = os.environ.get ( 'SDF' , '' ) + '.txt'
    f = open ( f , 'w' )
    f.write ( str ( os.environ.get ( 'SDF' , '' ) ) + '.txt' )
    f.close ( )
    if MODE > 0 :
        f = open ( INPATH , 'r' )
        sc = os.popen ( f , 'r' )
        n = sc.read ( )
        f.close ( )
    else :
        f = open ( OUTPATH , 'r' )
        print ( solve ( ) )
    end = time.time ( )
    print ( ( end - start ) + 'ms' )
    def main ( ) :
        with open ( OUTPATH , 'r' ) as f :
            f.write ( str ( f.read ( ) ) )
    def ni ( n ) :
        return int ( f.read ( ) )
    def ni ( n ) :
        return int ( f.read ( ) )
    def tr ( * o ) :
        primes = [ ]
        p = [ False ] * ( pn + 1 )
        for i in range ( 2 , pn + 1 ) :
            if not p [ i ] :
                primes.append ( i )
                for j in range ( i + i , pn + 1 , i ) :
                    p [ j ] = True
        return sum ( primes )
    def solve ( ) :
        d , k = ni ( )
        s = ni ( k )
        if k == 2 and s [ 0 ] == s [ 1 ] :
            return s [ 1 ]
        if k <= 2 :
            return " I SPACETOKEN don