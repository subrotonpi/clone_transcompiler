def import import _re_parse
import sys
import string
class Main ( object ) :
    def __init__ ( self , * args , ** kwargs ) :
        sc = _re_parse ( args , kwargs )
        s = sc.read ( )
        for i in [ 'a' , 'z' ] :
            s = s.replace ( str ( i ) , '' )
        for i in [ 'A' , 'Z' ] :
            s = s.replace ( str ( i ) , '' )
        self.out ( s )
