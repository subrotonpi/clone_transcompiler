def main ( args ) :
    import sys
    class Main ( object ) :
        def __init__ ( self ) :
            self.s = args
            self.a = None
            if self.s == 'A' :
                a = 'T'
            elif self.s == 'T' :
                a = 'A'
            elif self.s == 'G' :
                a = 'C'
            elif self.s == 'C' :
                a = 'G'
            print ( a )
    return Main
