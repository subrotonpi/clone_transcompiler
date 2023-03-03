def import sys
class Main ( object ) :
    def __init__ ( self ) :
        sc = sys.stdin
        n = sc.readline ( ).strip ( )
        a = [ sc.readline ( ).strip ( ) for i in range ( n ) ]
        a.sort ( )
        print ( str ( a [ n - 1 ] ) , end = ' ' )
        ans = a [ n - 2 ]
        if a [ n - 1 ] % 2 == 0 :
            target = a [ n - 1 ] // 2
            for i in range ( n - 3 , - 1 , - 1 ) :
                if abs ( target - a [ i ] ) < abs ( target - ans ) :
                    ans = a [ i ]
        else :
            t1 = a [ n - 1 ] // 2
            t2 = a [ n - 1 ] // 2 + 1
            for i in range ( n - 3 , - 1 , - 1 ) :
                old = min ( abs ( ans - t1 ) , abs ( ans - t2 ) )
                cur = min ( abs ( a [ i ] - t1 ) , abs ( a [ i ] - t2 ) )
                if cur < old :
                    ans = a [ i ]
        print ( ans , end = ' ' )
