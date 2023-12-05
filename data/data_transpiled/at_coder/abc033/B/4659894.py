def import sys
class Main ( object ) :
    def __init__ ( self ) :
        sc = sys.stdin
        N = sc.readline ( ).strip ( )
        machi = ""
        sum = 0
        max = 0
        for s in sc.readlines ( ) :
            x = sc.readline ( ).strip ( )
            if max < x :
                max = x
                machi = s
            sum += x
        if max > sum / 2 :
            print ( machi )
        else :
            print ( "atcoder" )
