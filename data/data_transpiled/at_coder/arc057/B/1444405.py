def import _main
class Main ( object ) :
    def __init__ ( self ) :
        self.n , self.k = int ( self.n ) , int ( self.k )
        self.a = [ _main ( self ) for _ in range ( self.n ) ]
        if self.k == 0 :
            print ( 0 )
            return
        sum = 0
        for i in range ( self.n ) :
            sum += a [ i ]
        if sum == self.k :
            print ( 1 )
            return
        dp = [ [ INF ] * ( n + 1 ) for i in range ( 2 , self.n + 1 ) ]
        dp [ 1 ] [ 1 ] = 1
        sum = a [ 0 ]
        for i in range ( 2 , self.n + 1 ) :
            for j in range ( 0 , self.n ) :
                dp [ i ] [ j ] = dp [ i - 1 ] [ j ]
                if j - 1 >= 0 :
                    low , high = 0 , self.a [ i - 1 ] + 1
                    while high - low > 1 :
                        mid = ( low + high ) / 2
                        if self.f ( sum , dp [ i - 1 ] [ j - 1 ] , i - 1 , mid ) :
                            high = mid
                        else :
                            low = mid
                    if high <= self.a [ i - 1 ] and self.f ( sum , dp [ i - 1 ] [ j - 1 ] , i - 1 , high ) :
                        dp [ i ] [ j ] = min ( dp [ i ] [ j ] , dp [ i - 1 ] [ j - 1 ] + high )
            sum += a [ i - 1 ]
        ans = 0
        for i in range ( self.n , self.k - 1 , - 1 ) :
            if dp [ self.n ] [ i ] <= self.k :
                ans = i
                break
        print ( ans )
return Main
