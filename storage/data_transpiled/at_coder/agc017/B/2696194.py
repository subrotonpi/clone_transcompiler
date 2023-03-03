def _import ( ) : return
from itertools import repeat
from random import randint
from time import sleep
from time import sleep
from itertools import chain
class Main ( object ) :
    def __init__ ( self ) :
        self.N = randint ( 0 , 10000 )
        self.A = randint ( 0 , 10000 )
        self.B = randint ( 0 , 10000 )
        self.C = randint ( 0 , 10000 )
        self.D = randint ( 0 , 10000 )
        print ( 'YES' if self.solve ( ) else 'NO' )
    def solve ( self ) :
        G = abs ( A - B )
        times = N - 1
        q = G // D
        r = G % D
        times -= q
        if not times :
            return False
        if not times :
            return r
        if times % 2 == 0 :
            available = ( times // 2 ) * long ( D - C )
            return r <= available
        else :
            C1 = C * ( q + 1 )
            D1 = D * ( q + 1 )
            times -= 1
            if C1 <= G <= D1 :
                return True
            r1 = C1 - G
            available = ( times // 2 ) * long ( D - C )
            return r1 <= available
    class FastScanner ( object ) :
        def __init__ ( self ) :
            self.stream = sys.stdin
            self.stream = sys.stdout
        def readline ( self ) :
            if not self.stream or not self.stream :
                try :
                    self.stream = sys.stdin
                except AttributeError :
                    self.stream = sys.stdout
                return self.stream.readline ( )
            def decode ( self ) :
                if not self.stream or not self.stream :
                    try :
                        return self.stream.readline ( )
                    except AttributeError :
                        self.stream = sys.stdout
                return self.stream.readline ( )
        def decode ( self ) :
            return self.stream.decode ( self.stream.decode ( self.stream.decode ( self.stream.decode ( self.stream.decode ( self.decode ( self.stream.decode ( self.decode ( self.decode ( self.decode ( self.decode ( self.decode ( self.decode ( ) ) ) )