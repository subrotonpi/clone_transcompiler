def main ( ) :
    import sys
    class Main ( object ) :
        def __init__ ( self ) :
            self.a = sys.argv [ 1 ]
        def call ( self ) :
            if self.a == 'a' :
                self.a = - 1
            else :
                self.a = 'a'
    return Main ( )
