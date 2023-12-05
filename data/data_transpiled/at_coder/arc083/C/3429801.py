def _import ( ) :
    from io import StringIO
    from io import BytesIO
    from itertools import chain
    from itertools import chain
    class Main ( object ) :
        def __init__ ( self , N ) :
            self.A = [ ]
            self.B = [ ]
        def readline ( self ) :
            if self.a or not self.b :
                try :
                    self.A = next ( self.A )
                except StopIteration :
                    raise StopIteration
            return self.A
        def __next__ ( self ) :
            return int ( self.a )
        def __next__ ( self ) :
            return next ( self.B )
        def __next__ ( self ) :
            if self.b or not self.b :
                raise StopIteration
            self.a = next ( self.A )
            self.b = next ( self.B )
        __next__ ( self )
        return __next__ ( self )
    def dfs ( n , from_list , to_list ) :
        for f in from_list :
            cnt [ f ] += 1
        for i in range ( n ) :
            a = next ( self.A ) - 1
            b = i + 1
            A.append ( a )
            B.append ( b )
    X = next ( self.X )
    print ( 'POSSIBLE' if solve ( ) else 'IMPOSSIBLE' )
    def dfs ( n , G ) :
        G = adjd ( N , A , B )
        dp = [ False ] * 5001
        prev = [ False ] * 5001
        try :
            r = dfs ( 0 , G )
            return True
        except WrongException :
            return False
    class WrongException ( RuntimeError ) :
        pass
    def dfs ( n , G ) :
        G = adjd ( N , G )
        dp = [ False ] * 5001
        prev = [ False ] * 5001
        for i in range ( n ) :
            rs = dfs ( G [ n ] [ i ] , G )
        return napsack ( n , rs , X [ n ] )
    def napsack ( n , rs , x ) :
        [ dp ] = False
        [ prev ] = False
        sum = 0
        first = rs [ 0 ]
        if