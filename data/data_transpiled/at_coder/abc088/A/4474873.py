def main ( ) :
    import sys
    class Main ( object ) :
        def __init__ ( self ) :
            self.sc = sys.stdin
        def __call__ ( self , * args ) :
            b = self.sc.randint ( 0 , 500 ) % 500
            if b <= self.sc.randint ( 0 , 500 ) :
                print ( "Yes" , end = "" )
            else :
                print ( "No" , end = "" )
    return Main
