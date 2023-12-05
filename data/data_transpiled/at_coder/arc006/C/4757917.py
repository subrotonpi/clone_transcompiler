def import java.io.BufferedReader
import sys
import os
import sys
class Main ( CustomReader ) :
    def __init__ ( self ) :
        super ( Main , self ).__init__ ( )
    def execute ( self , f ) :
        import sys
        N = int ( f.readline ( ) )
        mountain = [ ]
        count = 0
        mountain.append ( sys.maxsize )
        for i in range ( N ) :
            w = int ( f.readline ( ) )
            target = - 1
            for j in range ( count ) :
                if mountain [ j ] >= w :
                    if target == - 1 or mountain [ target ] > mountain [ j ] :
                        target = j
            if target == - 1 :
                mountain.append ( w )
            else :
                mountain [ target ] = w
        print ( count )
    class CustomReader ( io.BufferedReader ) :
        DEFAULT_BUF_SIZE = 2048
        def __init__ ( self ) :
            super ( CustomReader , self ).__init__ ( DEFAULT_BUF_SIZE )
        def readline_as_int ( self ) :
            str_array = self.readline ( ).split ( )
            int_array = [ int ( i ) for i , n in enumerate ( str_array ) ]
            return int_array
        def readline_as_int_matrix ( self , rows , columns ) :
            matrix = [ ]
            for r in self.readline ( ).split ( ) :
                for j in range ( columns ) :
                    matrix.append ( [ int ( r [ j ] ) for i in r [ : - 1 ] ] )
            return matrix
