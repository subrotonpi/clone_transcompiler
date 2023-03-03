def _import ( ) : return _import ( )
from io import StringIO
from itertools import chain
from itertools import chain
from itertools import chain
from itertools import chain
from itertools import chain
from itertools import chain
from itertools import chain
class Main ( object ) :
    def __init__ ( self ) :
        self.N = len ( self.N )
        self.S1 = next ( self.N )
        self.S2 = next ( self.N )
        print ( self.solve ( ) )
    def __next__ ( self ) :
        return next ( self.N )
    def __eq__ ( self , other ) :
        if other.N == self.N :
            try :
                self.next ( other )
            except StopIteration :
                raise
        return self.next ( )
    def __next__ ( self ) :
        return next ( self.N )
    def __eq__ ( self , other ) :
        uf = chain ( chain ( range ( 26 + 10 ) , other ) )
        for c1 , c2 in zip ( self.S1 , other ) :
            uf.unite ( self.toIndex ( c1 ) , self.toIndex ( c2 ) )
        S = self.S1
        group = set ( )
        loop :
        for i in range ( N ) :
            c = S [ i ]
            if c.isdigit ( ) :
                continue
            idx = self.toIndex ( c )
            for d in range ( 10 ) :
                if self.uf.isSame ( d , idx ) :
                    S [ i ] = ord ( d ) + ord ( '0' )
                    continue loop
            S [ i ] = ord ( self.root ( idx ) ) + ord ( 'A' ) - 10
            group.add ( S [ i ] )
        if not group :
            return 1
        elif S [ 0 ].isdigit ( ) :
            return long ( sum ( [ i for i in group if i in S ] ) )
        else :
            return 9 * long ( sum ( [ i for i in group if i in S ] ) )
    class UnionFind ( object ) :
        def __init__ ( self ) :
            self.N = len ( self.N )
            self.rank = len ( self.rank )
