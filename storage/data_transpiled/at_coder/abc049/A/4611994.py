def import __main__
class Main ( object ) :
    def __init__ ( self ) :
        self.sc = sys.stdin
        c = self.sc.read ( )
        if c in [ 'a' , 'e' , 'i' , 'o' , 'u' ] :
            print ( 'vowel' )
        else :
            print ( 'consonant' )
