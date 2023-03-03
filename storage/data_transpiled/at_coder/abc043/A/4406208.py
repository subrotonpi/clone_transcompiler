def import import sys
class Main ( object ) :
    def __init__ ( self ) :
        sc = sys.stdin
        n = sc.readline ( ).strip ( )
        if n == 0 :
            add = 0
            for i in range ( 1 , n + 1 ) :
                add = add + i
            print ( add )
