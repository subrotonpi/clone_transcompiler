def _import ( * args , ** kwargs ) :
    import sys
    import os
    import sys
    import getopt
    class Main ( object ) :
        def __init__ ( self ) :
            try :
                test_count = self.reader.read ( )
                for t in range ( 1 , test_count + 1 ) :
                    a = next ( self )
                    b = next ( self )
                    c = next ( self )
                    self.memory = [ ]
                    print ( 'Case #%d: %d' % ( t , solve ( a , b , c ) ) , file = sys.stderr )
            except Exception :
                pass
    class InputReader ( object ) :
        def __init__ ( self , f ) :
            self.f = f
            self.a = a
            self.b = b
            self.c = c
            self.memory = [ ]
            print ( 'Case #%d: %d' % ( t , self.solve ( a , b , c ) ) , file = sys.stderr )
        def go ( mask , length ) :
            if length == 0 :
                return mask == 7
            if self.memory [ mask ] [ length ] :
                return self.memory [ mask ] [ length ]
            result = 0
            for x in range ( 2 ) :
                for y in range ( 2 ) :
                    if ( mask >> 0 & 1 ) == 0 and x > a [ length - 1 ] :
                        continue
                    if ( mask >> 1 & 1 ) == 0 and y > b [ length - 1 ] :
                        continue
                    z = x & y
                    if ( mask >> 2 & 1 ) == 0 and z > c [ length - 1 ] :
                        continue
                    new_mask = mask
                    if x < a [ length - 1 ] :
                        new_mask |= 1
                    if y < b [ length - 1 ] :
                        new_mask |= 2
                    if z < c [ length - 1 ] :
                        new_mask |= 4
                    result += go ( new_mask , length - 1 )
            self.memory [ mask ] [ length ] = result
            return result
    def transform ( n ) :
        result = [ n >> i & 1 for i in range ( N ) ]
        return result
