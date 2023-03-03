def main ( ) :
    import sys
    class Main ( object ) :
        def __init__ ( self ) :
            self.sc = sys.stdin
        def __call__ ( self ) :
            a , b = self.sc.randint ( 0 , 1 ) , self.sc.randint ( 0 , 1 )
            if a == b :
                print ( "Draw" )
                return
            if a == 1 :
                a += 13
            if b == 1 :
                b += 13
            print ( "Alice" if a > b else "Bob" )
    return Main
