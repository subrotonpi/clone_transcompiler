def import sys
class Main ( object ) :
    def __init__ ( self ) :
        self.sc = sys.stdin
        n = self.sc.readline ( )
        print ( ( n == 'a' or n == 'i' or n == 'u' or n == 'e' or n == 'o' ) and 'vowel' or 'consonant' )
