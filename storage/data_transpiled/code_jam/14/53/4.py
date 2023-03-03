def import time
import sys
import time
class CrimeHouse ( object ) :
    def solve ( self ) :
        n = len ( self.input )
        type = [ ]
        id = [ ]
        for i in range ( n ) :
            type.append ( self.input [ i ] [ 0 ] )
            id.append ( self.input [ i ] [ 1 ] )
    def readline ( ) :
        while not isinstance ( readline , str ) or readline.strip ( ) :
            try :
                readline.readline ( )
            except :
                pass
        return int ( readline ( ) )
    def uniform ( ) :
        return float ( readline ( ) )
    def run ( ) :
        return CrimeHouse ( )
