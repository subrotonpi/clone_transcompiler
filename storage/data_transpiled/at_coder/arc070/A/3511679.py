def import java.io.StringIO
import sys
class Main ( object ) :
    def input_stream ( self ) :
        self.out = sys.stdout
        self.Helper_class = self
        mod = 1000000007
    def main ( self ) :
        with open ( self.out , 'w' ) as f :
            self.out.write ( "%s\n" % self.out )
    def run ( self ) :
        self.in_ = input_stream ( )
        self.out.write ( "%s\n" % self.out )
        self.h = Helper_class ( )
        t = 1
        while t :
            self.solve ( )
            self.out.flush ( )
            self.out.close ( )
    def readline ( self ) :
        while not self.in_.readline ( ) or not self.in_.readline ( ) :
            try :
                self.in_.readline ( )
            except EOFError :
                pass
        return self.in_.readline ( )
    def solve ( self ) :
        n = self.h.nl ( )
        i = 0
        sum = 0
        while sum < n :
            sum += i
            i += 1
        self.h.pn ( i - 1 )
    def add ( self , x ) :
        cnt = self.tmap.get ( x )
        if not cnt :
            self.tmap [ x ] = 1
        else :
            self.tmap [ x ] += 1
    def remove ( self , x ) :
        cnt = self.tmap.get ( x )
        if not cnt :
            self.tmap.pop ( x )
        else :
            self.tmap [ x ] -= 1
    def com ( self , x ) :
        xx = cmp ( self.a , self.a )
        if not xx :
            return cmp ( self.b , self.b )
        else :
            return xx
    class Entity ( object ) :
        def __init__ ( self , x ) :
            self.a = x
            self.b = q
    class Helper_class ( object ) :
        def __init__ ( self , x ) :
            self.x = x
            self.h = self.