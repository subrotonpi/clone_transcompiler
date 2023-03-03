def _import ( ) :
    from ..utils import _readline
    from ..utils import _readline
    class Main ( object ) :
        @ staticmethod
        def __next__ ( self ) :
            scanner = BetterScanner ( sys.stdin )
            n = scanner.__next__ ( )
            aa = scanner.__next__ ( )
            num1 = 0
            num2 = 0
            num4 = 0
            for i in range ( n ) :
                if aa [ i ] % 4 == 0 :
                    num4 += 1
                elif aa [ i ] % 2 == 0 :
                    num2 += 1
                else :
                    num1 += 1
            p = False
            if num2 == 0 :
                p = num1 <= num4 + 1
            else :
                p = num1 <= num4
            print ( ( "Yes" if p else "No" ) )
    def main ( ) :
        class Main ( object ) :
            def __init__ ( self , stream ) :
                self.stream = stream
            def __init__ ( self , pointer = 0 ) :
                self.stream = stream
            def update_buffer ( self ) :
                if self.pointer >= self.stream.size :
                    pointer = 0
                    try :
                        self.stream.seek ( self.stream.size )
                    except IOError as exception :
                        traceback.print_exc ( )
                    return self.stream.read ( self.stream.size )
                else :
                    return self.stream.read ( self.stream.size )
            def __next__ ( self ) :
                self.stream.seek ( pointer )
                self.stream.seek ( 0 )
                return self.stream.read ( self.stream.size )
            def __next__ ( self ) :
                self.stream.seek ( pointer )
                self.stream.seek ( 0 )
                return self.stream.read ( self.stream.size )
        def __next__ ( self ) :
            if self.stream.size == 0 :
                minus = True
                self.stream.seek ( 0 )
                self.stream.seek ( 0 )
                return self.stream.read ( self.stream.size )
            else :
                raise StopIteration
    return Main
