def import _main
class Main ( object ) :
    def __init__ ( self ) :
        self.N = int ( self.N )
        self.L = long ( self.L )
        s = [ i for i in range ( self.N ) ]
        s = [ s [ i ] for i in range ( self.N ) ]
        s = [ s [ i ] for s in s ]
        s = [ s [ i ] for s in s ]
        xor = 0
        if s [ 0 ] [ 0 ] == '1' :
            xor ^= grundy ( L )
        xor ^= move ( '' , s [ 0 ] )
        for i in range ( self.N - 1 ) :
            xor ^= move ( s [ i ] , s [ i + 1 ] )
        xor ^= move ( s [ N - 1 ] , '' )
        if s [ - 1 ] [ 0 ] == '0' :
            xor ^= grundy ( L )
        print ( 'Bob' if xor == 0 else 'Alice' )
        self.N = int ( self.N )
    def grundy ( n ) :
        ans = 1
        while n % ans == 0 :
            ans <<= 1
        return ans
    def move ( s , t ) :
        prefix = get_prefix ( s , t )
        return up ( s , prefix ) ^ down ( prefix , t )
    def up ( s , t ) :
        ans = 0
        for i in range ( len ( s ) - 1 , len ( t ) , - 1 ) :
            if s [ i ] == '0' :
                ans ^= grundy ( L - i )
        return ans
    def down ( s , t ) :
        ans = 0
        for i in range ( len ( s ) + 1 , len ( t ) ) :
            if t [ i ] == '1' :
                ans ^= grundy ( L - i )
        return ans
    def getPrefix ( s1 , s2 ) :
        s1 = [ s1 [ i ] for i in range ( len ( s1 ) , len ( s2 ) ) if s1 [ i ] == s2 [ i ] ]
        return "".join ( s1 )
