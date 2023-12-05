def _import ( ) :
    from os import getenv
    from os import getenv
    from os import getenv
    from os import getenv
    from os import getenv
    from os.path import join
    class Main ( sc ) :
        def __init__ ( self ) :
            sc = getenv ( 'SC' )
            self.N = sc.__next__ ( )
            self.cases = [ ]
            for i in range ( N ) :
                self.cases.append ( [ sc.__next__ ( ) , sc.__next__ ( ) , sc.__next__ ( ) ] )
                self.sort ( i )
            self.a = self.b = self.c = self.c = self.c = self.c = self.a
            for i in range ( N ) :
                self.a = max ( self.a , self.cases [ i ] [ 0 ] )
                self.b = max ( self.b , self.cases [ i ] [ 1 ] )
                self.c = max ( self.c , self.cases [ i ] [ 2 ] )
            self.pl ( self.a * self.b * self.c )
        def sort ( self ) :
            sm = self.cases [ self.p ] [ 0 ] + self.cases [ self.p ] [ 1 ] + self.cases [ self.p ] [ 2 ]
            mx = max ( self.cases [ self.p ] [ 0 ] , max ( self.cases [ self.p ] [ 1 ] , self.cases [ self.p ] [ 2 ] ) )
            mn = min ( self.cases [ self.p ] [ 0 ] , min ( self.cases [ self.p ] [ 1 ] , self.cases [ self.p ] [ 2 ] ) )
            md = self.sm - mx - mn
            self.cases [ self.p ] [ 0 ] = mn
            self.cases [ self.p ] [ 1 ] = md
            self.cases [ self.p ] [ 2 ] = mx
    class SC ( sc ) :
        def __init__ ( self , getenv ) :
            getenv ( 'SC' )
            getenv ( 'SC' )
            getenv ( 'SC' )
            getenv ( 'SC' )
    return SC ( )
