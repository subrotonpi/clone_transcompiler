def import import *
class Main ( object ) :
    def __init__ ( self , sc ) :
        self.n = sc.n
        self.a = sc.a
        self.b = sc.b
        self.c = sc.c
        self.d = sc.d
        self.dur = a - b
        for up in range ( self.n - 1 ) :
            max = d * up - c * ( self.n - 1 - up )
            min = c * up - d * ( self.n - 1 - up )
            if min <= dur <= max :
                self.print ( "YES" )
                return
        self.print ( "NO" )
    def run ( self ) :
        with open ( "/tmp/" ) as f :
            return Main ( f.read ( ) )
