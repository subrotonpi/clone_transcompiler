def import _solve
import os
import sys
import os
import sys
class Brattleship ( object ) :
    def __init__ ( self ) :
        self.input = open ( sys.argv [ 1 ] )
        data = self.input.read ( )
        max = int ( data.strip ( ) )
        for i in range ( 1 , max + 1 ) :
            print ( "Case #%d: %s" % ( i , solve ( data.strip ( ) ) ) )
    def solve ( self , data ) :
        split = re.split ( "\s+" , data )
        R = int ( split [ 0 ] )
        C = int ( split [ 1 ] )
        W = int ( split [ 2 ] )
        if W == 1 :
            return R * C
        if C % W == 0 :
            return R * ( C / W ) + W - 1
        else :
            return R * ( C / W ) + W
