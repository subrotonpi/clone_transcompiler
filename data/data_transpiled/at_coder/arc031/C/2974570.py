def _import ( ) : return next ( iter ( [ _import ( '' ) ] ) )
def _import ( ) : return _import ( '' )
def _import ( ) : return _import ( '' )
class Main ( object ) :
    class BIT ( int ) :
        def __init__ ( self , nn ) :
            self.n = nn
            self.data = [ ]
        def __add__ ( self , v ) :
            for _ in range ( self.n ) :
                self.data.append ( v )
        def get ( self ) :
            res = 0
            for _ in range ( self.n ) :
                res += self.data [ _ ]
            return res
        def __nl ( self ) :
            res = 0
            for _ in range ( self.n ) :
                res += self.data [ _ ]
            return res
        def __nl__ ( self ) :
            res = 0
            for _ in range ( self.n ) :
                res += self.data [ _ ]
            return res
        def __nl__ ( self ) :
            res = 0
            for _ in range ( self.n ) :
                res += self.data [ _ ]
            return res
        def __nl__ ( self ) :
            res = 0
            for _ in range ( self.n ) :
                res += self.data [ _ ]
            return res
        def __solve ( self ) :
            n = self.ni ( )
            self.bit = [ ]
            self.nodes.append ( ( self.pos , self.ni ( ) ) )
            self.nodes.sort ( key = lambda a : b.v - a.v )
            ans = 0
            for node in self.nodes :
                ans += int ( min ( self.bit [ node.pos - 1 ] , self.bit [ n ] ) )
                self.bit.append ( node.pos , 1 )
            out.write ( ans )
        def __nl__ ( self ) :
            self.solve ( )
            out.flush ( )
