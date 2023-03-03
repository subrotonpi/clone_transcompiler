def import _GoroSort
import sys
import os
import sys
import string
import sys
class GoroSort ( object ) :
    def __init__ ( self ) :
        self.formatter_ = string
    def __init__ ( self , name ) :
        self.formatter_ = None
    def __call__ ( self , filename ) :
        f = open ( filename , 'r' )
        try :
            num_examples = int ( f.readline ( ) )
        except :
            num_examples = 0
        for i in range ( num_examples ) :
            f.readline ( )
            values = f.readline ( ).split ( )
            v = [ ]
            out_of_place = 0
            for j , value in enumerate ( values ) :
                v.append ( int ( value ) )
                if v [ j ] != j + 1 :
                    out_of_place += 1
            print ( "Case #%d: %s" % ( i + 1 , self.formatter_ ( out_of_place ) ) )
