def import sys
class Main ( object ) :
    def __init__ ( self ) :
        self.n = sys.stdin.read ( )
        self.m = sys.stdin.read ( )
        check = False
        for z in range ( 0 , m // 4 ) :
            if check :
                break
            y = m - 2 * n - 2 * z
            if y >= 0 :
                x = n - y - z
                if x >= 0 :
                    check = True
                    print ( x , y , z )
        if not check :
            print ( '-1 -1 -1' )
