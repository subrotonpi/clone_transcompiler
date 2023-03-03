def import sys
class Main ( object ) :
    def __init__ ( self ) :
        sc = sys.stdin
        how_b = sc.readline ( )
        blue = [ sc.readline ( ) for i in range ( how_b ) ]
        how_r = sc.readline ( )
        red = [ sc.readline ( ) for i in range ( how_r ) ]
        ans = 0
        for blue in blue :
            get_money = 0
            for i in range ( len ( blue ) ) :
                if blue [ i ] == blue [ i ] :
                    get_money += 1
            for red in red :
                if blue [ i ] == red [ i ] :
                    get_money -= 1
            if ans < get_money :
                ans = get_money
        sys.stdout.write ( ans )
