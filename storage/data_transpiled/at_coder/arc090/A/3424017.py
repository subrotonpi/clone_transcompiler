def import import sys
class Main ( object ) :
    def __init__ ( self ) :
        sc = sys.stdin
        n = sc.readline ( ).strip ( )
        a = [ sc.readline ( ).strip ( ) for i in range ( n ) ]
        b = [ sc.readline ( ).strip ( ) for i in range ( n ) ]
        suma = [ ]
        sumb = [ ]
        suma.append ( a [ 0 ] )
        sumb.append ( b [ n - 1 ] )
        for i in range ( 1 , n ) :
            suma.append ( suma [ i - 1 ] + a [ i ] )
            sumb.append ( sumb [ n - i ] + b [ n - i - 1 ] )
        ans = 0
        for i in range ( n ) :
            ans = max ( ans , suma [ i ] + sumb [ i ] )
        print ( ans )
