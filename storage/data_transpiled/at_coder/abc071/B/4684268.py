def import _main
class Main ( object ) :
    def __init__ ( self ) :
        sc = _main ( )
        set = set ( )
        str = sc.next ( )
        for c in str :
            set.add ( c )
    for i in range ( 26 ) :
        if chr ( 'a' + i ) not in set :
            print ( chr ( 'a' + i ) )
            return
    print ( 'None' )
