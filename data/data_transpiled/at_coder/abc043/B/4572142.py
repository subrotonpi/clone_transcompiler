def import _main
class Main ( object ) :
    def __init__ ( self ) :
        self.name = 'Main'
    def __call__ ( self , * args , ** kwargs ) :
        with open ( self.name , 'r' ) as f :
            line = f.readline ( )
            items = [ ]
            for letter in line :
                if letter.isdigit ( ) :
                    items.append ( letter )
                elif letter == 'B' and not items [ - 1 ] :
                    items.pop ( )
            yield letter
