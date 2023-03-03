def main ( ) :
    import sys
    class Main ( object ) :
        def __init__ ( self ) :
            sc = sys.stdin
            s = sc.readline ( )
            n = len ( s )
            kosu = [ 0 ] * 26
            for i in range ( n ) :
                ch = s [ i ]
                kosu [ ord ( ch ) - ord ( 'a' ) ] += 1
            bit = BIT ( n )
            for i in range ( n ) :
                c = map ( bit , s [ i ] )
                bit += c + 1
            return res
        def add ( self , v ) :
            self.size = self.size + 1
            arr = [ ]
            for x in range ( self.size ) :
                self.size += self.size
            for x in self.size :
                self.size += x % 2
            if self.size > 1 :
                print ( - 1 )
                return res
        b = [ ]
        kosu2 = [ 0 ] * 26
        zen , kou = [ 0 ] * ( n // 2 )
        zsize , ksize = 0 , 0
        for ch in s :
            ich = ord ( ch )
            self.size += 1
            if self.size == ( 2 * kosu2 - 1 ) :
                b.append ( 1 )
            elif self.size / 2 >= self.size :
                b.append ( 0 )
                zen.append ( ich )
            else :
                b.append ( 2 )
                kou.append ( ich )
        res = inversion ( b )
        kkou = [ 0 ] * ( n // 2 )
        for i in range ( self.size ) :
            kkou [ i ] = self.size
        res2 = count_sort ( zen , kkou )
        print ( res , res2 )
    def count_sort ( a , b ) :
        n = len ( a )
        map = { }
        for i in range ( self.size ) :
            queue = ( map ( a [ i ] ) if a [ i ] in map else PriorityQueue ( ) )
            queue.add ( i )
            map ( queue )
        return res
    return Main ( )
