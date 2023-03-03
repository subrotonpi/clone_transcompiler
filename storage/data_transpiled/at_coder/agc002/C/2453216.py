def import _main
class Main ( object ) :
    def __init__ ( self ) :
        self.s = raw_input ( )
    def g_int ( self ) :
        return int ( self.s )
    def main ( self ) :
        n , l = g_int ( self ) , g_int ( self )
        a = [ ]
        start = - 1
        a.append ( g_int ( self ) )
        for i in range ( 1 , n ) :
            a.append ( g_int ( self ) )
            if start < 0 and a [ i ] + a [ i - 1 ] >= l :
                start = i
        if start < 0 :
            print ( "Impossible" )
            return
        print ( "Possible" )
        for i in range ( 1 , start ) :
            print ( i )
        for i in range ( n - 1 , start , - 1 ) :
            print ( i )
