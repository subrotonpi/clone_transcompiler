def import sys
class Main ( object ) :
    def __init__ ( self ) :
        self.N = sys.stdin.read ( )
    def __init__ ( self ) :
        self.N = sys.stdin.read ( )
    def start ( self ) :
        self.N = sys.stdin.read ( )
    def stop ( self ) :
        self.N = sys.stdin.read ( )
    def stop ( self ) :
        self.N = sys.stdin.read ( )
    d = { }
    for i in range ( self.N ) :
        n = i
        if n - 1 in d :
            count = d [ n - 1 ]
            d [ n - 1 ] = count + 1
        else :
            d [ n - 1 ] = 1
        if n in d :
            count = d [ n ]
            d [ n ] = count + 1
        else :
            d [ n ] = 1
        if n + 1 in d :
            count = d [ n + 1 ]
            d [ n + 1 ] = count + 1
        else :
            d [ n + 1 ] = 1
    answer = 0
    for k in d :
        answer = max ( answer , d [ k ] )
    print ( answer )
