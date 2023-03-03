def import import sys
class Main ( object ) :
    def __init__ ( self ) :
        self.n = int ( sys.stdin.read ( ) )
        self.a = [ ]
        self.cnt = 0
        self.s = 1
        for i in range ( self.n ) :
            self.a.append ( sys.stdin.read ( ) )
        for i in range ( self.a.size ) :
            self.s = self.a [ s - 1 ]
            self.cnt += 1
            if self.s == 2 :
                print ( self.cnt )
                return
        print ( '-1' )
