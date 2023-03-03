def _import ( ) :
    import math
    import os
    import os
    import os
    import os
    import math
    class B :
        def p ( self , * args ) :
            print ( " ".join ( map ( str , args ) ) )
        def main ( self ) :
            with open ( os.devnull , 'r' ) as f :
                self.N = int ( f.read ( ) )
    class P :
        def __init__ ( self , x , y ) :
            self.x = x
            self.y = y
    class B ( B ) :
        def __init__ ( self , x , y ) :
            self.x = x
            self.y = y
    class P ( B ) :
        def __init__ ( self , x , y ) :
            self.x = x
            self.y = y
    def go ( self , at ) :
        self.at = at
        self.order = [ ]
        self.used = [ True ]
        self.order.append ( 0 )
        go ( 1 , order , self.used )
        print ( "Case #%d: " % self.zz )
        for o in self.best_order :
            print ( o , end = ' ' )
        print ( )
    def score ( self ) :
        if at == self.N :
            self.score ( self.order )
            return
        for i in range ( self.N ) :
            if self.used [ i ] :
                continue
            self.used [ i ] = True
            self.order [ at ] = i
            go ( at + 1 , order , self.used )
            self.used [ i ] = False
    def score ( self ) :
        for i in range ( self.N ) :
            for a , b , c , d in self.order :
                if self.intersect ( P [ a ] , P [ b ] , P [ c ] , P [ d ] ) :
                    return
        area = 0.0
        for a , b , c , d in self.order :
            area += self.area * ( a - b )
    return B
