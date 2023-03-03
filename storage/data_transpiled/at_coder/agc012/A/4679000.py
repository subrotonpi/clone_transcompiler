def import _readline
import readline
import readline
import time
class Main ( readline ) :
    def __init__ ( self ) :
        readline.__init__ ( self )
        self.stdin = readline
    def readline ( self ) :
        num = int ( readline.strip ( ) )
        vals = getNums ( readline.strip ( ).split ( ) , num * 3 )
        readline.close ( )
        [ sum ] = 0
        for i in range ( num , num * 3 , 2 ) :
            sum += vals [ i ]
        print ( sum )
    def getNums ( vals , num ) :
        v_ary = [ int ( i ) for i in vals ]
        return v_ary
