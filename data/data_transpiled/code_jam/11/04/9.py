def import import sys
import os
import sys
class Goro ( object ) :
    def __init__ ( self ) :
        self.stdout = sys.stdout
        self.stderr = sys.stderr
    def write ( self , data ) :
        f = open ( "D-large.in" , "r" )
        self.T = int ( data.pop ( 0 ) )
        f.write ( "output" )
        for I in range ( 1 , T + 1 ) :
            N = int ( data.pop ( 0 ) )
            data = data.pop ( 0 ).split ( " " , 1 )
            ret = N
            for i , k in enumerate ( data ) :
                if k == i + 1 :
                    ret -= 1
            f.write ( "Case #%d: %.000000" % ( I , ret ) )
