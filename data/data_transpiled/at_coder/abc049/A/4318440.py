def import _main
class Main ( object ) :
    def __init__ ( self ) :
        self.sc = _main ( )
    def main ( self ) :
        c = self.sc.next ( ) [ 0 ]
        print ( c == 'a' or c == 'e' or c == 'i' or c == 'o' or c == 'u' and 'vowel' or 'consonant' )
