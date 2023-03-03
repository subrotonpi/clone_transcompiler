def import _main
class Main ( object ) :
    def __init__ ( self ) :
        sc = _main ( )
        self.n = int ( sc.next ( ) )
        h = [ int ( i ) for i in sc.next ( ).split ( ) ]
        s = [ int ( i ) for i in sc.next ( ).split ( ) ]
        hi = 0
        lo = 0
        for i in range ( n ) :
            hi = max ( hi , h [ i ] + s [ i ] * ( self.n - 1 ) )
            lo = max ( lo , h [ i ] - 1 )
        while hi - lo > 1 :
            mid = ( hi + lo ) // 2
            if self.check ( h , s , mid ) :
                hi = mid
            else :
                lo = mid
        print ( hi )
    def check ( self , h , s , target ) :
        rec = [ 0 ] * n
        for i in range ( self.n ) :
            if target < h [ i ] :
                return False
            cur = int ( min ( self.n - 1 , ( target - h [ i ] ) // s [ i ] ) )
            rec [ cur ] += 1
            if rec [ cur ] > cur + 1 :
                return False
        sum = 0
        for i in range ( self.n ) :
            sum += rec [ i ]
            if sum > i + 1 :
                return False
        return True
