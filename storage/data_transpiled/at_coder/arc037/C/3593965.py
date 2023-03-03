def import _binary
class Main ( object ) :
    def __init__ ( self , inf ) :
        self.inf = inf
    def __init__ ( self , n , k ) :
        self.n = n
        self.k = k
    def go ( self ) :
        sc = _binary.search ( self.n )
        self.n = int ( sc.n )
        self.k = int ( sc.k )
        hori = [ int ( i ) for i in sc.group ( 1 ).split ( ',' ) ]
        hori = [ int ( i ) for i in sc.group ( 2 ).split ( ',' ) ]
        vert = [ int ( i ) for i in vert ]
        hori = [ int ( i ) for i in hori ]
        hori = [ int ( i ) for i in hori ]
        hi = hori [ n - 1 ] * vert [ n - 1 ]
        lo = hori [ 0 ] * vert [ 0 ] - 1
        while hi - lo > 1 :
            mid = ( hi + lo ) // 2
            if self.check ( vert , hori , mid ) :
                hi = mid
            else :
                lo = mid
        print ( hi )
    def check ( self , vert , hori , guess ) :
        cnt = 0
        for x in range ( self.n ) :
            target = guess / hori [ x ]
            cur = self.binary ( vert , target )
            cnt += cur
            if cnt >= self.k :
                return True
        return cnt >= self.k
    def binary ( self , a , target ) :
        if target < a [ 0 ] :
            return 0
        if target >= a [ n - 1 ] :
            return n
        hi = self.n - 1
        lo = - 1
        while hi - lo > 1 :
            mid = ( hi + lo ) // 2
            if self.a [ mid ] <= target :
                lo = mid
            else :
                hi = mid
        return hi
