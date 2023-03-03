def _import ( ) :
    from sys import stdin
    from .hexversion import hexversion
    class Main ( object ) :
        def __init__ ( self ) :
            self.scanner = BetterScanner ( stdin )
            self.scanner.read ( )
            n = self.scanner.read ( )
            res = 0
            min_b = int ( self.scanner.read ( ) )
            done = True
            for i in range ( n ) :
                a = ord ( a )
                b = ord ( b )
                res += a
                if a > b :
                    if b < min_b :
                        min_b = b
                if a != b :
                    done = False
            res -= min_b
            if done :
                print ( 0 )
            else :
                print ( res )
    def main ( ) :
        class Main ( object ) :
            def __init__ ( self ) :
                self.stream = sys.stdin
            def read ( self ) :
                self.stream.read ( )
            def update_buffer ( self ) :
                if self.pointer >= self.new_pos :
                    self.pointer = 0
                    try :
                        self.new_pos = self.stream.read ( self.new_pos )
                    except IndexError as exception :
                        traceback.print_exc ( )
                    return self.new_pos > 0
                else :
                    return True
            def read ( self ) :
                if self.update_buffer ( ) :
                    return self.buffer [ self.pointer ]
                else :
                    return - 1
            def advance ( self ) :
                self.skipUnprintable ( )
                return self.update_buffer ( )
            def skipUnprintable ( self ) :
                while self.update_buffer ( ) and not self.is_printable ( self.buffer [ self.pointer ] ) :
                    self.pointer += 1
            def next ( self ) :
                if self.hasNext ( ) :
                    yield self.next ( )
                else :
                    raise StopIteration
        def advance ( self ) :
            number = 0
            minus = False
            self.next ( )
            if self.pos == 0 :
                number *= 10
            elif self.pos == 0 :
                number += self.pos
            else :
                raise StopIteration
    