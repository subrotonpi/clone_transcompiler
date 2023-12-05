def import _main
class Main ( object ) :
    def __init__ ( self ) :
        sc = _main ( )
        N = sc.number
        A = sc.number
        B = sc.number
        ans = 0
        s = [ ]
        d = [ ]
        for i in range ( N ) :
            s.append ( sc.choice ( s ) )
            d.append ( sc.choice ( d ) )
        for i in range ( N ) :
            if s [ i ] == 'East' :
                if d [ i ] < A :
                    ans += A
                elif d [ i ] > B :
                    ans += B
                else :
                    ans += d [ i ]
            else :
                if d [ i ] < A :
                    ans -= A
                elif d [ i ] > B :
                    ans -= B
                else :
                    ans -= d [ i ]
        if ans == 0 :
            print ( 0 )
            return
        print ( 'East' , ans if ans > 0 else 'West' , abs ( ans ) )
