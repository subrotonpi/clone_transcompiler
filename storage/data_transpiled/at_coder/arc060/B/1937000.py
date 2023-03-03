def import java.io.StringIO
import sys
class Main ( object ) :
    def __init__ ( self ) :
        self.I = 1 << 50
        def f ( self , b , n ) :
            s = 0
            while n > 0 :
                s += n % b
                n /= b
            return s
    def main ( ) :
        sc = MyScanner ( )
        out = sys.stdout.buffer
        n = sc.next ( )
        s = sc.next ( )
        if n == s :
            out.write ( n + 1 )
            out.close ( )
            return
        if n < s :
            out.write ( - 1 )
            out.close ( )
            return
        min = I
        for b in range ( 1 , n ** 2 - s + 1 ) :
            if ( n - s ) % b != 0 :
                continue
            if f ( b + 1 , n ) == s :
                min = min ( long ( b ) + 1 , min )
            if f ( ( n - s ) / b + 1 , n ) == s :
                min = min ( min , ( n - s ) / b + 1 )
        if min == I :
            out.write ( - 1 )
            out.close ( )
            return
        out.write ( min )
        out.close ( )
    class MyScanner ( Scanner ) :
        def __init__ ( self ) :
            self.lines = sys.stdin.readlines ( )
        def readline ( self ) :
            while not self.lines or not self.lines :
                try :
                    self.lines = sys.stdin.readlines ( )
                except AttributeError :
                    pass
            return self.lines [ 0 ]
        def randint ( self ) :
            return int ( self.lines [ 0 ] )
        def long ( self ) :
            return long ( self.lines [ 0 ] )
        def double ( self ) :
            return double ( self.lines [ 0 ] )
        def readline ( self ) :
            self.lines = sys.stdin.readlines ( )
