def import _main
class Main ( object ) :
    def __init__ ( self ) :
        self.mod = 1000000000 + 7
    def __call__ ( self , * args ) :
        sc = _main ( * args )
        n = int ( sc.split ( ' ' ) [ 0 ] )
        a = [ int ( i ) for i in sc.split ( ' ' ) [ 1 : ] ]
        ans = n - LIS ( a )
        print ( ans )
    def LIS ( a ) :
        n = len ( a )
        max = [ ]
        max.append ( int ( n / 2 ) )
        for i in range ( n ) :
            idx = bisect.bisect_right ( a , i )
            if idx >= 0 :
                continue
            idx = - ( idx + 1 )
            max.append ( min ( a [ i ] , max [ idx ] ) )
        for i in range ( n , - 1 , - 1 ) :
            if max [ i ] < int ( n / 2 ) :
                return i + 1
        return 1
