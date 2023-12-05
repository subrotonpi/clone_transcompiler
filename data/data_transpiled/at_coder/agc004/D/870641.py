def _import ( ) :
    from itertools import chain
    from os import urandom
    import random
    class Main ( object ) :
        def __init__ ( self ) :
            self.K = 0
            self.vec = [ [ ] ]
            self.ans = 0
        def main ( self , args ) :
            with open ( self.argv [ 1 ] ) as sc :
                n = int ( sc.read ( ) )
                K = sc.read ( )
                for i in range ( n ) :
                    self.vec.append ( [ ] )
                for i in range ( n ) :
                    a = random.randint ( 0 , K - 1 )
                    if i != 0 :
                        self.vec [ a ].append ( i )
                    elif a != 0 :
                        self.ans += 1
            self.dfs ( 0 , 0 )
            print ( self.ans )
        def dfs ( v , pre = None ) :
            height = 0
            for j in self.vec [ v ] :
                height = max ( height , dfs ( j , v ) )
            if pre is not None and height == K - 1 :
                height = 0
                self.ans += 1
            else :
                height += 1
            return height
    return Main ( )
