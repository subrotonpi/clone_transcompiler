def _import ( ) :
    import sys
    import struct
    import struct
    import struct
    class Main ( struct.Struct ) :
        def __init__ ( self ) :
            struct.Struct.__init__ ( self )
            self.n += 1
            self.v = struct.Struct.__init__ ( self )
        def __init__ ( self ) :
            struct.Struct.__init__ ( self )
            self.N = struct.Struct.__init__ ( self )
            self.Q = struct.Struct.__init__ ( self )
            self.A = struct.Struct.__init__ ( self )
            self.B = struct.Struct.__init__ ( self )
            self.A -= 1
            self.B -= 1
            self.x = [ ]
            for i in range ( self.Q ) :
                self.x.append ( struct.pack ( self.A , self.B , self.A , self.B , self.k ) )
            self.solve ( self.N , self.Q , self.A , self.B , self.x )
        def tr ( self ) :
            print ( struct.pack ( self.N , self.Q , self.A , self.B , self.x ) )
    def solve ( self , N , self , A , B , x ) :
        f = [ ]
        f.append ( struct.pack ( self.N , self.Q , self.A , self.B , self.x ) )
        s_add = Seg ( N )
        s_sub = Seg ( N )
        f.append ( struct.pack ( self.B , self.A , self.B , self.x ) )
        s_add.set_val ( A , self.f [ A ] + A )
        s_add.set_val ( B , self.f [ B ] + B )
        s_sub.set_val ( A , self.f [ A ] - A )
        s_sub.set_val ( B , self.f [ B ] - B )
        pending = 0
        for i in range ( 1 , self.Q ) :
            ans = min ( ans , self.f [ i ] + pending )
        print ( ans )
    class Seg ( struct.Struct ) :
        def __init__ ( self ) :
            struct.Struct.__init__ ( self )
            self.N = 1
    return Seg
    