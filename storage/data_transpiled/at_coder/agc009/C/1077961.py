def import _main
class Main ( object ) :
    def __init__ ( self ) :
        self.N = self.N
        self.A , self.B = self.A , self.B
    def __init__ ( self , n ) :
        self.n = n + 1
    def addval ( self , v ) :
        while self.k <= n :
            self.val [ self.k ] = v
            self.A = self.val [ self.k ] + self.MOD
            self.B = self.val [ self.k ]
    def getval ( self , k ) :
        s = 0
        while self.k > 0 :
            s += self.val [ self.k ]
            s = ( s + self.MOD ) % self.MOD
            self.k -= self.val [ self.k ]
    def clear ( self ) :
        self.val = [ ]
    def tr ( self , * args ) :
        print ( " ".join ( [ str ( x ) for x in args ] ) )
class Query ( object ) :
    def __init__ ( self , pos , val ) :
        self.pos = pos
        self.val = val
    def tr ( self , * args ) :
        print ( " ".join ( [ str ( x ) for x in args ] ) )
class StackA ( object ) :
    def tr ( self , * args ) :
        print ( " ".join ( [ str ( x ) for x in args ] ) )
class StackB ( object ) :
    def tr ( self , * args ) :
        print ( " ".join ( [ str ( x ) for x in args ] ) )
    left_a = - 1
    left_b = - 1
    for i in range ( N + 1 ) :
        s_a = 0
        s_b = 0
        while S [ i + 1 ] - S [ left_a + 1 ] >= A :
            left_a += 1
        while S [ i + 1 ] - S [ left_b + 1 ] >= B :
            left_b += 1
        s_b = bitA.getval ( ( left_b + 1 ) + 1 )
    print ( ( left_a - left_b ) %