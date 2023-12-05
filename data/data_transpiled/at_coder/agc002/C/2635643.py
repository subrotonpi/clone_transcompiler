def _import ( ) :
    from sys import stdin
    from .hexversion import hexversion
    class Main ( object ) :
        def read ( self ) :
            while True :
                if isinstance ( self.value , bytes ) :
                    self.value *= 10
                    self.value += self.value - '0'
                elif not is_printable_char ( self.value ) :
                    return ( - self.value ) if self.value == 0 else self.value )
                self.value = self.value
            else :
                raise StopIteration
        def read ( self ) :
            return self.value
    def read ( self ) :
        return ( )
    k = - 1
    for i in range ( 1 , n ) :
        if isinstance ( self.value , bytes ) :
            return ord ( self.value )
        else :
            raise StopIteration
    def is_printable_char ( self ) :
        return self.value >= 33 and self.value <= 126
    output = [ ]
    if k >= 0 :
        output.append ( "Possible\n" )
        for i in range ( 1 , k - 1 ) :
            output.append ( "%d\n" % i )
        for i in range ( n - 1 , k - 1 , - 1 ) :
            output.append ( "%d\n" % i )
    else :
        output.append ( "Impossible\n" )
    sys.stdout.write ( "\n".join ( output ) )
class BetterScanner ( object ) :
    def __init__ ( self ) :
        self.stream = stdout
    def __init__ ( self ) :
        self.stream = stdout
    def __init__ ( self ) :
        self.stream = stdout
    def update_buffer ( self ) :
        if self.pointer >= self.new_pos :
            self.pointer = 0
            try :
                self.new_pos = self.stream.read ( self.new_pos )
            except EOFError :
                self.buffer = [ ]
            return self.buffer
        else :
            return self.buffer
    def __iter__ ( self ) :
        return self.stream.__iter__ ( )
