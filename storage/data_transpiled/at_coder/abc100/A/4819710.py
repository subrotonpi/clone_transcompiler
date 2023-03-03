def import __main__
class Main ( object ) :
    def __init__ ( self ) :
        self.sc = raw_input ( )
        print ( "Yay!" if max ( self.sc.__next__ ( ) ) < 9 else ":(" )
