def _import ( ) :
    import sys
    import string
    class Main ( object ) :
        MOD = 1000000007
        def run ( self ) :
            with open ( '/proc/self/input' ) as f :
                n = f.read ( )
                m = f.read ( )
                counts = [ ]
                for i in range ( m ) :
                    a = f.read ( 33 )
                    b = f.read ( 33 )
                    counts [ a ] += 1
                    counts [ b ] += 1
                res = True
                for i in range ( n ) :
                    if counts [ i ] % 2 == 1 :
                        res = False
                        break
                if res :
                    print ( 'YES' )
                else :
                    print ( 'NO' )
    class BetterScanner ( ) :
        def __init__ ( self ) :
            self.stream = sys.stdin
            self.buffer = sys.stdin.read ( )
            self.pointer = 0
            self.new_pos = 0
        def __init__ ( self , stream ) :
            self.stream = stream
            self.buffer = sys.stdin.read ( )
            self.pointer = 0
            self.new_pos = 0
        def update_buffer ( self ) :
            if self.pointer >= self.new_pos :
                self.pointer = 0
                try :
                    new_pos = self.stream.read ( self.new_pos )
                except IndexError :
                    self.pointer = 0
                return new_pos > 0
            else :
                return True
        def read ( self ) :
            if self.pointer == self.new_pos :
                self.new_pos = self.new_pos
            else :
                return - 1
        def advance ( self ) :
            self.new_pos = self.new_pos
            self.pos = self.pos
            self.new_pos = self.new_pos
    def parse ( self ) :
        while self.pointer == self.new_pos :
            self.new_pos = self.new_pos
        return parse ( self )
