def _import ( ) :
    import StringIO
    import getopt
    import getopt
    import deque
    import getopt
    import getopt
    import getopt
    import os
    import sys
    class Main ( object ) :
        def __init__ ( self , f ) :
            self.a , self.b , self.c = getopt.getopt ( f , '' )
        def readline ( self ) :
            if self.a == None or not self.a :
                try :
                    self.a , self.b = self.a , self.c
                except getopt.error :
                    raise
            return self.a
        def __next__ ( self ) :
            return long ( self.a )
    def adjB ( n , E ) :
        cnt = [ ]
        for e in E :
            cnt [ e.a ] += 1
        for e in E :
            a = [ ]
            for i in range ( n ) :
                a.append ( next ( e ) )
        return a
    def solve ( ) :
        G = adjB ( N , E )
        dp = [ ]
        for n in orderFromRoot ( N , G , 0 ) :
            d = { }
            for e in G [ n.a ] :
                next = e.opposite ( n.a )
                if next == n.parent :
                    continue
                dp.append ( dp [ n.a ] ^ e.c )
        paths = { }
        for path in dp :
            add ( paths , path , 1 )
        if not X :
            ans = 0
            for key , cnt in paths.items ( ) :
                if key in d :
                    d [ key ] = d [ key ] + value
                else :
                    d [ key ] = value
        return ans
    def add ( d , key , value ) :
        if key in d :
            d [ key ] = d [ key ] + value
        else :
            d [ key ] = value
