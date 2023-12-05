def _import ( ) : return _import ( )
from itertools import count , repeat
from itertools import chain , repeat
class Main ( object ) :
    def __init__ ( self , stream ) :
        super ( Main , self ).__init__ ( stream )
        stream.seek ( 0 )
        stream.seek ( 0 )
        N = stream.read ( 1 )
        K = stream.read ( 1 )
        maxdel = [ ]
        inf = 100000000000.
        for i in range ( N ) :
            maxdel.append ( - 1 * inf )
    def read ( ) :
        if not stream.read ( 1 ) :
            stream.seek ( 0 )
        if stream.read ( 1 ) == '-' :
            stream.seek ( 0 )
        while stream.read ( 1 ) == '-' :
            stream.seek ( 0 )
        if stream.read ( 1 ) == '-' :
            stream.seek ( 0 )
        if stream.read ( 1 ) == '-' :
            stream.seek ( 0 )
        elif stream.read ( 1 ) == '-' or not is_printable_char ( stream.read ( 1 ) ) :
            stream.seek ( 0 )
        stream.seek ( 0 )
    def write ( self , data ) :
        if not stream.read ( 1 ) :
            stream.seek ( 0 )
        data = data.read ( 1024 )
        ptr = 0
        buflen = 0
        def has_next_byte ( ) :
            if ptr < buflen :
                return True
            else :
                ptr = 0
                try :
                    buflen = stream.read ( len ( data ) )
                except AttributeError :
                    pass
                if buflen <= 0 :
                    return False
            return True
        def read ( ) :
            if ptr < buflen :
                return data [ ptr ]
            else :
                return False
        def startswith ( self , s ) :
            return s [ 0 ]
    return Main ( )
