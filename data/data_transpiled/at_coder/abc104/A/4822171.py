def main ( ) :
    import sys
    from os import urandom
    class Main ( object ) :
        def __init__ ( self ) :
            self.main = Main ( )
            with open ( "/proc/self/" , "r" ) as f :
                self.solve ( f )
        def solve ( self ) :
            i = int ( self.solve ( ) )
            if i < 1200 :
                print ( "ABC" )
            elif i < 2800 :
                print ( "ARC" )
            else :
                print ( "AGC" )
