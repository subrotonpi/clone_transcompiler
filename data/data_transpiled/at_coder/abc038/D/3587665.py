def import _mod
class Main ( object ) :
    def __init__ ( self ) :
        self.mod = 1000000000 + 7
    def __call__ ( self , * args ) :
        sc = _mod.raw_input ( )
        n = int ( ( sc.next ( ) ) )
        box = [ ]
        for i in range ( n ) :
            w , h = map ( int , ( sc.next ( ) , args ) )
            box.append ( ( w , h ) )
        box.sort ( key = mycmp )
        a = [ box [ i ] [ 1 ] for i in range ( n ) ]
        ans = LIS ( a )
        print ( ans )
    def LIS ( a ) :
        n = len ( a )
        max = [ ]
        max.append ( int ( max [ 0 ] ) / 2 )
        for i in range ( n ) :
            idx = bisect.bisect_left ( a , i )
            if idx >= 0 :
                continue
            idx = - ( idx + 1 )
            max.append ( min ( a [ i ] , max [ idx ] ) )
        for i in range ( n , - 1 , - 1 ) :
            if max [ i ] < int ( max [ i ] ) / 2 :
                return i + 1
        return 1
