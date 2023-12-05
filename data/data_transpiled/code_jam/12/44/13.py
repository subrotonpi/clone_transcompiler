def _import ( ) :
    import sys
    import termios
    import struct
    import struct
    import math
    import text
    import util
    class D :
        def write ( self , grid ) :
            for a in grid :
                for b in a :
                    self.write ( b )
        def luck ( self , x , y ) :
            count = 0
            for i in range ( r ) :
                if self.valid [ i ] [ j ] :
                    return False
            for j in range ( c ) :
                if self.valid [ i ] [ j ] :
                    self.next [ j ] = 1
            for a in grid :
                for b in a :
                    self.next [ j ] = ( '0' if b else '1' )
            return True
        def valid ( self , x , y ) :
            return x >= 0 and x < r and y >= 0 and y < c
    class State ( object ) :
        def write ( self , grid ) :
            self.x , self.y = a
        def readline ( self ) :
            return struct.unpack ( '>I' , self.readline ( ) ) [ 0 ]
        def readline ( self ) :
            return struct.unpack ( '>I' , self.readline ( ) ) [ 0 ]
        def readline ( self ) :
            return struct.unpack ( '>I' , self.readline ( ) ) [ 0 ]
        def readline ( self ) :
            return struct.unpack ( '>I' , self.readline ( ) ) [ 0 ]
        def readline ( self ) :
            return struct.unpack ( '>I' , self.readline ( ) ) [ 0 ]
        def readline ( self ) :
            return struct.unpack ( '>I' , self.readline ( ) ) [ 0 ]
        def readline ( self ) :
            return struct.unpack ( '>I' , self.readline ( ) ) [ 0 ]
    def solve ( self , x , y ) :
        reach = [ ]
        q = [ State ( x , y ) ]
        reach.append ( True )
        while not q.empty ( ) :
            curr = q.pop ( )
            for k in range ( c ) :
                nx