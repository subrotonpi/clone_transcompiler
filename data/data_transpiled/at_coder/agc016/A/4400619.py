def _import ( ) :
    import sys
    import random
    import string
    from math import sin , cos
    class Main ( object ) :
        def __init__ ( self , * args , ** kwargs ) :
            Scanner ( ).__init__ ( self )
            s = sc.next ( )
            ans = len ( s )
            for i in [ 'a' , 'z' ] :
                ans = min ( ans , solve ( s , i , 0 ) )
            out ( ans )
        def d ( s ) :
            c = 0
            for i in range ( len ( s ) - 1 ) :
                if s [ i ] != s [ i + 1 ] :
                    c += 1
                    break
            return c == 0
        def solve ( s , c , ans ) :
            if d ( s ) :
                return ans
            else :
                return solve ( DaikuStr ( s , c ) , c , ans + 1 )
        def DaikuStr ( s , c ) :
            t = ""
            for i in range ( len ( s ) - 1 ) :
                t += s [ i + 1 ] == c
            return t
    return Main
