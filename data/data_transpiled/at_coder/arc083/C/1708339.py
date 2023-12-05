def _import ( ) :
    import random
    import math
    import numpy as np
    class Main ( object ) :
        class Node :
            b = 0
            w = 0
            child = [ ]
        def subset_sum ( arr , target ) :
            n = len ( arr )
            m = target + 1
            dp = np.zeros ( ( n , m ) )
            cur.b = max ( white )
            cur.w = max ( white ) - min ( white )
            return True
        def subset_sum ( arr , target ) :
            if arr [ - 1 ] > target :
                continue
            dp [ arr [ - 1 ] ] = True
            cur.b = max ( white )
            cur.w = max ( white ) - min ( white )
            return True
    def subset_sum ( arr , target ) :
        n = len ( arr )
        m = len ( target )
        dp = np.zeros ( ( n , m ) )
        cur.b = max ( white )
        cur.w = max ( white ) - min ( white )
        return True
    def subset_sum ( arr , target ) :
        if target > target :
            return False
        sww = subset_sum ( swap , X [ - 1 ] )
        cur.b = max ( white )
        cur.w = max ( white ) - min ( white )
        return True
    def main ( ) :
        with open ( '/proc/file' , 'r' ) as f :
            N = len ( f.read ( ) )
            nodes = [ Node ( ) for _ in range ( N ) ]
            X = [ ]
            for _ in range ( N ) :
                nodes.append ( Node ( ) )
                nodes [ - 1 ].child = [ ]
            for _ in range ( 1 , N ) :
                par = random.randint ( 0 , N )
                nodes [ par - 1 ].child.append ( _ )
            for _ in range ( N ) :
                X.append ( f.read ( ) )
            print ( 'POSSIBLE' if recur ( 0 ) else 'IMPOSSIBLE' )
    def recur ( node_idx ) :
        cur = nodes [ node_idx ]
        if cur.b in nodes or cur.w in nodes :