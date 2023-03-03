def _import ( ) :
    from itertools import count , repeat
    class A ( object ) :
        def check ( self , e ) :
            if not e :
                raise Error ( )
        def __next__ ( self ) :
            return self.a and self.e and self.i and self.o and self.u
        def getPos ( self , word , n , from_line ) :
            count = 0
            for i in range ( from_line , len ( word ) ) :
                if is_line ( word [ i ] ) :
                    count += 1
                    if count == n :
                        return i
                else :
                    count = 0
            return - 1
        def solve_one ( self , word , n ) :
            count = 0
            pos = getPos ( self , word , n , 0 )
            if pos == - 1 :
                return count
            count += len ( word ) - pos
            for start in range ( 1 , len ( word ) ) :
                if pos - start + 1 >= n :
                    pass
                else :
                    assert pos - start + 1 == n - 1
                    if pos == len ( word ) - 1 :
                        return count
                    if is_line ( word [ pos + 1 ] ) :
                        pos += 1
                    else :
                        pos = getPos ( self , word , n , pos + 2 )
                        if pos == - 1 :
                            return count
            count += len ( word ) - pos
            return count
        def solve ( self ) :
            ntests = self.n
            for i in range ( 1 , ntests + 1 ) :
                print ( "Case #%d: %d" % ( i , solve_one ( self.n , i ) ) , end = "" )
    def run ( self ) :
        self.in_ , self.out = sys.stdin , sys.stdout
        try :
            solve ( self )
        finally :
            self.out = sys.stdout
    return A ( )
