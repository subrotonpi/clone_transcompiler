def _import ( ) :
    import sys
    import os
    import sys
    import threading
    class A ( object ) :
        def __init__ ( self ) :
            self.hei , self.wid = 0 , 0
        def __init__ ( self ) :
            self.hei = self.hei
            self.wid = self.wid
        def execute ( self ) :
            self.hei = self.hei
            self.wid = self.wid
            self.c = self.c
            self.dx = self.h
            self.dy = self.h
            self.dirs = 'v>^<'
        def solve ( self ) :
            ans = 0
            for i in self.hei :
                for j in self.wid :
                    if self.c [ i ] [ j ] == '.' :
                        continue
                    ok = 0
                    for d in self.hei :
                        ii = i
                        jj = j
                        for _ in self.dx :
                            ii += self.dx [ d ]
                            jj += self.dy [ d ]
                            if ii < 0 or ii >= self.hei or jj < 0 or jj >= self.wid :
                                break
                            if self.c [ ii ] [ jj ] == '.' :
                                continue
                            ok |= 1 << d
                            break
                    d = self.dirs.index ( self.c [ i ] [ j ] )
                    if ( ok & ( 1 << d ) ) :
                        continue
                    if ok == 0 :
                        return 'IMPOSSIBLE'
                    ans += 1
            return '%d' % ans
        def run ( self ) :
            self.hei = self.hei
            self.wid = self.wid
            self.c = [ self.c [ i ] [ j ] for i in self.hei ]
    class A ( object ) :
        def __init__ ( self ) :
            self.hei = self.hei
            self.wid = self.wid
            self.c = self.c
        def run ( self ) :
            self.run ( )
    class A ( object ) :
        def run ( self ) :
            self.hei = self.hei
            self.wid = self.wid
