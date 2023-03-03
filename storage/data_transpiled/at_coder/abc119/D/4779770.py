def _import ( ) : return sys.maxsize
class Main ( object ) :
    def find_less_index ( arr , val ) :
        lo , hi = 0 , len ( arr )
        while lo < hi - 1 :
            mid = ( lo + hi ) >> 1
            if arr [ mid ] <= val :
                lo = mid
            else :
                hi = mid
        return lo
    def solve ( sc , f ) :
        A , B , Q = sc.regs [ : 2 ]
        s = [ sc.regs [ 0 ] for i in range ( A + 2 ) ]
        t = [ sc.regs [ 1 ] for i in range ( B + 2 ) ]
        s [ 0 ] = t [ 0 ] = int ( s [ 0 ] / 10 )
        s [ A + 1 ] = t [ B + 1 ] = int ( t [ 1 ] / 10 )
        for i in range ( Q ) :
            x = sc.regs [ i ]
            si , ti = find_less_index ( s , x )
            s_low , s_high = s [ si ] , s [ si + 1 ]
            t_low , t_high = t [ ti ] , t [ ti + 1 ]
            v1 = max ( s_high , t_high ) - x
            v2 = max ( x - s_low , x - t_low )
            v3 = - s_low + t_high + min ( x - s_low , t_high - x )
            v4 = - t_low + s_high + min ( x - t_low , s_high - x )
            v = min ( min ( v1 , v2 ) , min ( v3 , v4 ) )
            f.write ( v )
        return None
    TIME_START , TIME_END = time.time ( )
    def main ( ) :
        sc = sys.stdin
        f = sys.stdout
        runtime = Runtime ( )
        runtime.total_memory = runtime.total_memory - runtime.freeMemory
        f.write ( "%d" % ( time.time ( ) - runtime.total_memory ) )
        return None
