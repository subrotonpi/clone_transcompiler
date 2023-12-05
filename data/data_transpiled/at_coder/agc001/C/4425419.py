def import import array , E , glob
class Main ( object ) :
    def __init__ ( self ) :
        self.n , self.k = args
        g = [ E ( ) for i in range ( self.n ) ]
        es = [ [ ] for _ in range ( self.n - 1 ) ]
        for a , b in zip ( self.n - 1 , self.k - 1 ) :
            es [ a ].append ( a )
            es [ b ].append ( b )
            g [ a ].append ( b )
            g [ b ].append ( a )
        ans = 0
        if k % 2 == 0 :
            for i in range ( self.n ) :
                visited = [ False ] * n
                ans = max ( ans , dfs ( i , k / 2 , visited ) )
        else :
            for i in range ( self.n - 1 ) :
                visited = [ False ] * n
                ans = max ( ans , dfs ( i , k / 2 , visited ) )
        print ( self.n - ans )
    def dfs ( c , k , visited ) :
        visited [ c ] = True
        if k == 0 :
            return 1
        sum = 1
        for next in g [ c ] :
            if not visited [ next ] :
                sum += dfs ( next , k - 1 , visited )
        return sum
class E ( object ) :
    def __init__ ( self ) :
        self.n , self.k = args
