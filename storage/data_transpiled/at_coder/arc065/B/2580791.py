def import import _sys , root , tree , data , root , p , * args , ** kwargs ) :
    from os import urandom
    import random
    import sys
    class Main ( object ) :
        def __init__ ( self , sc ) :
            self.n = int ( sc.n )
            self.k = int ( sc.k )
            self.l = int ( sc.l )
            self.road = [ ]
            self.init ( n , road )
            for i in range ( self.k ) :
                self.link ( sc.n , sc.n , road )
            self.train = [ ]
            self.init ( n , train )
            for i in range ( self.l ) :
                self.link ( sc.n , sc.n , train )
            self.keys = [ ]
            data = { }
            for i in range ( self.n ) :
                keys.append ( "%s,%s" % ( root ( road [ i ] , road ) , root ( train [ i ] , train ) ) )
                data.compute ( keys [ i ] , lambda key , value : 1 if value is None else ( value + 1 ) )
            print ( " ".join ( [ str ( tgt ) for tgt in data ] ) )
        def __init__ ( self , n , data ) :
            for i in range ( self.n ) :
                data [ i ] = i + 1
        def link ( self , x , y , data ) :
            data [ root ( x , data ) - 1 ] = root ( y , data )
        def isSame ( self , x , y , data ) :
            return root ( x , data ) == root ( y , data )
        def root ( self , p , data ) :
            return ( data [ p - 1 ] , p )
    return Main
