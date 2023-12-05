def import _BLarge
SIZE = 1100000
def Scanner ( ) :
    primes = [ True ] * SIZE
    primes [ 0 ] = primes [ 1 ] = False
    for i in range ( 2 , SIZE ) :
        if primes [ i ] :
            for j in range ( 2 * i , SIZE , i ) :
                primes [ j ] = False
    C = sc.randint ( 1 , C )
    for caseid in range ( 1 , C + 1 ) :
        A = sc.randint ( 1 , C )
        B = sc.randint ( 1 , C )
        P = sc.randint ( 1 , C )
        if P > B - A :
            cnt = int ( B - A + 1 )
        else :
            M = int ( B - A )
            set = UFSet ( M + 1 )
            for p in range ( int ( P ) , M + 1 ) :
                if primes [ p ] :
                    offset = ( p - int ( A % p ) ) % p
                    for x in range ( offset , M + 1 , p ) :
                        set.merge ( set.find ( x ) , set.find ( x + p ) )
            cnt = 0
            for i in range ( 0 , M ) :
                if set.prev [ i ] == i :
                    cnt += 1
        print ( "Case #%d: %d" % ( caseid , cnt ) )
class UFSet ( object ) :
    def __init__ ( self , n ) :
        self.n = n
        self.rank = [ 1 ] * n
        self.prev = [ ]
        for i in range ( n ) :
            self.prev.append ( i )
        def find ( x ) :
            if x != self.prev [ x ] :
                self.prev [ x ] = self.find ( x )
            return self.prev [ x ]
        def merge ( a , b ) :
            if self.rank [ a ] > self.rank [ b ] :
                self.prev [ a ] = b
            else :
                self.prev [ a ] = b
return
