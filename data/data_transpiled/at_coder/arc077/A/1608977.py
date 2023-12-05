def import import sys
class Main ( object ) :
    def __init__ ( self ) :
        self.stdin = sys.stdin
        self.N = sys.stdin.readline ( ).rstrip ( )
    def run ( self ) :
        self.nums = [ int ( i ) for i in sys.stdin.readline ( ).rstrip ( ).split ( ) ]
    index = N - 1
    s = [ ]
    while index >= 0 :
        s.append ( "%s " % nums [ index ] )
        index -= 2
    index = N % 2
    while index < N :
        s.append ( "%s " % nums [ index ] )
        index += 2
    print ( "\n".join ( s ) )
