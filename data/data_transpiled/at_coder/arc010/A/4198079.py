def import import sys
class Main ( object ) :
    def __init__ ( self ) :
        self.n = sys.stdin.read ( )
        self.m = sys.stdin.read ( )
        self.a = sys.stdin.read ( )
        self.b = sys.stdin.read ( )
        now = self.n
        for i in range ( self.m ) :
            if now <= a :
                now += b
            c = sys.stdin.read ( )
            now -= c
            if now < 0 :
                print ( i + 1 )
                return
        print ( "complete" )
