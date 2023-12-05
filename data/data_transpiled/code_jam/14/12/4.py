def main ( * orange ) :
    import sys
    import random
    class B ( object ) :
        def __init__ ( self ) :
            self.N = 0
        def __init__ ( self ) :
            self.N = 0
        def __init__ ( self ) :
            self.N = 0
        def __init__ ( self , * orange ) :
            self.N = 0
        def __init__ ( self , * orange ) :
            self.N = 0
            self.g = ( [ ] , [ ] )
            for i in range ( self.N ) :
                g.append ( [ ] )
            for start , end in self.N - 1 :
                g [ start ].append ( end )
                g [ end ].append ( start )
            self.ans = self.N - 1
            for i in range ( self.N ) :
                m = solve ( i , - 1 ) [ 0 ]
                if m < self.ans :
                    self.ans = m
            print ( "Case #%d: %d\n" % ( self.n + 1 , self.ans ) )
    def solve ( self , v , p ) :
        subs = [ ]
        for child in self.g [ v ] :
            if child != p :
                subs.append ( solve ( child , v ) )
        if len ( subs ) == 0 :
            return [ 0 , 1 ]
        elif len ( subs ) == 1 :
            return [ subs [ 0 ] [ 1 ] , subs [ 0 ] [ 1 ] + 1 ]
        else :
            subs = [ ]
            for subs in subs :
                subs.append ( subs [ 0 ] [ 1 ] )
            diffs = [ subs [ 0 ] [ 1 ] - subs [ 1 ] [ 0 ] ]
            diffs.sort ( )
            return [ self.N + diffs [ 0 ] + diffs [ 1 ] , self.N + 1 ]
    B.__init__ ( * orange )
    B.solve ( * orange )
