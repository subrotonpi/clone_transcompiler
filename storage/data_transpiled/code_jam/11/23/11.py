def _import ( ) :
    from itertools import count , repeat
    from itertools import count , repeat
    class C ( object ) :
        def __init__ ( self ) :
            self.next = 0
        def next ( self ) :
            self.next = next ( self.next )
    n = len ( ng )
    def ok ( type , gs , color , cur ) :
        if cur == n :
            for s in gs :
                used = [ ]
                for j in range ( n ) :
                    if ( ( s >> j ) & 1 ) == 1 :
                        used.append ( i )
                    else :
                        if not used [ j ] :
                            return False
                for i in range ( n ) :
                    ans.append ( color [ i ] )
                return True
            for i in range ( type ) :
                color [ cur ] = i
                if ok ( type , gs , color , cur + 1 ) :
                    return True
            return False
    def run ( ) :
        with open ( "/proc/c" , "r" ) as f :
            T = f.read ( )
            for o in range ( 1 , T + 1 ) :
                n , m = next ( g )
                start = [ ]
                end = [ ]
                for i in range ( m ) :
                    start.append ( i )
                for j in range ( n ) :
                    end.append ( i )
                gs = [ ( 1 << n ) - 1 ]
                for i in range ( m ) :
                    target = ( 1 << start [ i ] ) + ( 1 << end [ i ] )
                    ng = [ ]
                    for j in range ( n ) :
                        s = gs [ j ]
                        if s & target == target :
                            a = target
                            b = target
                            small = min ( start [ i ] , end [ i ] )
                            big = max ( start [ i ] , end [ i ] )
                            for k in range ( n ) :
                                if ( s >> k ) & 1 :
                                    b |= 1 << k
                        ng.append ( a )
    return run
