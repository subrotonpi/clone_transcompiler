def _import ( ) :
    import time
    import sys
    class Main ( object ) :
        def __init__ ( self , depth ) :
            self.depth = depth
        def add ( self , * s ) :
            if self.depth == len ( s ) :
                return
            v = s [ self.depth ] - '0'
            if self.child [ v ] is None :
                self.child [ v ] = Node ( self.depth + 1 )
            self.child [ v ].add ( s )
        def solve ( self ) :
            n = self.ni ( )
            l = self.nl ( )
            root = Node ( 0 )
            for i in range ( n ) :
                s = self.ns ( )
                root.add ( s )
            self.dfs ( root , l )
            x = 0
            for y in self.list :
                x ^= y
            if x == 0 :
                print ( "Bob" )
            else :
                print ( "Alice" )
    def list ( self ) :
        self.list = [ ]
    def dfs ( self , l ) :
        if self.child [ 0 ] is None and self.child [ 1 ] is None :
            return
        if self.child [ 0 ] is None or self.child [ 1 ] is None :
            v = l - self.depth
            g = 1
            while v % 2 == 0 :
                g <<= 1
                v /= 2
            self.list.append ( g )
        if self.child [ 0 ] is not None :
            dfs ( self.child [ 0 ] , l )
        if self.child [ 1 ] is not None :
            dfs ( self.child [ 1 ] , l )
    def main ( self ) :
        start = time.time ( )
        debug = self.debug if self.debug else None
        if debug :
            with open ( self.debug , 'r' ) as f :
                f.write ( f.read ( ) )
    sys.stdout = sys.__stdout__
