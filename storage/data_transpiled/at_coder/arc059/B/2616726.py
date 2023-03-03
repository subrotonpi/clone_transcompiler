def import _main
class Main ( object ) :
    def __init__ ( self , sc ) :
        s = sc.read ( )
        s = s.split ( )
        a = - 1
        b = - 1
        for i in range ( len ( s ) - 1 ) :
            if s [ i ] == s [ i + 1 ] :
                a = i + 1
                b = i + 2
                break
            if i + 2 < len ( s ) and s [ i ] == s [ i + 2 ] :
                a = i + 1
                b = i + 3
                break
        print ( a , b )
    def main ( ) :
        sc = _main ( )
        return sc
