def import __main__
class Main ( object ) :
    def __init__ ( self ) :
        self.dp = [ [ ] for _ in range ( 1 << 20 ) ]
    def main ( self ) :
        self.dp = [ [ ] for _ in range ( 1 << 20 ) ]
        with open ( self.dp , 'r' ) as sc :
            n = int ( sc.read ( ) )
            m = sc.read ( )
        self.sum = 0
        distance = [ [ ] for _ in range ( n ) ]
        for u , v , c in self.distance :
            u -= 1
            v -= 1
            distance [ u ] [ v ] = c
            distance [ v ] [ u ] = c
            self.sum += c
    s = [ 0 ] * ( 1 << n )
    for i in range ( 1 , 1 << n ) :
        for j in range ( n ) :
            for k in range ( j + 1 , n ) :
                if ( i >> j ) % 2 == 1 and ( i >> k ) % 2 == 1 :
                    s [ i ] += distance [ j ] [ k ]
    for i in range ( 0 , 1 << n ) :
        dp [ i ] = - 1
    dp [ 1 ] = 0
    for i in range ( ( 1 << n ) ) :
        for j in range ( n ) :
            if dp [ i ] [ j ] == - 1 :
                continue
            for k in range ( n ) :
                if ( i >> k ) % 2 == 1 or distance [ j ] [ k ] == 0 :
                    continue
                dp [ i | ( 1 << k ) ] [ k ] = max ( dp [ i | ( 1 << k ) ] [ k ] , dp [ i ] [ j ] + distance [ j ] [ k ] )
        x = ( 1 << n ) - 1 - i
        for y in range ( x , 1 << n ) :
            dp [ i | y ] [ j ] = max ( dp [ i | y ] [ j ] , dp [ i ] [ j ] + s [ y | ( 1 << j ) ] )
    print ( sum - dp [ ( 1 << n ) - 1 ] [ n - 1 ] )
