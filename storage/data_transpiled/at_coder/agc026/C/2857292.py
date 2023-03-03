def import import sys
class Main ( object ) :
    def __init__ ( self ) :
        self.n = int ( sys.stdin.readline ( ) )
        s = sys.stdin.readline ( )
        h = { }
        for i in range ( 1 << n ) :
            red = ""
            blue = ""
            for j in range ( n ) :
                if i & ( 1 << j ) :
                    red += s [ j ]
                else :
                    blue += s [ j ]
            key = red + ":" + blue
            tmp = h.get ( key , 0 )
            h [ key ] = tmp + 1
    ans = 0
    for i in range ( 1 << n ) :
        red = ""
        blue = ""
        for j in range ( n ) :
            if i & ( 1 << j ) :
                red += s [ 2 * n - 1 - j ]
            else :
                blue += s [ 2 * n - 1 - j ]
        key = red + ":" + blue
        tmp = h.get ( key , 0 )
        ans += tmp
    print ( ans )
