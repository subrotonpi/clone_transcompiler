def _import ( ) :
    from sys import stdin
    from .hexversion import hexversion
    class Main ( object ) :
        @ always_comb
        def __next__ ( self ) :
            scanner = BetterScanner ( sys.stdin )
            n = scanner.__next__ ( )
            aa = [ scanner.next ( ) for i in range ( n ) ]
            if isinstance ( number , int ) :
                return number
            else :
                raise ValueError
    def isPrintableChar ( codePoint ) :
        return codePoint >= 33 and codePoint <= 126
    aa = [ ]
    for i in range ( 1 , n + 1 ) :
        if i < n and aa [ i - 1 ] == aa [ i ] :
            cur += 1
        else :
            num += cur - 1
            cur = 1
    if num == 0 :
        print ( n )
    else :
        print ( n - 2 * ( ( num - 1 ) / 2 + 1 ) )
    def main ( ) :
        class Main ( object ) :
            def __init__ ( self ) :
                self.stream = sys.stdin
            def buffer ( self ) :
                self.pointer = 0
                self.new_pos = 0
            def update ( self ) :
                if self.pointer >= self.new_pos :
                    self.pointer = 0
                    try :
                        self.new_pos = self.stream.read ( self.new_pos )
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
            def advance ( self ) :
                self.new_pos = self.buffer [ self.pointer ]
        def advance ( self ) :
            if self.new_pos == 0 :
                self.number = 0
                self.minus = False
                self.new_pos = self.stream.read ( self.new_pos )
            else :
                self.new_pos = self.buffer [ self.pointer ]
            return self.new_pos
    return Main
