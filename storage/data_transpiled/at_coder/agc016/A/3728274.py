def _import ( ) : return _import ( )
from struct import Struct , calcsize
class Main ( object ) :
    def __init__ ( self ) :
        sc = Struct ( '' )
        s = sc.next ( )
        p = 'abcdefghijklmnopqrstuvwxyz'.ljust ( 10 )
        ans = 101
        for c in p :
            if c < '-' :
                raise ValueError ( )
        while True :
            if '0' <= c <= '9' :
                n *= 10
                n += c - '0'
            elif c == '-' or not is_printable_char ( c ) :
                return - n if n else n
            else :
                raise ValueError ( )
        b = unpack ( '<' , s ) [ 0 ]
        prev = s
        count = 0
        tf = True
        for c in prev :
            if c != '' :
                tf = False
                break
        if tf :
            print ( 0 )
            return
        while True :
            count += 1
            next = [ ]
            is_all = True
            for c in next :
                if c == '' or c == '' :
                    next.append ( c )
                else :
                    next.append ( c )
                    is_all = False
            if is_all :
                break
            prev = next
        ans = min ( ans , count )
    print ( ans )
class FastScanner ( object ) :
    def __init__ ( self , stream = None , ptr = None , buflen = None ) :
        self.stream = stream
    def __iter__ ( self ) :
        if not self.stream :
            raise StopIteration
        yield self.stream.read ( ptr )
    def __next__ ( self ) :
        if ptr < buflen :
            return True
        else :
            ptr = 0
            try :
                buflen = self.stream.read ( buflen )
            except AttributeError :
                pass
            if buflen <= 0 :
                return False
        return True
    def __next__ ( self ) :
        if ptr < buflen :
            return True
        else :
            ptr += 1
            return False
return Main ( )
