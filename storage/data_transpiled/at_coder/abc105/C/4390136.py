def import _main
class Main ( object ) :
    def __init__ ( self ) :
        sc = _main ( )
        n = sc.__next__ ( )
        s = [ ]
        while n != 0 :
            amari = 1 if n % - 2 < 0 else n % 2
            s.append ( amari )
            n -= amari
            n /= - 2
        s.reverse ( )
        print ( ''.join ( s ) or 0 )
