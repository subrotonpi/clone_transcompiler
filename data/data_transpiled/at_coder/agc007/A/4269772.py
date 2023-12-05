def import _main
class Main ( object ) :
    def __init__ ( self ) :
        sc = _main ( )
        h , w = sc.split ( '.' )
        ans = 0
        for line in sc :
            ans += len ( line.replace ( '.' , '' ) )
        print ( 'Possible' if ans == h + w - 1 else 'Impossible' )
