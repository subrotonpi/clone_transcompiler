def main ( ) :
    import sys
    class Main ( object ) :
        def __init__ ( self ) :
            self.sc = sys.stdin
        def __call__ ( self , * args ) :
            c = self.sc.read ( ) [ 0 ]
            if c == 'a' or c == 'i' or c == 'u' or c == 'e' or c == 'o' :
                print ( "vowel" )
            else :
                print ( "consonant" )
    return Main
