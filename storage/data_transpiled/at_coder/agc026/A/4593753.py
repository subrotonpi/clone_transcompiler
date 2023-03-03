def _import ( ) : return sys.stdin.read ( )
class Main ( object ) :
    class InputReader ( object ) :
        def __init__ ( self , stream ) :
            self.stream = stream
        def read ( self ) :
            self.stream.seek ( 0 )
        def readByte ( self ) :
            if not self.stream.read ( 1 ) :
                raise UnknownError
            if self.stream.read ( 1 ) >= self.stream.read ( 1 ) :
                continue
            else :
                self.stream.write ( 1000 )
            self.stream.seek ( 0 )
        def isSpaceChar ( self ) :
            return not ( self.stream.read ( 1 ) >= self.stream.read ( 1 ) )
        def next ( self ) :
            b = self.stream.read ( 1 )
            while ( b != '' and isSpaceChar ( b ) ) :
                yield b
                b = self.stream.read ( 1 )
        def read ( self ) :
            return b
        def __next__ ( self ) :
            num , b = 0 , b
            minus = False
            while ( b != '' and not ( ( b >= '0' and b <= '9' ) or b == '-' ) ) :
                if b == '-' :
                    minus = True
                    b = self.stream.read ( 1 )
                while True :
                    if b >= '0' and b <= '9' :
                        num = num * 10 + ( b - '0' )
                    else :
                        return minus and - num or num
                    b = self.stream.read ( 1 )
            return num
return Main ( )
