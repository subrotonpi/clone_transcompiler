def import _main
class Main ( object ) :
    def __init__ ( self ) :
        self.input = _main ( )
    def __init__ ( self ) :
        self.input = _main ( )
    def score ( self ) :
        for i , c in enumerate ( self.input ) :
            if c == 'g' and i % 2 == 1 :
                score += 1
            elif c == 'p' and i % 2 == 0 :
                score -= 1
        print ( score )
