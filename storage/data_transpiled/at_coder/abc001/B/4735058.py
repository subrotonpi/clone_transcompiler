def main ( ) :
    import sys
    class Main ( object ) :
        def __init__ ( self ) :
            self._main = Main ( )
        def __call__ ( self , * args , ** kwargs ) :
            with open ( self._main , 'r' ) as sc :
                for line in sc :
                    a = int ( line )
                    VV = 0
                    if a >= 100 and a <= 5000 :
                        VV = a * 10
                    elif a >= 6000 and a <= 30000 :
                        VV = a + 50000
                    elif a >= 35000 and a <= 70000 :
                        VV = ( a - 30000 ) / 5 + 80000
                    elif a > 70000 :
                        VV = 89000
                    print ( '%02d' % ( VV / 1000 ) )
