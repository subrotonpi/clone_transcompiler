def import division
class Main ( object ) :
    def __init__ ( self ) :
        self.DIV = 998244353
    def __call__ ( self , n , a , b , k ) :
        sc = sys.stdin
        n = sc.randint ( 0 , n )
        a = sc.randint ( 0 , n )
        b = sc.randint ( 0 , n )
        k = sc.randint ( 0 , n )
        sc.close ( )
        comb = [ 1 ] * ( n - i )
        if comb [ i + 1 ] > self.DIV :
            comb [ i + 1 ] = comb [ i + 1 ] % self.DIV
        comb [ i + 1 ] = comb [ i + 1 ] * modinv ( i + 1 , self.DIV )
        if comb [ i + 1 ] > self.DIV :
            comb [ i + 1 ] = comb [ i + 1 ] % self.DIV
    ans = 0
    for i in range ( 0 , n ) :
        if ( k - a * i ) % b != 0 :
            continue
        tmp = ( k - a * i ) // b
        if tmp > n or tmp < 0 :
            continue
        bi = int ( tmp )
        ans += comb [ i ] * comb [ bi ]
        if ans >= self.DIV :
            ans = ans % self.DIV
    print ( ans )
    def modinv ( self , a , n ) :
        b , u , v = n , 1 , 0
        while b > 0 :
            t = a // b
            a -= t * b
            u -= t * v
            t , a , b , t , u , v = t
        u = u % self.DIV
        if u < 0 :
            u += n
        return u
