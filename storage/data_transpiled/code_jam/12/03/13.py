def import _ReadFile
import os
import os
import os
import sys
import os
import os
import sys
import math
import os
import os
import os
import sys
import os
import string
import string
class codejamp3 :
    def __init__ ( self ) :
        self.read_file ( )
    def get_result ( self , input ) :
        result_int = 0
        exist = set ( )
        split_result = input.split ( )
        number_a = int ( split_result [ 0 ] )
        number_b = int ( split_result [ 1 ] )
        for i in range ( number_a , number_b ) :
            current = i
            exist = set ( )
            length1 = len ( str ( current ) )
            j = 10
            while j <= current :
                remain = current % j
                length2 = len ( str ( j ) )
                b = math.pow ( 10 , length2 - 1 )
                a = math.pow ( 10 , length1 )
                current_result = int ( remain * a / b + current / j )
                if current == 2022 :
                    print ( "{}:{}:{}".format ( remain , length2 - 1 , current_result ) )
                if current_result <= number_b and current_result > current :
                    if current_result not in exist :
                        exist.add ( current_result )
                        result_int += 1
                j = j * 10
        return "" , result_int
    def read_file ( ) :
        fstream = open ( "out.txt" , "w" )
        out = fstream.write
        input = open ( "in.txt" , "r" )
        buf_read = input.read ( )
        line = buf_read.rstrip ( )
        current = get_result ( line )
        i = 1
        out.write ( "Case #{}: {}\n".format ( i , current ) )
        line = buf_read.rstrip ( )
        while line :
            i += 1
            out.write ( '\n' + "Case #{}: {}\n".format ( i , get_result ( line ) ) )
            line = buf_read.rstrip ( )
        buf_read.close ( )
        out.close ( )
    return read_file
