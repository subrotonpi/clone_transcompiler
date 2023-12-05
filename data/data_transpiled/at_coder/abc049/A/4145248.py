def main ( ) :
    import sys
    class Main ( object ) :
        def __init__ ( self ) :
            self.sc = sys.stdin
            a = self.sc.read ( ) [ 0 ]
            if a in [ 'a' , 'i' , 'u' , 'e' , 'o' ] :
                print ( "vowel" )
            else :
                print ( "consonant" )
