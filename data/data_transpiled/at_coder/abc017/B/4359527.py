def __chokugo ( s ) :
    import string
    import sys
    import os
    import string
    class Main ( object ) :
        def __chokugo ( self ) :
            res = True
            for i in range ( len ( s ) ) :
                if s [ i ] == 'c' and s [ i + 1 ] == 'h' :
                    i += 1
                elif s [ i ] != 'o' and s [ i ] != 'k' and s [ i ] != 'u' :
                    res = False
                    break
            return res
    def __main ( args ) :
        with open ( '/etc/init.d/' ) as f :
            x = f.read ( )
            ans = ( 'YES' if __chokugo ( x ) else 'NO' )
            print ( ans )
    return Main ( )
