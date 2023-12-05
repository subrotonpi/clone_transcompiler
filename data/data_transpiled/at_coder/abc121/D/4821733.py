def import import sys
class Main ( object ) :
    def __init__ ( self ) :
        try :
            with open ( sys.argv [ 1 ] , 'r' ) as f :
                a = f.read ( )
                b = f.read ( )
                print ( self.result ( a - 1 ) ^ self.result ( b ) )
        except IOError :
            print ( "Error: %s" % sys.exc_info ( ) [ 0 ] )
            return None
    def result ( x ) :
        remainder = x % 4L
        if int ( remainder ) == 0 :
            return x
        elif int ( remainder ) == 1 :
            return 1
        elif int ( remainder ) == 2 :
            return x + 1
        elif int ( remainder ) == 3 :
            return None
