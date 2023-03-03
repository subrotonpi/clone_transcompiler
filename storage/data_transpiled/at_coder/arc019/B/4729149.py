def _import ( ) :
    import sys
    import os
    import sys
    import __builtin__
    import __builtin__
    import __builtin__
    import __builtin__
    class Main ( object ) :
        def __init__ ( self ) :
            if self.left >= self.right :
                return
            p = self.left , self.right
            l , r = self.left , self.right
            tmp , tmp2 = self.left , self.right
            while self.left <= p :
                l += 1
            while self.right <= r :
                r -= 1
            if self.left <= r :
                tmp = self.left
                self.right = self.right
                self.left = l
                self.right = r
        def __repr__ ( self ) :
            return "%s %s" % ( self.left , self.right )
    def quick_sort ( self , left , right ) :
        if left >= self.right :
            return
        p = self.left
        l , r = self.right
        while l <= r :
            l += 1
        while self.left > p :
            r -= 1
        if l <= r :
            tmp = self.left
            self.left = self.right
            self.right = self.left
            self.left = l
            self.right = r
    quick_sort ( self , left , right )
