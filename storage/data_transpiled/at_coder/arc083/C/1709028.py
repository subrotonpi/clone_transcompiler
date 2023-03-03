def _import ( ) :
    import os
    import random
    class Main ( object ) :
        def __init__ ( self ) :
            self.b = 0
            self.w = 0
            self.child = [ ]
        def subset_sum ( self , arr , target ) :
            n = len ( arr )
            m = target + 1
            dp = [ [ ] for _ in range ( n ) ]
            for i in range ( n ) :
                if arr [ i ] > target :
                    continue
                dp [ i ] [ arr [ i ] ] = True
            for i in range ( 1 , n ) :
                for j in range ( m ) :
                    if dp [ i - 1 ] [ j ] :
                        dp [ i ] [ j ] = True
                        if j + arr [ i ] <= target :
                            dp [ i ] [ j + arr [ i ] ] = True
            for i in range ( m - 1 , - 1 , - 1 ) :
                if dp [ n - 1 ] [ i ] :
                    return i
            return 0
        def main ( self ) :
            with open ( self.filename , 'r' ) as f :
                N = len ( f.readlines ( ) )
                self.nodes = [ ]
                self.X = [ ]
                for i in range ( N ) :
                    self.nodes.append ( Node ( ) )
                    self.nodes [ i ].child = [ ]
                for par in range ( 1 , N ) :
                    self.nodes [ par - 1 ].child.append ( i )
                for i in range ( N ) :
                    self.X.append ( f.readlines ( ) )
                print ( 'POSSIBLE' if self.recur ( 0 ) else 'IMPOSSIBLE' )
        def recur ( self , node_idx ) :
            cur = self.nodes [ node_idx ]
            if not cur.child or len ( cur.child ) == 0 :
                cur.b = 0
                cur.w = X [ node_idx ]
                return True
            for i in cur.child :
                self.b += max ( i , i )
                self.w += max ( i , i ) - min ( i , i )
    return Main
