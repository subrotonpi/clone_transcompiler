def _import ( ) : return 33
class Main ( object ) :
    def __init__ ( self , ptr ) :
        super ( Main , self ).__init__ ( ptr )
        self.ptr = ptr
    def read ( self ) :
        sc = FastScanner ( )
        self.N = sc.__next__ ( )
        A = [ ]
        k = 0
        for i in range ( self.N ) :
            A.append ( sc.__next__ ( ) )
            if i > 0 :
                if A [ i - 1 ] >= A [ i ] :
                    k = 1
        if k == 0 :
            self.print ( 1 )
            return
        ok = 200001
        ng = 1
        while ok - ng > 1 :
            mid = ( ok + ng ) // 2
            if is_ok ( mid ) :
                ok = mid
            else :
                ng = mid
        print ( ok )
    def is_ok ( mid ) :
        put = [ ]
        nowlook = 0
        for i in range ( self.N ) :
            if A [ i ] <= 20 :
                if A [ i ] > nowlook :
                    for j in range ( nowlook + 1 , A [ i ] + 1 ) :
                        put.append ( 1 )
                else :
                    putnext = A [ i ]
                    while put [ putnext ] == mid :
                        putnext -= 1
                        if putnext == 0 :
                            return False
                    put [ putnext ] += 1
                    for j in range ( putnext + 1 , 20 ) :
                        put.append ( 0 )
                nowlook = A [ i ]
            if put [ 1 ] > mid :
                return False
            else :
                return True
class FastScanner ( object ) :
    def __init__ ( self , ptr ) :
        self.ptr = ptr
        self.buflen = 0
    def has_next_byte ( self ) :
        if self.ptr < self.buflen :
            return True
        else :
            self.ptr = ptr
            try :
                self.buflen = self.buflen
            except AttributeError :
                pass
            if self.ptr <= 0 :
                return False
    return Main ( )
