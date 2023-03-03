def main ( ) :
    import sys
    class Main ( object ) :
        def __init__ ( self ) :
            self.name = sys.argv [ 1 ]
        def __call__ ( self , * args ) :
            c = self.name
            if c == 'a' :
                self.vowel = 'a'
            elif c == 'i' :
                self.vowel = 'i'
            elif c == 'u' :
                self.vowel = 'u'
            elif c == 'e' :
                self.vowel = 'e'
            elif c == 'o' :
                self.vowel = 'o'
            else :
                self.consonant = ''
    return Main ( )
