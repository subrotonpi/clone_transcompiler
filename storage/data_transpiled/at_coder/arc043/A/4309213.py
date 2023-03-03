def import import sys
class Main ( object ) :
    def __init__ ( self ) :
        self.n = int ( sys.stdin.read ( ) )
        self.a = int ( sys.stdin.read ( ) )
        self.b = int ( sys.stdin.read ( ) )
        self.min = sys.maxint
        self.max = 0
        self.sum = 0
        for s in self.n :
            if self.max < s :
                self.max = s
            if self.min > s :
                self.min = s
            self.sum += s
        if self.max - self.min == 0 :
            print ( - 1 )
            return
        p = float ( self.b ) / float ( self.max - self.min )
        q = a - float ( self.sum ) * p / float ( self.n )
        print ( "%s %s" % ( p , q ) , end = ' ' )
