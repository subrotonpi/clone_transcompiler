def import java.io.BufferedReader
import java.io.File
class Main ( java.io.BufferedReader ) :
    def __init__ ( self ) :
        try :
            with java.io.BufferedReader ( CustomReader ) as f :
                java.io.BufferedReader.__init__ ( self )
        except java.io.IOException :
            pass
    def execute ( self ) :
        A = 'a'
        S = java.io.BufferedReader ( )
        if len ( S ) == 1 and S [ 0 ] == A :
            print ( '-1' )
        else :
            print ( A )
    class CustomReader ( java.io.BufferedReader ) :
        DEFAULT_BUF_SIZE = 2048
        def __init__ ( self ) :
            super ( CustomReader , self ).__init__ ( DEFAULT_BUF_SIZE )
        def readline_as_int ( self ) :
            str_array = self.readline ( ).split ( )
            int_array = [ int ( i ) for i , n in enumerate ( str_array ) ]
            return int_array
        def readline_as_int_matrix ( self , rows , columns ) :
            matrix = [ ]
            for i in range ( rows ) :
                r = self.readline ( ).split ( )
                for j in range ( columns ) :
                    matrix.append ( [ int ( r [ j ] ) for j in range ( n ) ] )
            return matrix
    return Main
