def import _main
class Main ( object ) :
    def __init__ ( self ) :
        sc = _main ( )
        n = sc.__next__ ( )
        m = sc.__next__ ( )
        lists = [ [ ] for i in range ( 1 , n + 1 ) ]
        a = [ sc.__next__ ( ) for i in range ( m ) ]
        b = [ sc.__next__ ( ) for i in range ( m ) ]
        lists [ a [ i ] ].append ( b [ i ] )
        lists [ b [ i ] ].append ( a [ i ] )
        count = 0
        for i in range ( m ) :
            test = [ False ] * ( n + 1 )
            search ( 1 , a [ i ] , b [ i ] , test )
            if not is_all_true ( test ) :
                count += 1
        print ( count , end = '' )
