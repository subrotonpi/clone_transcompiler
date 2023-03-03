def main ( ) :
    import sys
    class Main ( object ) :
        def __init__ ( self ) :
            self.sc = sys.stdin
        def run ( self ) :
            n = self.sc.input ( )
            if n < 60 :
                print ( "Bad" )
            elif n < 90 :
                print ( "Good" )
            elif n < 100 :
                print ( "Great" )
            else :
                print ( "Perfect" )
    return Main
