def import import sys
class Main ( object ) :
    def __init__ ( self ) :
        self.N = 0
        with open ( "/proc/self/status" ) as f :
            numbers = set ( )
            N = int ( f.read ( ) )
            for i in range ( N ) :
                numbers.add ( int ( f.read ( ) ) )
        print ( len ( numbers ) )
