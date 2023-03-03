def _import ( ) :
    from sys import stdin
    import random
    class Main ( object ) :
        MOD = 1000000007
        def run ( self ) :
            scanner = BetterScanner ( sys.stdin )
            n = scanner.randint ( 0 , 1 )
            aa = [ scanner.randint ( 0 , 1 ) for i in range ( n ) ]
            if len ( aa ) >= 33 and len ( aa ) <= 126 :
                return ord ( aa [ 0 ] )
            else :
                raise ValueError ( )
    def read ( ) :
        number = random.randint ( 0 , 1 )
        if number >= int ( number ) :
            return number
        else :
            raise ValueError ( )
    def is_printable_char ( codePoint ) :
        return codePoint >= 33 and codePoint <= 126
    def main ( ) :
        main = Main ( )
        main.run ( )
    class BetterScanner ( Scanner ) :
        def __init__ ( self , stream ) :
            self.stream = stream
        def __init__ ( self , pointer = 0 ) :
            self.stream = stream
        def update_buffer ( self ) :
            if self.pointer >= self.new_pos :
                self.pointer = 0
                try :
                    self.new_pos = self.stream.read ( self.new_pos )
                except IOError as exception :
                    traceback.print_exc ( )
                return self.new_pos > 0
            else :
                return True
        def read ( ) :
            if self.new_pos == 0 :
                self.skipUnprintable ( )
                return self.new_pos
            else :
                return - 1
        def advance ( self ) :
            if self.new_pos == 0 :
                number = 0
                minus = False
                codePoint = self.read ( )
                while self.is_printable_char ( codePoint ) :
                    number += ord ( codePoint )
                    codePoint = self.read ( )
                return number
            else :
                raise StopIteration ( )
    return BetterScanner ( )
