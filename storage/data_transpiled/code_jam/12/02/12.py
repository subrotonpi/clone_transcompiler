def import _ReadFile
import os
import os
import sys
import os
import sys
import os
import codecs
import codecs
class codejamp2 :
    def __init__ ( self , map ) :
        self.map = map
    def get_result ( self , input ) :
        result_int = 0
        split_result = input.split ( )
        dancercount = int ( split_result [ 0 ] )
        suprising = int ( split_result [ 1 ] )
        max = int ( split_result [ 2 ] )
        for i in range ( 3 , dancercount + 3 ) :
            current = int ( split_result [ i ] )
            ave = current / 3
            remain = current - 3 * ave
            currentmax = ave + remain
            if remain == 0 and ( max - currentmax == 1 ) and current != 0 :
                if suprising > 0 :
                    suprising -= 1
                    result_int += 1
            if currentmax >= max :
                if remain <= 1 :
                    result_int += 1
                elif remain == 2 :
                    if max - ave <= 1 :
                        result_int += 1
                    elif suprising > 0 :
                        suprising -= 1
                        result_int += 1
        return "%d" % result_int
    def read_file ( self ) :
        fstream = open ( "out.txt" , "w" )
        out = fstream.write
        input = open ( "in.txt" , "r" )
        bufread = input.read ( )
        line = bufread.rstrip ( )
        current = get_result ( line )
        i = 1
        out.write ( "Case #%d: %s\n" % ( i , current ) )
        line = bufread.rstrip ( )
        while line != "" :
            i += 1
            print ( "Case #%d: %s\n" % ( i , get_result ( line ) ) )
            out.write ( '\n' + "Case #%d: %s\n" % ( i , get_result ( line ) ) )
            line = bufread.rstrip ( )
        bufread.close ( )
        out.close ( )
