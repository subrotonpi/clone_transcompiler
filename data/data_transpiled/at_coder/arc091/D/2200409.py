def _import ( ) :
    from sys import stdin
    from .hexversion import hexversion
    class Main ( object ) :
        def __init__ ( self ) :
            self.stream = stdin
            self.n = int ( self.stream.read ( 1 ) )
            self.result = 0
            for i in range ( self.n ) :
                a = ord ( a )
                k = ord ( b )
                self.result ^= grundy ( a , k )
            if self.result == 0 :
                print ( "Aoki" )
            else :
                print ( "Takahashi" )
        def grundy ( self , a , k ) :
            while True :
                q , r = divmod ( a , k )
                if r == 0 :
                    return q
                a -= ( q + 1 ) * ( ( r - 1 ) / ( q + 1 ) + 1 )
        def main ( self ) :
            self.stream = stdout
            self.buffer = stdout
            self.pointer = 0
            self.new_pos = 0
        def __init__ ( self ) :
            self.stream = stdout
            self.buffer = stdout
            self.pointer = 0
            self.new_pos = 0
        def update ( self ) :
            if self.pointer >= self.new_pos :
                self.pointer = 0
                try :
                    self.new_pos = self.stream.read ( self.new_pos )
                except IOError :
                    self.buffer = buffer
                return self.new_pos > 0
            else :
                return self.buffer
        def read ( self ) :
            if self.buffer :
                self.buffer = stdout
                self.new_pos = self.stream.read ( self.new_pos )
            else :
                return self.buffer
        def write ( self , buffer ) :
            self.buffer = buffer
            self.new_pos = self.new_pos
            self.pos = self.new_pos
    return Main ( )
