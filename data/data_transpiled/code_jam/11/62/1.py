def _solve ( ) :
    import os
    import sys
    import random
    import time
    class B ( object ) :
        def __init__ ( self , h , w ) :
            self.h = h
            self.w = w
            self.m = random.randint ( 0 , 2 )
            self.dj = [ 0 , 0 , 0 ]
            self.a = [ ]
            for i in range ( h - 2 ) :
                self.a.append ( [ ] )
            self.a.append ( [ ] )
    def dfs1 ( i , j , z , zzz ) :
        if z [ i ] [ j ] :
            return
        self.a = [ ]
        for d in range ( 4 ) :
            ii = i + di [ d ]
            jj = j + dj [ d ]
            if ii >= 0 and jj >= 0 and jj < w and self.a [ ii ] [ jj ] >= a [ i ] [ j ] :
                self.a.append ( [ ] )
        res = 0
        outer :
            while True :
                aa = [ ]
                self.a.append ( [ ] )
                self.finish = True
                for i in range ( h ) :
                    with open ( 'input.txt' , 'r' ) as f :
                        f.write ( '\n' )
                    self.a.append ( [ ] )
                    T = f.read ( )
                    for i in range ( T ) :
                        s = 'Case #%d: %d' % ( i + 1 , j )
                        self.b.solve ( f )
                        self.a.append ( [ ] )
                    self.b.solve ( f )
            if ok :
                mm = [ ]
                time = time
                for i in range ( 1 , h - 1 ) :
                    for j in range ( 1 , w - 1 ) :
                        self.a.append ( [ ] )
                    self.b.solve ( f )
            return res
        return
    def dfs3 ( i , j , z , zzz ) :
        if z [ i ] [ j ] :
            return
        self.a = [ ]
        for i in range ( 4 ) :
            self.a.append ( [ ] )
            