def import import sys
import string
import string
import sys
class Main ( object ) :
    def __init__ ( self ) :
        Scanner ( )
        S = string.split ( sys.stdin.read ( ) )
        i = S.index ( "WBWBWBW" )
        o = ( "Do" , "" , "Re" , "" , "Mi" , "Fa" , "" , "So" , "" , "La" , "" , "Si" )
        oi = 5 - i % 12
        if oi < 0 :
            oi = len ( o ) + oi
        self.out.write ( o [ oi ] )
