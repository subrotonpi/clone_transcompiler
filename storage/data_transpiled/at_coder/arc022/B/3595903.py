def _import ( ) :
    import sys
    import random
    import sys
    class Main ( object ) :
        def __init__ ( self ) :
            self.n = n
        def read ( self ) :
            sc = open ( self.n )
            self.n = sc.n
            A = [ ]
            for i in range ( self.n ) :
                A.append ( sc.read ( ) )
            ans = helper ( A )
            print ( ans )
        def helper ( a ) :
            vis = set ( )
            left , right = 0 , 0
            ans = 0
            while left < self.n :
                while right < self.n and a [ right ] not in vis :
                    vis.add ( a [ right ] )
                    right += 1
                if right == self.n :
                    ans = max ( ans , right - left )
                    return ans
                ans = max ( ans , right - left )
                while left < self.n and a [ left ] != a [ right ] :
                    vis.discard ( a [ left ] )
                    left += 1
                vis.discard ( a [ left ] )
            return ans
    return Main ( )
