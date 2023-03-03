def _import ( ) :
    import math
    import os
    import os
    import os
    import os
    import os
    import math
    class Main ( object ) :
        def __init__ ( self ) :
            self.n = 0
            self.x = 0
            self.c = 0
            self.k = 0
            self.m = 0
            self.height = 0
            self.width = 0
            self.left = 0
            self.right = 0
            self.ans = 0
            self.s = ''
            self.anss = ''
            self.ansl = 0
            self.intAr = [ ]
            self.w = [ ]
            self.isvisited = [ ]
        def main ( self ) :
            sc.raw_input ( )
            self.n = 0
            self.x = sc.raw_input ( )
            intAr = [ ]
            for i in range ( self.n ) :
                tmp = sc.raw_input ( )
                intAr.append ( abs ( x - tmp ) )
            ans = intAr [ 0 ]
            for i in range ( 1 , self.n ) :
                ans = gcd_int ( ans , intAr [ i ] )
            print ( ans )
            sc.close ( )
        def gcd_int ( a , b ) :
            if a < b :
                tmpp = a
                a , b = b , tmpp
            if b == 0 :
                return a
            else :
                return gcd_int ( b , a % b )
        def gcd_long ( a , b ) :
            if a < b :
                tmpp = a
                a , b = b , tmpp
            if b == 0 :
                return a
            else :
                return gcd_long ( b , a % b )
        def lcm_int ( a , b ) :
            gcd = gcd_int ( a , b )
            return a / gcd * b
        def lcm_long ( a , b ) :
            gcd = gcd_long ( a , b )
            return a / gcd * b
        def dfs ( self ) :
            isvisited [ self.placenow ] = True
            success = True
            for i in range ( self.n ) :
                if isvisited [ i ] == False :