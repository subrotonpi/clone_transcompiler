def main ( ) :
    import sys
    class Main ( object ) :
        def __init__ ( self ) :
            self.sc = sys.stdin
            self.s = [ self.sc , self.sc , self.sc ]
            p = 0
            while self.s [ p ] != '' :
                np = self.s [ p ] [ 0 ] - 'a'
                self.s [ p ] = self.s [ p ] [ 1 : ]
                p = np
            print ( chr ( ord ( 'A' ) + p ) )
