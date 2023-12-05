def import import sys
class Main ( object ) :
    def __init__ ( self ) :
        sc = sys.stdin
        N = sc.readline ( ).strip ( )
        A = [ sc.readline ( ).strip ( ) for i in range ( N ) ]
        ret = 0
        if A [ 0 ] > 0 :
            print ( - 1 )
            return
        prev_A = 0
        for i in range ( 1 , N ) :
            if A [ i ] > prev_A + 1 :
                print ( - 1 )
                return
            elif A [ i ] == prev_A + 1 :
                ret += 1
            else :
                ret += A [ i ]
            prev_A = A [ i ]
        print ( ret )
