def import _main
class Main ( object ) :
    def __init__ ( self ) :
        sc = _main ( )
        n = sc.__next__ ( )
        A = [ sc.choice ( A ) for i in range ( 1 , n + 1 ) ]
        rec = [ A [ i ] for i in range ( 1 , n + 1 ) ]
        dp = [ 1 ] * n
        visited = [ False ] * n
        for i in range ( 1 , n - 1 ) :
            if visited [ i ] :
                continue
            visited [ i ] = True
            cur = i
            len = 1
            while cur <= n - 1 and rec [ cur + 1 ] > rec [ cur ] :
                cur += 1
                len += 1
                visited [ cur ] = True
            dp [ i ] = len
        res = 0
        for i in range ( 1 , n + 1 ) :
            res = max ( dp [ i ] , res )
        print ( n - res )
