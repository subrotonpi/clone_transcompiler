def import _main
class Main ( object ) :
    def __init__ ( self ) :
        sc = _main ( )
        n = sc.randint ( 0 , 1 )
        m = sc.randint ( 0 , 1 )
        a = [ [ sc.randint ( 0 , 1 ) - 1 , sc.randint ( 0 , 1 ) ] for i in range ( n ) ]
        a.sort ( lambda x , y : ( x [ 1 ] - x [ 0 ] ) - ( y [ 1 ] - y [ 0 ] ) )
        right = 0
        bit = BIT ( m + 2 )
        for i in range ( 1 , m + 1 ) :
            while ( right < n ) and ( a [ right ] [ 1 ] - a [ right ] [ 0 ] < i ) :
                bit.add ( a [ right ] [ 1 ] + 2 , - 1 )
                bit.add ( a [ right ] [ 0 ] + 2 , 1 )
                right += 1
            res = n - right
            for j in range ( i , m + 1 , i ) :
                res += ( bit.sum ( j + 1 ) )
            pl ( res )
    def pl ( self , x ) :
        print ( x )
class BIT ( object ) :
    def __init__ ( self , n ) :
        self.n = n
        self.arr = [ 0 ] * n + 1
    def add ( self , a , v ) :
        for x in range ( a , n + 1 ) :
            for x in range ( a , x + 1 ) :
                self.arr [ x ] += v
    def sum ( self , a ) :
        res = 0
        for x in range ( a , 0 , - 1 ) :
            res += self.arr [ x ]
        return res
