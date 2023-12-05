def _ import _ , sys , os , sys , code , compile , code , sys ) :
    import sys
    import os
    import sys
    import locale
    import tokenize
    import tokenize
    import random
    class A :
        def __init__ ( self ) :
            self.name = None
            self.prob = 1.0
        def readline ( self ) :
            return int ( self.name )
        def uniform ( self , size ) :
            self.name = name
            self.prob = 1.0
        def eval ( self ) :
            return eval ( self.name )
        def readline ( self ) :
            return eval ( self.name )
    def build ( ) :
        treet = tokenize.generate_tokens ( tokenize.generate_tokens ( ) )
        q = float ( treet [ 0 ] )
        s = treet [ 1 ]
        if s == ')' :
            return ( None , q )
        else :
            t = Tree ( s , q )
            t.l , t.r = build ( )
            treet.pop ( 0 )
            return t
    def test ( ) :
        l = randint ( 0 , l )
        sys.stderr.write ( l )
        s = ''
        for i in range ( l ) :
            s += read ( ) + ' '
        s = s.replace ( ')' , ' ) ' ).replace ( '(' , ' ( ' )
        sys.stderr.write ( s )
        treet = tokenize.generate_tokens ( s )
        root = build ( )
        a = randint ( 0 , a )
        for i in range ( a ) :
            next ( treet )
            n = randint ( 0 , n )
            ts = [ next ( treet ) for _ in range ( n ) ]
            prob = 1
            t = root
            while t.name :
                prob *= t.prob
                if t.name in ts :
                    t = t.l
                else :
                    t = t.r
            prob *= t.prob
            out.write ( '%.7f\n' % prob )
    def solve ( ) :
        n = randint ( 0 , n )
        for i in range ( n ) :
            out.write ( 'Case #%d:\n' %