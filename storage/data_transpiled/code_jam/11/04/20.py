def import _memoo
class d ( object ) :
    def __init__ ( self ) :
        self.memo = [ ]
        self.memoo = [ ]
    def main ( self ) :
        with open ( self.memo [ 0 ] , 'r' ) as f :
            self.memo.append ( f )
    T = len ( sys.stdin )
    for t in range ( 1 , T + 1 ) :
        n = len ( sys.stdin )
        k = 0
        for i in range ( 1 , n + 1 ) :
            if i != sys.stdin.read ( 1 ) :
                k += 1
            print ( 'Case #%d: %f' % ( t , float ( k ) ) )
    def f ( self , k , j ) :
        if not j or j > k :
            return 0
        if k == 0 and j == 0 :
            return 1
        if self.memoo [ k ] [ j ] :
            return self.memoo [ k ] [ j ]
        ans = f ( self.k - 1 , j - 1 ) + f ( self.k - 1 , j ) * ( self.k - 1 - j ) + f ( self.k - 1 , j + 1 ) * ( self.j + 1 )
        ans /= k
        return self.memoo [ k ] [ j ] = ans
    def go ( self , k ) :
        if not k :
            return 0
        if self.memo [ k ] :
            return self.memo [ k ]
        total = 1
        for i in range ( 1 , k + 1 ) :
            total += f ( self , i ) * go ( self , k - i )
        total /= ( 1 - f ( self.k , 0 ) )
        return self.memo [ k ] = total
return d
