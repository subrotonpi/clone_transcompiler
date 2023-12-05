def import import struct
class Main ( struct ) :
    def __init__ ( self , sc ) :
        self.n = sc.__next__ ( )
        self.k = sc.__next__ ( )
        a = struct.unpack ( '>i' , sc.read ( 1 ) )
        self.a = a
        self.k = sc.__next__ ( )
    def add ( self , n , k , bit ) :
        b = [ ]
        d = defaultdict ( int )
        sum = 0
        for i in range ( 0 , n ) :
            b.append ( sum - k * i )
            d.setdefault ( b [ i ] , None )
            sum += a [ i ]
        value = 0
        for key , c in d.items ( ) :
            value += 1
        bn = sum ( ( n + 1 ) * 2 - 1 )
        bit = [ 0 ] * 2 ** bn
        ans = 0
        for i in range ( 0 , n ) :
            c = d [ b [ i ] ]
            ans += query ( c , bn , bit ) + bit [ c + bn ]
            self.add ( c , bn , bit )
        print ( ans )
    def add ( self , n , off , bit ) :
        if off == 0 :
            return
        bit [ n + off ] += 1
        self.add ( n // 2 , off // 2 , bit )
    def query ( self , n , off , bit ) :
        if off == 0 :
            return 0
        return ( n % 2 ) * bit [ n + off - 1 ] + query ( n // 2 , off // 2 , bit )
