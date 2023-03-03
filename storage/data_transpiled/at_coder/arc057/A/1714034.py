def import _struct
import struct
import sys
class Main ( object ) :
    def __init__ ( self ) :
        self.solver = _struct
    def ex ( self ) :
        return "567876543 0"
    class Solver ( object ) :
        def __init__ ( self ) :
            self.solver = Solver
        def solve ( self , line ) :
            split = line.split ( )
            A = struct.unpack ( "!I" , split [ 0 ] ) [ 0 ]
            K = struct.unpack ( "!I" , split [ 1 ] ) [ 0 ]
            target = struct.unpack ( "!I" , '2000000000000" ) [ 0 ]
            one = struct.unpack ( "!I" , '1' ) [ 0 ]
            if K == struct.unpack ( "!I" , '0' ) [ 0 ] :
                print ( target - A )
                sys.exit ( )
            ans = 0
            while A < target :
                A = A + one + K * A
                ans += 1
            print ( ans )
        def split_int ( self ) :
            split = self.split ( )
            split_int = [ int ( x ) for x in split ]
            return split_int
        def split_long ( self ) :
            split = self.split ( )
            split_int = [ long ( x ) for x in split ]
            return split_int
