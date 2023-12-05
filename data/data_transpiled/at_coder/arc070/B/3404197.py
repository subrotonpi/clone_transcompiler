def import _main
class Main ( object ) :
    def __init__ ( self ) :
        self.n = 0
        self.k = 0
        self.a = [ _main ( i ) for i in range ( self.n ) ]
    def check ( self ) :
        self.a = [ _main ( i ) for i in range ( self.n ) ]
        self.a.sort ( )
        if self.check ( 0 ) :
            print ( 0 )
            sys.exit ( 0 )
        if not self.check ( self.n - 1 ) :
            print ( self.n )
            sys.exit ( 0 )
        hi = self.n - 1
        lo = 0
        while hi - lo > 1 :
            mid = ( lo + hi ) // 2
            if self.check ( mid ) :
                hi = mid
            else :
                lo = mid
        print ( hi )
    def check ( self , idx ) :
        cur = self.a [ idx ]
        range = [ True ] * ( self.k + 1 )
        for i in range ( self.n ) :
            if i == idx :
                continue
            now = self.a [ i ]
            for j in range ( self.k , now - 1 , - 1 ) :
                if self.a [ j - now ] :
                    range [ j ] = True
                    if self.k - cur <= j < k :
                        return True
        for j in range ( max ( 0 , self.k - cur ) ) :
            if self.a [ j ] :
                return True
        return False
return Main
