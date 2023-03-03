def import sys
class Main ( object ) :
    def __init__ ( self ) :
        self.a = sys.stdin.read ( )
        self.b = sys.stdin.read ( )
        self.c = sys.stdin.read ( )
        self.list = [ ]
        i = 1
        while 1 :
            r = ( a * i ) % b
            if r == c :
                print ( "YES" )
                sys.exit ( )
            if r in self.list :
                print ( "NO" )
                sys.exit ( )
            self.list.append ( r )
            i += 1
