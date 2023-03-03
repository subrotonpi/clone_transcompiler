def _import ( ) :
    import sys
    import os
    import os
    import sys
    import random
    import time
    import random
    import tokenize
    class Main ( ) :
        def __init__ ( self , x ) :
            sc = FastReader ( )
            self.n , self.m = sc.randint ( 0 , 1 )
            self.lists = [ ]
            for i in range ( 0 , m ) :
                self.lists.append ( [ ] )
            for l , r in zip ( self.lists , self.lists [ - 1 ] ) :
                self.lists [ r - l + 1 ].append ( l )
            self.solve ( )
        def solve ( self ) :
            lengthy = self.n
            ft = FenwickTree ( self.m )
            for d in range ( 1 , m + 1 ) :
                ans = 0
                for i in range ( d , self.m + 1 , d ) :
                    ans += ft.range_sum ( i )
                ans += lengthy
                print ( ans )
                for start in self.lists [ d ] :
                    ft.update ( start , 1 )
                    ft.update ( start + d , - 1 )
                lengthy -= len ( self.lists [ d ] )
    class FastReader ( ) :
        def __init__ ( self , N ) :
            self.tree = [ ]
            self.N = N
        def readline ( self ) :
            while not self.tree or not self.iter :
                try :
                    self.tree.append ( self.readline ( ) )
                except EOFError :
                    pass
            return self.tree [ 0 ]
        def readline ( self ) :
            data = ''
            try :
                data = self.readline ( )
            except EOFError :
                pass
            return data
    return FastReader ( )
