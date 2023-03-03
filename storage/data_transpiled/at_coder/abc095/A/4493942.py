def import sys
class Main ( object ) :
    def __init__ ( self ) :
        self.s = sys.stdin.read ( )
    def __call__ ( self , s ) :
        self.s = s
        self.counter = 0
        if s [ 0 ] == 'o' :
            self.counter += 1
        if s [ 1 ] == 'o' :
            self.counter += 1
        if s [ 2 ] == 'o' :
            self.counter += 1
        sys.stdout.write ( "%d" % ( 700 + self.counter * 100 ) )
