def import _sys , string
class Main ( object ) :
    def __init__ ( self ) :
        self.mod = 0
    def __call__ ( self , s ) :
        s = string.split ( s )
        a = [ 0 ] * len ( s ) + [ 0 ]
        c = [ 0 ] * len ( s ) + [ 0 ]
        q = [ 0 ] * len ( s ) + [ 0 ]
        mod = 1000000007
        for i in range ( 1 , len ( s ) + 1 ) :
            if s [ i - 1 ] == 'A' :
                a [ i ] += 1
            elif s [ i - 1 ] == 'C' :
                c [ i ] += 1
            elif s [ i - 1 ] == '?' :
                q [ i ] += 1
            a [ i ] += a [ i - 1 ]
            c [ i ] += c [ i - 1 ]
            q [ i ] += q [ i - 1 ]
        ans = 0
        for i in range ( 1 , len ( s ) + 1 ) :
            if s [ i - 1 ] in [ 'B' , '?' ] :
                bi = 0
            else :
                bi = 1
            ans += ( ( a [ i ] * ( c [ s [ i ] ] - c [ i ] ) ) % mod ) * pow ( 3 , q [ s [ i ] ] - bi )
            ans %= mod
            ans += ( ( q [ i - 1 ] * ( c [ s [ i ] ] - c [ i ] ) ) % mod ) * pow ( 3 , q [ s [ i ] - 1 - bi ] )
            ans %= mod
            ans += ( ( a [ i ] * ( q [ s [ i ] ] - q [ i ] ) ) % mod ) * pow ( 3 , q [ s [ i ] - 1 - bi ] )
            ans %= mod
            ans += ( ( q [ i - 1 ] * ( q [ s [ i ] - q [ i ] ) ) % mod ) * pow ( 3 , q [ s [ i ] - 2 - bi ] )
            ans %= mod
        print ( ans )
