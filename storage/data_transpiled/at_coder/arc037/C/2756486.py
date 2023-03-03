def _import ( ) : return int ( next ( ) )
def _import ( ) : return long ( next ( ) )
def _import ( ) : return float ( next ( ) )
def _import ( ) : return float ( next ( ) )
def _import ( ) : return float ( next ( ) )
def _import ( ) : return _import ( )
def _main ( ) :
    def count ( val , arr = None ) :
        ret = 0
        n , a = len ( arr [ 0 ] ) , arr [ 1 ]
        for cur in arr :
            need = val // cur
            if val % cur == 0 :
                need -= 1
            lo , hi = 0 , n - 1
            ans = - 1
            while lo <= hi :
                mid = lo + ( hi - lo ) // 2
                if a [ mid ] <= need :
                    ans = mid
                    lo = mid + 1
                else :
                    hi = mid - 1
            ret += ans
        return ret
    def _import ( ) :
        sc = sys.stdin
        n , k = sc.regs [ 0 ]
        arr = [ ]
        top = 0
        for i in range ( n ) :
            arr [ 0 ].append ( sc.regs [ i ] )
            top = max ( top , arr [ 0 ] [ i ] )
        for i in range ( n ) :
            arr [ 1 ].append ( sc.regs [ i ] )
            top = max ( top , arr [ 1 ] [ i ] )
        arr = sorted ( arr )
        max_value = 1 * top ** 2
        lo , hi = 0 , max_value
        ans = 0
        while lo <= hi :
            mid = lo + ( hi - lo ) // 2
            if _count ( mid , arr ) <= k - 1 :
                lo = mid + 1
                ans = mid
            else :
                hi = mid - 1
        print ( ans )
    return _import ( )
