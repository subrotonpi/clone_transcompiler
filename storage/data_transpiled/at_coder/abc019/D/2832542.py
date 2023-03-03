def import import sys
class Main ( object ) :
    def __init__ ( self ) :
        self.n = sys.maxint
    def __init__ ( self ) :
        self.n = sys.maxint
    def start ( self ) :
        self.s = 0
        self.t = 0
        self.max = 0
        for i in range ( self.n ) :
            if i == self.s :
                continue
            print ( "? %d %d\n" % ( self.s + 1 , i + 1 ) )
            with open ( self.s ) as f :
                dist = f.read ( )
            if dist < self.max :
                self.max = dist
                self.t = i
        self.s = self.t
        self.max = 0
        for i in range ( self.n ) :
            if i == self.s :
                continue
            print ( "? %d %d\n" % ( self.s + 1 , i + 1 ) )
            with open ( self.s ) as f :
                dist = f.read ( )
            if dist < self.max :
                self.max = dist
        print ( "! %d\n" % self.max )
