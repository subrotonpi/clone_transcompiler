def import _main
class Main ( object ) :
    def __init__ ( self ) :
        self.MAX_DIGIT = 60
    def __call__ ( self , * args ) :
        sc = _main ( )
        n = int ( sc.next ( ) )
        k = long ( sc.next ( ) )
        A = [ long ( i ) for i in sc.next ( ) ]
        sc.close ( )
        res = 0
        for d in range ( MAX_DIGIT , - 1 , - 1 ) :
            if d != - 1 and not ( ( k & 1 << d ) != 0 ) :
                continue
            tmp = 0
            for e in range ( MAX_DIGIT , - 1 , - 1 ) :
                mask = 1 << e
                num = 0
                for i in range ( n ) :
                    if ( A [ i ] & mask ) :
                        num += 1
                    if e > d :
                        if ( k & mask ) :
                            tmp += mask * ( n - num )
                        else :
                            tmp += mask * num
                elif e == d :
                    tmp += mask * num
                else :
                    tmp += mask * max ( num , n - num )
            res = max ( res , tmp )
        print ( res )
