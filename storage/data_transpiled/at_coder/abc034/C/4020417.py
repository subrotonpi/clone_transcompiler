def _ ( ) : return ( ( x * y ) % mod ) % mod
class Main ( object ) :
    def __init__ ( self , * args ) :
        sc = raw_input ( )
        h = sc.__next__ ( )
        w = sc.__next__ ( )
        Init ( 200000 )
        out ( combi ( h + w - 2 , w - 1 ) )
    def __init__ ( self , n ) :
        fact = [ ]
        inv = [ 0 ]
        fact.append ( inv [ 0 ] = 1 )
        for i in range ( 1 , n ) :
            fact.append ( ( fact [ i - 1 ] * i ) % mod )
            inv.append ( self.power ( fact [ i ] , self.n - 2 ) )
    def combi ( self , n ) :
        return ( ( fact [ n ] * inv [ n - k ] ) % mod ** 2 ) % mod
    def power ( self , x , n ) :
        if not n :
            return 1
        if n % 2 == 0 :
            e = power ( self , x , n // 2 ) % mod
            return ( e ** 2 ) % mod
        e = power ( self , x , ( n - 1 ) // 2 ) % mod
        return ( ( e ** 2 ) % mod ** 2 ) % mod
