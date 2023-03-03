def _import ( ) :
    from sys import stdin
    from .hexline import read
    class Main ( object ) :
        @ staticmethod
        def __next__ ( self ) :
            if self.isdigit ( ) :
                number = False
                if self.isdigit ( ) :
                    minus = True
                    self.isdigit ( )
                if self.isdigit ( ) and self.isdigit ( ) :
                    number *= 10
                    self.isdigit ( )
                elif self.isdigit ( ) or not is_printable_char ( self.isdigit ( ) ) :
                    return ( - number ) if minus else number
                else :
                    raise ValueError ( )
            else :
                raise StopIteration ( )
    def __next__ ( self ) :
        number = next ( self )
        if self.isdigit ( ) and self.isdigit ( ) :
            return int ( number )
        else :
            raise ValueError ( )
    def isPrintable_char ( self ) :
        return self.isdigit ( )
    def __next__ ( self ) :
        return self.isdigit ( )
    def main ( self ) :
        main = Main ( )
        main.run ( )
    class BetterScanner ( object ) :
        def __init__ ( self , stream = sys.stdout ) :
            self.stream = stream
            self.buffer = sys.stdout.buffer
            self.pointer = 0
            self.new_pos = 0
        def __next__ ( self ) :
            if self.pointer >= self.new_pos :
                self.pointer = 0
                try :
                    self.new_pos = stream.read ( self.new_pos )
                except AttributeError :
                    self.new_pos = 0
                return self.new_pos
            else :
                return self.buffer
        def __next__ ( self ) :
            while self.pointer < self.new_pos :
                self.new_pos += self.new_pos
    return BetterScanner ( __next__ )
