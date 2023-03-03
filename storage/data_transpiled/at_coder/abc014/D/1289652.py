def _maketree ( v ) :
    import sys
    import os
    import os
    import sys
    class Main ( object ) :
        def __init__ ( self ) :
            self.ini = [ ]
            self.dfs = [ ]
            self.cnt = len ( self.V [ v ] [ 'tree' ] )
            while True :
                if self.cnt < 1 :
                    if self.V [ v ] [ 'tree' ] [ self.cnt ] != self.V [ v ] [ 'tree' ] [ self.cnt ] :
                        self.ans = self.V [ v ] [ 'rank' ] - 1
                    else :
                        self.ans = self.V [ v ] [ 'rank' ] - 1
                else :
                    self.ans = self.V [ v ] [ 'tree' ] [ self.cnt ] - 1
        def numr ( self , rank_ ) :
            dis = self.V [ v ] [ 'rank' ] - 1
            cnt = 1
            while cnt <= dis :
                cnt += 1
            cnt /= 2
            if cnt == dis :
                return self.V [ v ] [ 'tree' ] [ self.cnt ] - 1
            else :
                self.ans = self.V [ v ] [ 'rank' ] - 1
            return self.ans
        def maketree ( self ) :
            self.ans = self.V [ v ] [ 'tree' ] [ self.cnt ] - 1
    class Heirotree ( object ) :
        def __init__ ( self ) :
            self.visited = set ( )
            self.visited.add ( self.visited )
            self.visited.add ( self.visited )
        def maketree ( self ) :
            self.visited.add ( self.visited )
            self.visited.add ( self.visited )
        def maketree ( self ) :
            self.visited.add ( self.visited )
            self.visited.add ( self.visited )
    return Heirotree
