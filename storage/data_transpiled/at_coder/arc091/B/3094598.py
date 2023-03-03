def main ( ) :
    import sys
    class Main ( object ) :
        def __init__ ( self ) :
            self.n = int ( self.n )
            self.k = int ( self.k )
        def __repr__ ( self ) :
            return "%s %s" % ( self.n , self.k )
    n = Main ( )
    k = Main ( )
    if k == 0 :
        print ( n ** 2 )
        return
    ans = ( n - k + 1 ) * ( n - k ) / 2
    for i in range ( k + 1 , n ) :
        tmp = ( ( n - i ) // i ) * ( i - k )
        if n % i >= k :
            tmp += n % i - k + 1
        ans += tmp
    print ( ans )
