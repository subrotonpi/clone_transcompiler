def import sys
class Main ( object ) :
    def __init__ ( self ) :
        sc = sys.stdin
        n = sc.read ( )
        xor = 0
        for i in range ( n ) :
            a = sc.read ( )
            k = sc.read ( )
            xor ^= grundy ( a , k )
        print ( ( xor , "Aoki" ) )
    def grundy ( a , k ) :
        if a % k == 0 :
            return a // k
        if a < k :
            return 0
        d = a // k + 1
        rem = a % d
        c = int ( math.ceil ( float ( a / k ** 2 - rem ) / d ) )
        b = d * c + rem
        if b % k == 0 :
            return b // k
        a = int ( b - d )
        return grundy ( a , k )
