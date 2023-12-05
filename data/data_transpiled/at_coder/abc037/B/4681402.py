def import import sys
class Main ( object ) :
    def __init__ ( self ) :
        self.n = int ( sys.stdin.read ( ) )
        self.q = int ( sys.stdin.read ( ) )
        self.a = [ ]
        for i in range ( self.q ) :
            start , end , t = self.start , self.end , self.t
            for i in range ( start - 1 , end ) :
                self.a.append ( t )
    for i in self.a :
        print ( i )
