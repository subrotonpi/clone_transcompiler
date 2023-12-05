def import import sys
class Main ( object ) :
    def __init__ ( self ) :
        self.n = int ( sys.stdin.read ( ) )
        self.m = int ( sys.stdin.read ( ) )
        self.a = [ ]
        self.b = [ ]
        self.c = [ ]
        for i in range ( self.m ) :
            self.a.append ( sys.stdin.read ( ) )
            self.b.append ( sys.stdin.read ( ) )
            self.c [ self.a [ i ] ] += 1
            self.c [ b [ i ] ] += 1
        for i in self.c :
            if self.c [ i ] % 2 != 0 :
                print ( "NO" )
                return
        print ( "YES" )
