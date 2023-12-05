def import _main
class Main ( object ) :
    def __init__ ( self ) :
        sc = _main ( )
        n = sc.count ( )
        lists = [ [ ] for i in range ( 1 , n + 1 ) ]
        for i in range ( 2 , n + 1 ) :
            x = sc.next ( )
            lists [ x ].append ( i )
        print ( _income ( 1 ) )
    def _income ( idx ) :
        if len ( lists ) == 0 :
            return 1
        max = 0
        min = sys.maxint
