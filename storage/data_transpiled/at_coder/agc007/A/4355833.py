def import java.io.InputStream , myread
from java.io.InputStream import InputStream
from java.io.OutputStream import OutputStream
from java.lang.management import SystemCommand
class MyScanner ( InputStream ) :
    def __init__ ( self ) :
        stream = InputStream ( )
        self.stream = stream
    def read ( self ) :
        ret = 0
        try :
            while True :
                readed = yield from myread ( self.stream )
                if readed < 0 or readed > '9' :
                    break
                ret = ret * 10 + ( readed - '0' )
        except EOFError :
            pass
        finally :
            return ret
class Main ( object ) :
    def __init__ ( self , stream = InputStream ( ) ) :
        self.stream = Stream ( )
    def read ( self ) :
        try :
            while True :
                a = yield from stream.read ( self.stream )
                for c in a :
                    if c == '#' :
                        yield from MyScanner ( self.stream )
        except EOFError :
            pass
        else :
            return
    def write ( self , a ) :
        return a.read ( )
    def read ( self ) :
        return self.stream.read ( )
    def write ( self , a ) :
        return self.stream.write ( a )
    def write ( self , b ) :
        return b.read ( )
