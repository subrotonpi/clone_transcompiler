def main ( ) :
    import time
    import sys
    class B ( ) :
        TIME = False
        def __init__ ( self ) :
            self.D = raw_input ( )
            self.I = raw_input ( )
            self.M = raw_input ( )
            self.N = raw_input ( )
            self.a = [ raw_input ( ) for i in range ( N ) ]
            self.dp = [ [ ] for _ in range ( N + 1 ) ]
            for i in range ( N ) :
                for j in range ( 256 ) :
                    tmp = self.dp [ i ] [ j ] + D
                    if M == 0 :
                        tmp = min ( tmp , self.dp [ i ] [ j ] + abs ( a [ i ] - j ) )
                    else :
                        for k in range ( 256 ) :
                            diff = abs ( k - j )
                            need = ( diff - 1 ) / M
                            if need < 0 : need = 0
                            cost = need * I + abs ( a [ i ] - j )
                            if tmp > self.dp [ i ] [ k ] + cost :
                                tmp = self.dp [ i ] [ k ] + cost
                self.dp [ i + 1 ] [ j ] = tmp
    res = sum ( [ 0 ] * 256 )
    for i in range ( 256 ) :
        res = min ( res , self.dp [ N ] [ i ] )
    print ( res )
    def run ( self ) :
        time = time.time ( )
        self.sc = raw_input ( )
        on = self.sc.__next__ ( )
        for o in range ( 1 , on + 1 ) :
            t = ( time.time ( ) - time.time ( ) ) * 1e-3
            if self.TIME :
                sys.stderr.write ( "%03d/%03d %.3f/%.3f\n" % ( o , on , t , t / ( o - 1 ) * on ) )
            sys.stdout.write ( "Case #%d: " % o )
            self.solve ( )
            sys.stdout.flush ( )
