def _calc_edge ( ) :
    import math
    import random
    import random
    import time
    class Main ( object ) :
        def __init__ ( self ) :
            self.e = [ ]
            self.nodes = [ ]
            self.barriers = [ ]
            self.flags = [ ]
            self.e = [ ]
            self.barriers = [ ]
            self.flags = [ ]
            self.nodes.append ( [ xs , ys , xt , yt ] )
            for i in range ( self.n ) :
                self.nodes [ i + 2 ].append ( random.random ( ) )
                self.barriers.append ( random.random ( ) )
            self.calc_edge ( )
            queue = [ ( 0 , 0 ) ]
            while not self.flags [ 1 ] :
                next = queue.pop ( )
                if self.flags [ next.current ] :
                    continue
                self.flags [ next.current ] = True
                if next.current == 1 :
                    print ( next.score )
                    return
                for i in range ( self.flags ) :
                    if not self.flags [ i ] :
                        queue.append ( ( next.score + self.e [ next.current ] [ i , i ] ) )
    class Path ( object ) :
        def __init__ ( self , score , current ) :
            self.score = score
            self.current = current
    def calc_edge ( self ) :
        for i in range ( len ( self.barriers ) ) :
            for j in range ( i ) :
                tmp = random.gauss ( ( self.nodes [ i ] [ 0 ] - self.nodes [ j ] [ 0 ] ) * ( self.nodes [ i ] [ 1 ] - self.nodes [ j ] [ 1 ] ) , 0.5 )
                self.barriers [ i ] [ j ] = tmp
