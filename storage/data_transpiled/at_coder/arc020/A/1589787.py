def main ( ) :
    import sys
    import os
    import sys
    class Main ( object ) :
        def __init__ ( self ) :
            sys.stdout.write ( '\n' )
            sys.stdout.flush ( )
        def input ( self ) :
            with open ( self.filename , 'r' ) as f :
                A = f.read ( )
                B = f.read ( )
        def main ( self , args ) :
            self.input ( )
            if abs ( A ) - abs ( B ) > 0 :
                print ( 'Bug' )
            elif abs ( A ) - abs ( B ) < 0 :
                print ( 'Ant' )
            else :
                print ( 'Draw' )
