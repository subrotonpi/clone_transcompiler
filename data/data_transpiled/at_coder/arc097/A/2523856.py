def import import os
import sys
class Main ( object ) :
    def __init__ ( self ) :
        array = [ ]
        for subtext in sys.stdin :
            substring = subtext.split ( ' ' )
            out_num = len ( subtext )
            for i , subtext in enumerate ( substring ) :
                for j in range ( len ( subtext ) , out_num ) :
                    array.append ( subtext [ : j + 1 ] )
        array_sub = sorted ( set ( array ) )
        print ( array_sub [ out_num - 1 ] )
