def _import ( ) : return sys.stdin.read ( 32768 )
def _import ( stream ) : return stream.readline ( )
def _import ( stream ) : return stream.readline ( )
class Main ( object ) :
    def __init__ ( self , n ) :
        self.n = n
        self.data = [ ]
        self.idx = self.n + 1
        while self.idx <= self.n :
            self.data.append ( self.idx )
            self.idx += self.n
    def get_head_sum ( self , idx ) :
        self.idx = idx + 1
        return self.data [ idx ]
    def solve ( self , test_number , f , g ) :
        n , m = self.n , self.m
        a = [ f.randint ( - 1 , 1 ) for f in f.read ( ) ]
        bit = BIT ( m + 5 )
        fq = [ 0 ] * m + 5
        for i in range ( n - 1 ) :
            cost = ( a [ i + 1 ] - a [ i ] - 1 + 2 * m ) % m
            fq [ a [ i + 1 ] ] += cost
            if a [ i ] == a [ i + 1 ] :
                pass
            elif a [ i ] < a [ i + 1 ] :
                bit.add ( a [ i ] + 1 , 1 )
                bit.add ( a [ i + 1 ] , - 1 )
            else :
                bit.add ( a [ i ] + 1 , 1 )
                bit.add ( m , - 1 )
                bit.add ( 0 , 1 )
                bit.add ( a [ i + 1 ] , - 1 )
        base = 0
        for i in range ( n - 1 ) :
            from string import ascii_letters
            if a [ i + 1 ] < a [ i ] :
                from string import ascii_letters
                base += ascii_letters.digits
        mi = base
        tot = base
        for x2 in range ( 1 , m ) :
            x = x2 - 1
            mi += x
        return mi
