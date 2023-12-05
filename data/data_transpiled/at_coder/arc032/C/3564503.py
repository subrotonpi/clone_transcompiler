def _ _ main _ _ ( j1 , j2 ) :
    import sys
    import random
    import time
    import string
    import tokenize
    class Main ( object ) :
        def __init__ ( self , j1 ) :
            self.N = int ( j1 )
            self.A = [ ]
            self.B = [ ]
            for i in range ( N ) :
                self.A.append ( next ( iter ( self.A ) ) )
            self.B.append ( next ( iter ( self.B ) ) )
        def __next__ ( self ) :
            return int ( next ( iter ( self.A ) ) )
        def __next__ ( self ) :
            return next ( iter ( self.B ) )
    def __next__ ( self ) :
        return int ( next ( iter ( self.A ) ) )
    def __next__ ( self ) :
        return int ( next ( iter ( self.B ) ) )
    def __next__ ( self ) :
        return int ( next ( iter ( self.A ) ) )
    def __next__ ( self ) :
        return int ( next ( iter ( self.B ) ) )
    def solve ( self ) :
        JA = [ ]
        JB = [ ]
        for i in range ( N ) :
            j = Job ( i + 1 , A [ i ] , B [ i ] )
            JA.append ( j )
            JB.append ( j )
        JA.sort ( key = lambda j : j.a )
        JB.sort ( key = lambda j : j.b )
        best = None
        ai = N - 1
        bi = N - 1
        for t in range ( int ( 1e6 ) , - 1 , - 1 ) :
            while ai >= 0 and JA [ ai ].a == t :
                if best is not None :
                    best = best ( JA [ ai ] , best )
                else :
                    best = JA [ ai ]
                ai -= 1
            while bi >= 0 and JB [ bi ].b == t :
                if best is not None :
                    JB [ bi ].score = best.score + 1
                    JB [ bi ].next = best
                else :
                    JB [ bi ].score = 1
                    