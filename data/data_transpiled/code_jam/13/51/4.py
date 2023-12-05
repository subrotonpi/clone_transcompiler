def _import ( ) :
    from random import seed
    from os import urandom
    from random import seed
    from sys import random
    rnd = seed ( 123 )
    def fit ( a , to , value ) :
        res = 0
        for i in range ( to ) :
            res += value - a [ i ]
        for i in range ( to , 37 ) :
            if a [ i ] <= value :
                res += value + 1 - a [ i ]
        return res
    def get_profit ( a , to , value ) :
        res = 0
        for i in range ( to ) :
            res += value - a [ i ]
        ss = res * 1.0 / to * 36
        for i in range ( to , 37 ) :
            if a [ i ] <= value :
                res += value + 1 - a [ i ]
        ss -= res
        return ss
    def solve ( ) :
        b = random.randint ( 1 , 10000 )
        n = random.randint ( 1 , 10000 )
        a = [ random.randint ( 1 , 10000 ) for i in range ( n ) ]
        a.sort ( )
        best = 0
        for i in range ( 1 , 37 ) :
            l = 0
            for j in range ( i ) :
                l = max ( l , a [ j ] )
            r = long ( 1e14 )
            while r - l > 1 :
                m = ( l + r ) / 2
                need = fit ( a , i , m )
                if need <= b :
                    l = m
                else :
                    r = m
            if fit ( a , i , l ) <= b :
                best = max ( best , get_profit ( a , i , l ) )
        return best
    def run ( ) :
        with open ( "A.in" , "r" ) as f :
            out = sys.stdout
            testNumber = int ( f.read ( ) )
            for test in range ( 1 , testNumber + 1 ) :
                out.write ( "Case #%d: " % ( test ) )
                solve ( )
            out.close ( )
    return run
