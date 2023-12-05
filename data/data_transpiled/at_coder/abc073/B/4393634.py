def _import ( * argv ) :
    from math import fabs
    from math import min
    class Main ( object ) :
        def __init__ ( self , * argv ) :
            sc = sys.stdin
            n = sc.getmaxyx ( )
            ans = 0
            for i in range ( n ) :
                l = math ( n , i )
                ans += math ( n - l + 1 , i )
            print ( ans )
    return Main
