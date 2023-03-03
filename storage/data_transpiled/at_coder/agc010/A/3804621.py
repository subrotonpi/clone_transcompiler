def import import sys
class Main ( object ) :
    def __init__ ( self ) :
        sc = sys.stdin
        N = sc.readline ( ).strip ( )
        A = [ sc.readline ( ).strip ( ) for i in range ( N ) ]
        sum = 0
        for i in A :
            sum += i
        if sum % 2 == 0 :
            print ( "YES" )
        else :
            print ( "NO" )
