def import import sys
class Main ( object ) :
    def __init__ ( self ) :
        self.raw_input = sys.stdin
        a , b = sys.stdin.read ( ).split ( '\n' )
        if a > b :
            print ( a )
        else :
            print ( b )
    def adjustValue ( self , value ) :
        if 10 > value :
            return "0" + str ( value )
        else :
            return "%s" % value
