def _import ( ) : return n * ( r + r - 3 ) + n * ( n + 1 ) * ( 2 * n + 2 )
class A :
    def __init__ ( self , n ) :
        self.n = n
        self.r = r
        self.t = t
    def solve ( self ) :
        r , t = self.n , self.t
        L = 1
        R = 10 ** 100
        while L < R :
            m = L + R + 1 / 2
            if self.check ( m , r ) <= t :
                L = m
            else :
                R = m - 1
        return L
    def main ( self ) :
        self.n = n
        self.r = r
        self.t = t
