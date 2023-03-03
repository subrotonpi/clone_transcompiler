def import sys
class Main ( object ) :
    def __init__ ( self ) :
        self.raw_input = sys.stdin
        nq = self.raw_input.split ( )
        n = int ( nq [ 0 ] )
        q = int ( nq [ 1 ] )
        arr = [ ]
        for i in range ( q ) :
            lrt = self.raw_input.split ( ) [ 3 : ]
            l = int ( lrt [ 0 ] )
            r = int ( lrt [ 1 ] )
            t = int ( lrt [ 2 ] )
            for j in range ( l - 1 , r ) :
                arr.append ( t )
        for i in range ( n ) :
            print ( arr [ i ] )
