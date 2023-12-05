def import select , choice , eval , time ) :
    from os import urandom
    import random
    class Main2 ( object ) :
        def __init__ ( self ) :
            super ( Main2 , self ).__init__ ( )
            self.x = [ ]
            self.m = 0
            self.i = 0
            self.x.append ( v )
            self.i /= 2
            while self.i >= 1 :
                self.x.append ( self.x [ 2 * i ] + self.x [ 2 * i + 1 ] )
                self.i /= 2
        def readline ( self ) :
            while self.x is None or not self.x.readline ( ) :
                try :
                    self.x = [ ]
                except :
                    eof = True
                    return "0"
            return self.x.pop ( )
        def randint ( self , n ) :
            return int ( self.x [ n ] )
        def randint ( self , n ) :
            return long ( self.x [ n ] )
        def solve ( self ) :
            N = randint ( 1 , N )
            for tn in range ( 1 , N + 1 ) :
                k = randint ( 1 , N )
                a = [ ]
                T = random.choice ( [ k ] )
                p = 0
                s = k
                for i in range ( k ) :
                    p = ( p + i ) % s
                    tp = T [ p ]
                    a.append ( i )
                    T [ tp ] = 0
                    s -= 1
                print ( "Case #%d: " % tn , end = " " )
                n = randint ( 1 , N )
                for i in range ( n ) :
                    print ( ( a [ randint ( 1 , N - 1 ) ] + 1 ) , end = " " )
                print ( )
    class Tree ( object ) :
        def __init__ ( self , n ) :
            self.m = 1
            while self.n :
                self.m *= 2
            x = [ 1 ]
            for i in range ( m , self.n ) :
                x [ i ] = 1
            for i in range ( self.m - 1 , - 1 , - 1 ) :
                x [ i ] = 2 * i