def _import ( ) : return _import ( )
class Main :
    def power ( self , x , y , p ) :
        res = 1
        x = x % p
        while y :
            if y % 2 == 1 :
                res = ( res * x ) % p
                y = y >> 1
                x = ( x * x ) % p
        return res
    def mod_inverse ( self , n , p ) :
        return self.power ( n , p - 2 , p )
    def nCr ( self , r , p ) :
        if r == 0 : return 1
        fac = [ ]
        fac.append ( 1 )
        for i in range ( 1 , n + 1 ) :
            fac [ i ] = fac [ i - 1 ] * i % p
        return ( fac [ n ] * mod_inverse ( fac [ r ] , p ) % p * mod_inverse ( fac [ n - r ] , p ) ) % p
    def countsetbits ( self ) :
        count = 0
        while self.n != 0 :
            self.n &= ( self.n - 1 )
            count += 1
        return count
    def main ( self ) :
        self.stdin = sys.stdin
        self.stdin.seek ( 0 , os.SEEK_CUR )
        self.stdin.seek ( 0 , os.SEEK_CUR )
        self.stdin.seek ( 0 , os.SEEK_CUR )
        self.stdin.seek ( 0 , os.SEEK_CUR )
        self.stdin.seek ( 0 , os.SEEK_CUR )
        self.stdin.read ( )
        self.stdin.close ( )
    def readline ( self ) :
        buf = [ ]
        cnt , c = 0 , 0
        while ( self.stdin.readline ( ) or self.stdin.readline ( ) ) :
            if self.stdin.readline ( ) : break
            cnt += 1
        return buf [ cnt : ]
