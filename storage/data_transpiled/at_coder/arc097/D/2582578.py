def _import ( ) :
    import os
    import sys
    import os
    import collections
    import collections
    import os
    import collections
    import collections
    import os
    import os
    import sys
    import os
    import os
    import sys
    import os
    import getopt
    import os
    import getopt
    import os
    import getopt
    from collections import deque
    import set
    class Main :
        def __init__ ( self ) :
            self.edges = set ( )
        def __init__ ( self ) :
            self.isWhite = set ( )
            self.isWhite = set ( )
            self.stamped = set ( )
            self.path = sys.maxint
        def dfs1 ( self , v ) :
            self.used [ v ] = True
            self.cnt = 0
            for u in self.edges [ v ] :
                if self.used [ u ] :
                    continue
                d = dfs1 ( u )
                if d >= 0 :
                    self.cnt += d + 2
                    self.cnt += 1
            if self.cnt == 0 and not self.isWhite [ v ] :
                return - 1
            if ( self.isWhite [ v ] and self.cnt % 2 == 1 ) or ( not self.isWhite [ v ] and self.cnt % 2 == 0 ) :
                self.stamped [ v ] = True
                self.cnt += 1
            return self.cnt
        def longest ( self , v ) :
            self.used [ v ] = True
            self.que = deque ( list ( self.edges ) )
            self.que.append ( 0 )
            self.path = 0
            for u in self.edges [ v ] :
                if self.used [ u ] :
                    continue
                self.que.append ( longest ( u ) )
            res = self.que.popleft ( ) + ( self.stamped [ v ] , )
            self.path = max ( self.path , self.que.popleft ( ) + self.stamped [ v ] )
            return res
    def main ( ) :
        with open ( os.devnull , 'w' ) as f :
            N = len ( f.readlines ( ) )
            self.edges = set ( )
            self.isWhite = set ( )
            self.used = set ( )
            