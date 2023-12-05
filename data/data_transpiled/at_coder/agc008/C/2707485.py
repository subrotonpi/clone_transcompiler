def _import ( ) :
    from sys import stdin
    class Main ( object ) :
        @ staticmethod
        def read ( ) :
            from scanner import Scanner
            from scanner import Scanner
            aa = [ ]
            for i in range ( 7 ) :
                aa.append ( next ( ) )
        else :
            raise StopIteration
    def read ( ) :
        number = randint ( 0 , int ( number ) )
        if number >= int ( number ) :
            return number
        else :
            raise StopIteration
    def is_printable_char ( unichr ) :
        return unichr ( ord ( chr ( ord ( chr ( i ) ) ) ) ) in ( 33 , 126 )
    def read ( ) :
        return unichr ( ord ( chr ( i ) ) ) in ( 126 , 126 )
    def write ( ) :
        return chr ( ord ( chr ( i ) ) ) in ( 33 , 126 )
    def read ( ) :
        return read ( )
    class BetterScanner ( Scanner ) :
        def __init__ ( self ) :
            self.stream = sys.stdin
            self.buffer = sys.stdin.buffer
            self.pointer = 0
            self.new_pos = 0
        def update ( self ) :
            if self.pointer >= self.new_pos :
                self.pointer = 0
                try :
                    new_pos = self.stream.read ( self.new_pos )
                except IOError as exception :
                    traceback.print_exc ( )
                return self.new_pos > self.new_pos
            else :
                return True
        def read ( ) :
            if self.update_buffer ( ) :
                return self.buffer [ self.pointer ]
            else :
                return - 1
        def write ( ) :
            while self.update_buffer ( ) and not self.is_printable_char ( self.buffer [ self.pointer ] ) :
                self.pointer += 1
    def read ( ) :
        if self.new_pos == 0 :
            return - 1
        elif self.new_pos == 0 :
            return - 1
        else :
            raise StopIteration
    return BetterScanner ( read )
