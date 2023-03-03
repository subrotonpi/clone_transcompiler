def dfs ( lst , idx , par ) :
    import os
    import sys
    class Main ( object ) :
        def __init__ ( self ) :
            self.min = 0
            self.node = [ ]
            for temp in lst [ idx ] :
                if temp == par : continue
                child = dfs ( lst , temp , idx )
                self.node.append ( child )
            self.node.sort ( )
            for temp in self.node :
                min = max ( temp , min ) + 1
    return Main ( )
