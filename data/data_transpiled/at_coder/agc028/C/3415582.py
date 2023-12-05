def _import ( ) :
    from StringIO import StringIO
    from os import urandom
    from random import randint
    class Main ( object ) :
        def __init__ ( self ) :
            self.N = randint ( 1 , 10000 )
            self.A = [ ]
            self.B = [ ]
            for i in range ( N ) :
                self.A.append ( Node ( i , self.N , True ) )
                self.B.append ( Node ( i , self.N , False ) )
            print ( self.solve ( ) )
        def solve ( self ) :
            all = [ ]
            self.A = [ ]
            self.B = [ ]
            for i in range ( N ) :
                self.A.append ( Node ( i , self.N , False ) )
            return self.A
        def solve ( self ) :
            return [ ]
        def readline ( self ) :
            return readline ( self )
    def readline ( self ) :
        return int ( readline ( self ) )
    def next_slice ( self ) :
        return [ ]
    def next_slice ( self ) :
        return [ ]
    def next_slice ( self ) :
        return [ ]
    def select ( self , result ) :
        half = 0
        found = set ( )
        a = 0
        b = 0
        ab = 0
        for i in range ( N ) :
            node = all [ i ]
            half += node.n
            if node.a :
                a += 1
            else :
                b += 1
            if node.i in found :
                ab = 1
            else :
                found.add ( node.i )
        if a == 0 or b == 0 or ab :
            return half
        else :
            x1 = all [ - 1 ]
            y1 = all [ N ]
            if x1.i != y1.i :
                return half - x1.n + y1.n
            else :
                x2 = all [ - 2 ]
                y2 = all [ - 1 ]
                if y1.n - x2.n < y2.n - x1.n :
                    return half - x2.n + y1.n
                else :
                    return half - x1.n + y2.n
