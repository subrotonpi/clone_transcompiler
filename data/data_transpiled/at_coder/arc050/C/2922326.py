def main ( ) :
    import sys
    class Main ( object ) :
        def __init__ ( self ) :
            self.a = sys.stdin.read ( )
            self.b = sys.stdin.read ( )
            self.mod = sys.stdin.read ( )
            if self.b > self.a :
                tmp = self.a
                self.a = self.b
                self.b = tmp
    g = gcd ( a , b )
    tengcd = 1
    ten = 10 % mod
    for i in range ( 64 ) :
        if ( ( g >> i ) & 1 ) == 1 :
            tengcd = ( tengcd * ten ) % mod
        ten = ( ten * ten ) % mod
    bekione = [ 1 ] * 64
    bekiten = [ 10 % mod ] * 64
    for i in range ( 1 , 64 ) :
        bekiten [ i ] = bekiten [ i - 1 ] * bekiten [ i - 1 ] % mod
        bekione [ i ] = ( bekione [ i - 1 ] * bekiten [ i - 1 ] % mod + bekione [ i - 1 ] ) % mod
    onea = 0
    for i in range ( 64 ) :
        if ( ( a >> i ) & 1 ) == 1 :
            onea = ( onea * bekiten [ i ] % mod + bekione [ i ] ) % mod
    bekione2 = [ 1 ] * 64
    bekiten2 = [ tengcd ] * 64
    for i in range ( 64 ) :
        bekiten2 [ i ] = bekiten2 [ i - 1 ] * bekiten2 [ i - 1 ] % mod
        bekione2 [ i ] = ( bekione2 [ i - 1 ] * bekiten2 [ i - 1 ] ) % mod + bekione2 [ i - 1 ]
    print ( ( onea * bdivg ) % mod )
