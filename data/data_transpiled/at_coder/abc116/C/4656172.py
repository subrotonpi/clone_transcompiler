def import import sys
class Main ( object ) :
    def __init__ ( self ) :
        self.N = sys.stdin.read ( )
    def __init__ ( self ) :
        self.h = [ ]
        for i in range ( self.N ) :
            self.h.append ( sys.stdin.read ( ) )
    operations = 0
    while True :
        start = min = None
        current_operations = operations
        for i in range ( self.N ) :
            if h [ i ] :
                if min is None or h [ i ] < min :
                    min = h [ i ]
            else :
                for j in range ( start , i ) :
                    h [ j ] -= min
                operations += min
                start = i + 1
                min = None
        for j in range ( start , self.N ) :
            h [ j ] -= min
        operations += min
        if current_operations == operations :
            break
    print ( operations )
