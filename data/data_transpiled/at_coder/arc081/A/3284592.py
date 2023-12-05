def import import sys
class Main ( object ) :
    def __init__ ( self ) :
        sc = sys.stdin
        n = sc.readline ( ).strip ( )
        a = [ sc.readline ( ).strip ( ) for i in range ( n ) ]
        sc.close ( )
        a = sorted ( a )
        ans = None
        x = None
        for i in range ( n - 1 ) :
            mi = n - i - 1
            if a [ mi ] == a [ mi - 1 ] :
                if x is None :
                    x = a [ mi ]
                    i += 1
                else :
                    ans = x * a [ mi ]
                    break
        print ( ans )
