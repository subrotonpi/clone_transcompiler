def import import sys
import string
import sys
class Main ( object ) :
    def __init__ ( self ) :
        self.n , self.k = 0 , 0
    def read ( self ) :
        with open ( self.n ) as f :
            self.k = f.read ( )
            self.n = f.read ( )
    def solve ( self ) :
        if self.k % 2 == 0 :
            s = [ " " * ( self.k / 2 ) ]
            for i in range ( 1 , self.n ) :
                s.append ( " " * ( self.k / 2 ) )
            print ( " ".join ( s ) )
            return
        ns = [ ]
        cnt = self.n / 2
        ns.append ( ( self.k + 1 ) / 2 )
        trg = self.n - 1
        for i in range ( cnt ) :
            while trg >= 0 and ns [ trg ] == 0 : trg -= 1
            if ns [ trg ] == 1 :
                ns [ trg ] = 0
            else :
                ns [ trg ] -= 1
                for j in range ( trg + 1 , self.n ) :
                    ns [ j ] = self.k
                    trg += 1
        s = [ " ".join ( s ).strip ( ) for s in ns ]
        print ( " ".join ( s ) )
