def import _main
class Main ( object ) :
    MODULO = 1_000_000_000 + 7
    def __init__ ( self ) :
        with open ( "../../api/" , "r" ) as sc :
            N = sc.read ( )
            K = sc.read ( )
            divs = [ ]
            for i in range ( 1 , 2 ** N + 1 ) :
                if N % i == 0 :
                    divs.append ( i )
                    if i * i != N :
                        divs.append ( N / i )
            divs.sort ( )
            dp = { }
            for d in divs :
                dp [ d ] = pow ( K , ( d + 1 ) / 2 )
                for i in range ( 0 , d ) :
                    if d % divs [ i ] == 0 :
                        dp [ d ] = ( dp [ d ] - dp [ i ] + MODULO ) % MODULO
            ans = 0
            for d in divs :
                ans = ( ans + dp [ d ] * ( d / 2 or d ) ) % MODULO
            print ( ans )
    class Div ( object ) :
        def __init__ ( self , div , num ) :
            self.div = div
            self.num = num
        def pow ( self , a , n ) :
            ret = 1
            for n in range ( 0 , n ) :
                if n % 2 == 1 :
                    ret = ( ret * a ) % MODULO
            return ret
return Main
