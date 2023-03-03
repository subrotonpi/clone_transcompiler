def _import ( s , ch ) :
    import string
    import string
    import itertools
    import string
    class Main ( object ) :
        def __init__ ( self , * args , ** kwargs ) :
            self.s = string.strip ( args )
        def __call__ ( self , * args , ** kwargs ) :
            n , k = self.s.split ( '' )
            c = ( s , )
            c.sort ( )
            ans = ''
            for i in range ( n ) :
                for j in range ( n ) :
                    if c [ j ] != '' and count ( ans , c , c [ j ] ) <= k :
                        ans += c [ j ]
                        c [ j ] = ''
                        break
                print ( ans )
        def count ( ans , c , ch ) :
            d = int ( sum ( [ s [ i ] != ans [ i ] for i in range ( 26 ) ] ) ) + ( 0 if ch == s [ len ( ans ) ] else 1 )
            a = [ 0 ] * 26
            for b in c :
                if b != '' : a [ b - 'a' ] += 1
                a [ ch - 'a' ] -= 1
            for b in s [ len ( ans ) + 1 : ] :
                if a [ b - 'a' ] > 0 : a [ b - 'a' ] -= 1
            else :
                d += 1
            return d
    return Main
