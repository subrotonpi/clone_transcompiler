def import java.util.Scanner
class Main ( object ) :
    def __init__ ( self ) :
        self.s = sys.stdin
    def g_int ( self ) :
        return int ( self.s )
    def main ( self , * args ) :
        n = g_int ( )
        a , b = g_int ( ) , g_int ( )
        for i in range ( 1 , n ) :
            A , B = g_int ( ) , g_int ( )
            if a * 1.0 / A < b * 1.0 / B :
                b = ( b + B - 1 ) / B * B
                a = b / B * A
            else :
                a = ( a + A - 1 ) / A * A
                b = a / A * B
        print ( a , b )
