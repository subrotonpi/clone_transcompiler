def import _main
class Main ( object ) :
    class LongInteger :
        def __init__ ( self , str ) :
            self.n = [ ord ( c ) - ord ( '0' ) for c in str [ : : - 1 ] ]
        def dsum ( self ) :
            if self.dsum == - 1 :
                self.dsum = 0
                for i in self.n :
                    self.dsum += i
            return self.dsum
        def multi ( self , x ) :
            nn = [ ]
            carry = 0
            for i in self.n :
                temp = i * x + carry
                nn.append ( temp % 10 )
                carry = temp // 10
            while carry > 0 :
                nn.append ( carry % 10 )
                carry /= 10
            self.n = nn
            self.dsum = - 1
        def add ( self , x ) :
            carry = x
            idx = 0
            while carry > 0 :
                temp = ( self.n [ idx ] if idx < len ( self.n ) else 0 ) + carry
                self.dsum += temp % 10 - ( self.n [ idx ] if idx < len ( self.n ) else 0 )
                if idx < len ( self.n ) :
                    self.n [ idx ] = temp % 10
                else :
                    self.n.append ( temp % 10 )
                carry = temp // 10
                idx += 1
sc = _main ( )
str = sc.read ( )
N = LongInteger ( str )
N.multi ( 9 )
for i in range ( 0 , len ( str ) ) :
    if N.dsum ( ) <= i * 9 :
        print ( i )
        break
    N.add ( 9 )
