def import _main
class Main ( object ) :
    def __init__ ( self ) :
        sc = _main ( )
        s = sc.read ( )
        map = s.split ( '+' )
        ans = 0
        for sub in map :
            if len ( sub.rstrip ( '0' ) ) == len ( sub ) :
                ans += 1
        print ( ans )
