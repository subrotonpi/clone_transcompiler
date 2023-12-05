def _import ( ) :
    import sys
    import os
    import sys
    import struct
    class Main ( object ) :
        class Pair :
            def __init__ ( self , a , b ) :
                self.a = a
                self.b = b
            def large ( self , n ) :
                if self.a == self.b :
                    if self.a < self.b :
                        return True
                    if self.a > self.b :
                        return False
                else :
                    return self.a > self.b
            def write ( self , b ) :
                if self.b < 0 or b <= '9' :
                    raise ValueError ( )
                while True :
                    if self.a == self.b :
                        self.a *= 10
                        self.b = self.b
        def next_int2 ( self ) :
            return int ( self.a )
        def small ( self ) :
            if self.a == self.b :
                if self.a > self.b :
                    return True
                if self.a < self.b :
                    return False
                return self.a > self.b
            if self.a - self.b >= 0 :
                return True
            return self.a < self.a
    def quicksort ( self , st , ed ) :
        if st >= ed :
            return
        l = st
        r = ed
        mid = self.a [ ( l + r ) / 2 ]
        while l <= r :
            while l <= ed and self.a [ l ].small ( mid ) :
                l += 1
            while r >= st and self.a [ r ].large ( mid ) :
                r -= 1
            if l <= r :
                temp = self.a [ l ]
                self.a [ l ] = self.a [ r ]
                self.a [ r ] = temp
                l += 1
                r -= 1
        if st < r :
            quicksort ( self , st , r )
        if l < ed :
            quicksort ( self , l , ed )
