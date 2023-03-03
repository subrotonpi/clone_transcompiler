def _import ( ) :
    from io import IO
    class Main ( IO ) :
        def __init__ ( self ) :
            IO = IO ( )
        def __next__ ( self ) :
            N = io.__next__ ( )
            K = io.__next__ ( )
            M = 1000000007
            div = [ ]
            for i in range ( 1 , math.sqrt ( K ) + 1 ) :
                if K % i == 0 :
                    self.next = next
            return chr ( next ( self ) )
        def __next__ ( self ) :
            raise StopIteration
        def __next__ ( self ) :
            if not self.next :
                raise StopIteration
        def array_int ( self ) :
            a = [ ]
            for i in range ( 0 , n ) :
                a.append ( i )
            if i != K / i :
                div.append ( K / i )
        def __next__ ( self ) :
            return next ( self )
        def __next__ ( self ) :
            return next ( self )
        def __next__ ( self ) :
            if self.next == '-' :
                minus = True
            else :
                raise StopIteration
        def array_long ( self ) :
            a = [ ]
            for i in range ( len ( self ) - 1 , - 1 , - 1 ) :
                a.append ( next ( self ) )
            return a
        def __next__ ( self ) :
            return next ( self )
        def array_int ( self ) :
            * a
            dmax = N / self.n
            sum = [ ]
            for i in range ( len ( self ) ) :
                a [ i ] = __next__ ( self )
            for j in range ( i + 1 , len ( self ) ) :
                if self.next ( ) % d == 0 :
                    sum [ i ] -= sum [ j ]
            ans = ( ans + sum [ i ] / d ) % M
            return sum [ i ]
    class CharMap ( IO ) :
        def __init__ ( self , n , m ) :
            self.stream = open ( self.stream , 'rb' )
            self.ptr = 0
        def __next__ ( self ) :
            return True