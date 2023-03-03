def import import sys
class Main ( object ) :
    def __init__ ( self ) :
        self.s = sys.stdin.read ( )
    def __str__ ( self ) :
        return self.s
    save = [ ]
    min = 1000
    for i in range ( len ( self.s ) - 2 ) :
        save.append ( int ( self.s [ i : i + 3 ] ) )
    for i in range ( len ( self.s ) - 2 ) :
        save [ i ] = 753 - save [ i ]
        if save [ i ] < 0 :
            save [ i ] = - save [ i ]
        if save [ i ] < min :
            min = save [ i ]
    print ( min )
