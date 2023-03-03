def import _main
class Main ( object ) :
    def __init__ ( self ) :
        sc = _main ( )
        n = sc.get_int ( )
        k = sc.get_int ( )
        rates = [ sc.get_rate ( ) for _ in range ( n ) ]
        rates = [ rates [ i ] for i in range ( n - k , n ) ]
        watch_rates = rates [ n - k : ]
        init_rate = 0
        for i in range ( len ( watch_rates ) ) :
            init_rate = ( init_rate + watch_rates [ i ] ) / 2
        print ( init_rate )
