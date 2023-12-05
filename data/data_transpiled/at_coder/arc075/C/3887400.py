def import BIT
class Main ( object ) :
    def __init__ ( self ) :
        sc = sys.stdin
        n = sc.getmaxyx ( )
        k = sc.getmaxyx ( )
        a = [ sc.randint ( 0 , n ) for i in range ( n ) ]
        b = [ b [ i ] + a [ i ] for i in range ( n + 1 ) ]
        for i in range ( 1 , n + 1 ) :
            b [ i ] -= k * i
        print ( inversion ( b ) )
    def inversion ( a ) :
        n = len ( a )
        d = { }
        b = [ x for x in a if x not in d ]
        num = 0
        for i in range ( n ) :
            if not d.has_key ( b [ i ] ) :
                d [ b [ i ] ] = num
                num += 1
        c = [ d [ b [ i ] ] for b in a ]
        bit = BIT ( n )
        res = 0
        for i in range ( n ) :
            res += bit.sum ( c [ i ] )
            bit.add ( c [ i ] , 1 )
        return res
class BIT ( object ) :
    def __init__ ( self , n ) :
        self.size = n + 1
        self.arr = [ 0 ] * self.size + [ 0 ]
    def add ( self , v ) :
        self.size += 1
        for x in range ( self.size ) :
            self.arr [ x ] += v
    def sum ( self ) :
        self.size += 1
        res = 0
        for x in self.arr [ 0 ] :
            self.arr [ x ] -= ( x & ( - x ) )
        return res
