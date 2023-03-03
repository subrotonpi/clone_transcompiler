def _import ( ) :
    import sys
    import struct
    import struct
    import struct
    class Main ( struct.Struct ) :
        def __init__ ( self ) :
            struct.Struct.__init__ ( self )
            self.n = struct.Struct.pack ( '>i' , struct.calcsize ( '>i' ) )
        def query ( self , a , b ) :
            self.n += 1
            self.v [ k ] = self.val
            while self.n > 0 :
                self.k = ( self.n - 1 ) // 2
                self.v [ self.k ] = min ( self.v [ 2 * k + 1 ] , self.v [ 2 * k + 2 ] )
        def tr ( self , * args ) :
            print ( struct.pack ( '>i' , * args ) )
    def _import tr ( * args ) :
        print ( [ ( a , b ) for a in args ] )
    f = [ ]
    f.append ( int ( sys.maxsize / 16 ) )
    s_add = Seg ( N )
    s_sub = Seg ( N )
    f.append ( abs ( A - x [ 0 ] ) )
    f.append ( abs ( B - x [ 0 ] ) )
    s_add.set_val ( A , f [ A ] + A )
    s_add.set_val ( B , f [ B ] + B )
    s_sub.set_val ( A , f [ A ] - A )
    s_sub.set_val ( B , f [ B ] - B )
    pending = 0
    for i in range ( 1 , Q ) :
        add = abs ( x [ i ] - x [ i - 1 ] )
        pending += add
        cur = f [ x [ i ] ]
        cur = min ( cur , - x [ i ] + s_add.query ( x [ i ] , N ) - add )
        cur = min ( cur , x [ i ] + s_sub.query ( 0 , x [ i ] ) - add )
        f [ x [ i - 1 ] ] = cur
        s_add.set_val ( x [ i - 1 ] , f [ x [ i - 1 ] ] + x [ i - 1 ] )
        s_sub.set_val ( x [ i - 1 ] , f [ x [ i