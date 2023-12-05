def _import ( ) :
    import sys
    import os
    import os
    import sys
    import os
    import sys
    import os
    import sys
    import os
    import subprocess
    import subprocess
    import subprocess
    import subprocess
    class ProblemB :
        def __init__ ( self , * args ) :
            sys.stderr.write ( "\n".join ( [ str ( x ) for x in args ] ) )
    def debug ( self , * o ) :
        print ( "".join ( [ str ( x ) for x in o ] ) , file = sys.stderr )
    def solve ( self , edges ) :
        N = len ( edges ) + 1
        max = sys.maxint
        graph = [ [ ] for _ in range ( N ) ]
        for a , b in edges :
            graph [ a ].append ( b )
            graph [ b ].append ( a )
        self._graph = graph
        self._childCount = [ ]
        for i in range ( N ) :
            [ self._childCount [ i ] for i in range ( self._childCount [ i ] ) ]
            self._childCount.append ( max )
        return max
    def dfs ( self , now , parent ) :
        if self._childCount [ now ] != - 1 :
            return self._childCount [ now ]
        self._childCount [ now ] = 0
        for to in self._graph [ now ] :
            if to != parent :
                self._childCount [ now ] += self._childCount [ to ] + 1
        return self._childCount [ now ]
    def dfs ( self , now , parent ) :
        if self._childCount [ now ] != - 1 :
            return self._childCount [ now ]
        self._childCount [ now ] = 0
        for to in self._graph [ now ] :
            if to != parent :
                self._childCount [ now ] += self._childCount [ now ] + 1
        return self._childCount [ now ]
