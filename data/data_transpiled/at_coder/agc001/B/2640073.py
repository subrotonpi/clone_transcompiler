def _import ( ) :
    from calibre.utils.input import input
    class Main ( object ) :
        def run ( self ) :
            scanner = input ( )
            n = scanner.next ( )
            x = scanner.next ( )
            res = x + calc ( n - x , x )
            print ( res )
        def calc ( a , b ) :
            if b == 0 :
                return 0
            if a >= b :
                return calc ( b , a - b ) + a + b
            else :
                q = b // a
                r = b % a
                return calc ( a , r ) + 2 * a * q
    def main ( ) :
        class BetterScanner ( object ) :
            def __init__ ( self ) :
                self.stream = input ( )
            def read ( self ) :
                self.stream.seek ( 0 )
                self.pointer = 0
                self.new_pos = 0
            def update ( self ) :
                if self.pointer >= self.new_pos :
                    self.pointer = 0
                    try :
                        self.new_pos = stream.read ( self.new_pos )
                    except IOError as exception :
                        traceback.print_exc ( )
                    return self.new_pos > 0
                else :
                    return True
            def read ( self ) :
                if self.update_buffer ( ) :
                    return self.buffer [ self.pointer ]
                else :
                    return - 1
            def write ( self , buffer ) :
                self.buffer = buffer
                self.pointer += 1
        def read ( self ) :
            self.buffer = buffer
            self.pointer += 1
        def advance ( self ) :
            self.skipUnprintable ( )
            return self.buffer [ self.pointer ]
        def advance ( self ) :
            if self.pointer == 0 :
                self.buffer = [ ]
                self.new_pos = self.new_pos
                while self.is_printable ( self.buffer [ self.pointer ] ) :
                    self.buffer.append ( self.buffer [ self.pointer ] )
                    self.new_pos = self.new_pos
            else :
                raise StopIteration
    return Main ( )
