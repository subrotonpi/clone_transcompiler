def import math
class Main ( object ) :
    def __init__ ( self ) :
        sc = sys.stdin
        y = sc.readline ( ).strip ( )
        m = sc.readline ( ).strip ( )
        d = sc.readline ( ).strip ( )
        if m == 1 :
            m = 13
        elif m == 2 :
            m = 14
        A = self.distance ( y , m , d )
        B = self.distance ( 2014 , 5 , 17 )
        print ( int ( B - A ) )
    def distance ( y , m , d ) :
        if y == 1 and m == 13 and d == 1 :
            return 0
        if m == 14 or m == 13 :
            y -= 1
            if m == 14 and d == 29 and y % 400 == 0 or y % 4 == 0 :
                d -= 1
        return 365 * y + math.floor ( y / 4 ) - math.floor ( y / 100 ) + math.floor ( y / 400 ) + math.floor ( 306 * ( m + 1 ) / 10 ) + d - 429
