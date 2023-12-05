def import sys
class Main ( object ) :
    def __init__ ( self ) :
        sc = sys.stdin
        N = sc.readline ( ).strip ( )
        s = [ sc.readline ( ).strip ( ) for i in range ( N ) ]
        M = sc.readline ( ).strip ( )
        t = [ sc.readline ( ).strip ( ) for i in range ( M ) ]
        max_money = sys.maxint
        for i in range ( N ) :
            count_blue = 0
            count_red = 0
            for j in range ( N ) :
                if s [ i ] == s [ j ] : count_blue += 1
            for j in range ( M ) :
                if s [ i ] == t [ j ] : count_red += 1
            if max_money < count_blue - count_red :
                max_money = count_blue - count_red
        print ( max_money if max_money else 0 )
