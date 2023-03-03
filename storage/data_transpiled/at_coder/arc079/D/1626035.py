def _import ( val ) : return val
import sys
import collections
import collections
import bisect
import bisect
import os
import sys
def fgrundy ( lis ) :
    def fgrundy ( cur ) :
        def f ( ) :
            for i in range ( 1 , len ( lis ) ) :
                if lis [ i - 1 ] + 1 < lis [ i ] :
                    return lis [ i - 1 ] + 1
            return lis [ i ] + 1
        return f
    def dfs ( cur ) :
        def f ( ) :
            for dst in g :
                if f [ dst ] == - 1 :
                    return f [ dst ]
            f [ cur ] = fgrundy ( lis )
        return f
    def tr ( * objects ) :
        def f ( ) :
            sc = os.open ( "/sys/modules/" , "r" )
            n = sc.read ( )
            p = [ ]
            g = [ ]
            cycle = [ False ]
            f = [ ]
            for i in range ( n ) :
                g.append ( [ ] )
            for i in range ( n ) :
                p.append ( sc.read ( ) )
                del p [ i ]
                g [ p [ i ] ].append ( i )
            v = 0
            for i in range ( n ) :
                v = p [ v ]
            for i in range ( n ) :
                cycle.append ( True )
                v = p [ v ]
            [ f [ v ] ] = - 1
            for i in range ( n ) :
                if not cycle [ i ] and f [ i ] == - 1 :
                    dfs ( i )
            ans = False
            lis = [ ]
            for dst in g [ v ] :
                if f [ dst ] != - 1 :
                    lis.append ( f [ dst ] )
            ans |= solve ( v , fgrundy ( lis ) )
            ans |= solve ( v , sgrundy ( lis ) )
            print ( ans and "POSSIBLE" or "IMPOSSIBLE" )
        return ans
    return fgrundy ( lis )
