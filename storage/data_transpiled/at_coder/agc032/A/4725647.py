def import import sys
class Main ( object ) :
    def __init__ ( self ) :
        self.stream = sys.stdin
        self.N = sys.stdin.read ( )
    def __init__ ( self ) :
        self.stream.close ( )
    def start ( self ) :
        self.stream.seek ( 0 )
        self.N = sys.stdin.read ( )
    def stop ( self ) :
        self.stream.seek ( 0 )
        self.N = sys.stdin.read ( )
    def op ( self ) :
        self.b = [ ]
        for i in range ( self.N - 1 , - 1 , - 1 ) :
            found = False
            cnt = i + 1
            for j in range ( self.N - 1 , - 1 , - 1 ) :
                if self.b [ j ] == cnt :
                    self.op.append ( cnt )
                    self.b [ j ] = - 1
                    found = True
                    break
                if self.b [ j ] >= 0 :
                    cnt -= 1
            if not found :
                self.print ( - 1 )
                return
        for p in self.op :
            print ( p )
