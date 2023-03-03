def import _main
class Main ( object ) :
    def __init__ ( self , n ) :
        self.N = 1
        while self.N < n :
            self.N <<= 1
        self.v = [ 0 ] * ( self.N << 1 )
    def add ( self , x ) :
        self.i += self.N
        while self.i > 0 :
            self.v [ self.i ] += x
            self.i >>= 1
    def getSum ( a , b ) :
        return _Sum ( a , b , 1 , 0 , self.N )
    def getSum ( a , b , k , l , r ) :
        if a <= l and r <= b :
            return self.v [ k ]
        elif r <= a or b <= l :
            return 0
        else :
            return _Sum ( a , b , k * 2 , l , ( l + r ) / 2 ) + getSum ( a , b , k * 2 + 1 , ( l + r ) / 2 , r )
    def get ( self , i ) :
        return self.v [ i + self.N ]
sc = _main ( )
s = sc.read ( ).decode ( 'utf-8' )
N = len ( s )
index = [ [ ] for i in range ( 26 ) ]
for i in range ( N ) :
    index.append ( [ i - 'a' ] + [ i ] )
oddNum = 0
for i in range ( 26 ) :
    if len ( index [ i ] ) % 2 == 1 :
        oddNum += 1
    if oddNum > 1 :
        print ( - 1 )
    else :
        ans = 0
        used = [ ]
        cnt = [ 0 ]
        rmq = _RangeMinimumQuery ( N )
        for i in range ( N ) :
            if not used [ i ] :
                c = s [ i ] - 'a'
                pair = index [ c ] [ index [ c ] [ 0 ] - cnt [ c ] - 1 ]
                if i == pair :
                    ans += ( N - i - 1 - rmq ( pair + 1 , N ) )
                else :
                    rmq.append ( i