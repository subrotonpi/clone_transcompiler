def import __main__
class Main ( object ) :
    def __init__ ( self ) :
        self.n = int ( self.n )
    def go ( self ) :
        self.aa = [ ]
        for i in range ( self.n ) :
            self.aa.append ( i )
        l = self.l
        dp = [ [ ] for i in range ( self.n ) ]
        right = self.n - 1
        for i in range ( self.n - 1 , - 1 , - 1 ) :
            while ( self.aa [ right ] - self.aa [ i ] ) > l :
                right -= 1
            self.dp [ i ].append ( right )
        self.dp [ - 1 ].append ( n )
        for i in range ( 1 , 33 ) :
            for j in range ( self.n - 1 , - 1 , - 1 ) :
                self.dp [ j ] [ i ] = ( self.dp [ j ] [ i - 1 ] == n )
        for q in range ( self.q ) :
            a = self.q - 1
            b = self.q - 1
            if a > b :
                c = a
                a , b = b , c
            res = 0
            cur = a
            while cur < b :
                bit = 0
                while self.dp [ cur ] [ bit ] <= b :
                    bit += 1
                bit -= 1
                if bit < 0 :
                    res += 1
                    break
                res += ( 1 << bit )
                cur = self.dp [ cur ] [ bit ]
            self.pl ( res )
    def pl ( self , x ) :
        print ( x )
