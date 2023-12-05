def _import ( ) :
    from sys import stdin as stream
    from .py3compat import PY3
    class Main ( object ) :
        def __next__ ( self ) :
            sc = stream.next ( )
            S = sc.next ( ) + " "
            nc = '.'
            now = 0
            for c in S :
                if nc != c :
                    if now :
                        print ( nc , end = ' ' )
                        print ( now , end = ' ' )
                    nc = c
                    now = 1
                else :
                    now += 1
            print ( )
    class FastScanner ( object ) :
        def __init__ ( self , stream ) :
            stream.next ( )
        def __next__ ( self ) :
            if self.ptr < self.buflen :
                return True
            else :
                self.ptr = 0
                try :
                    buflen = stream.next ( )
                except StopIteration :
                    pass
                if buflen <= 0 :
                    return False
            return True
        def __next__ ( self ) :
            if self.ptr < self.buflen :
                return True
            else :
                self.ptr = ptr
                try :
                    self.buflen = stream.next ( )
                except StopIteration :
                    pass
                if self.ptr <= 0 :
                    return False
            return True
        def __next__ ( self ) :
            return 33 <= self.ptr <= 126
        def skip_unprintable ( self ) :
            while self.ptr < 0 and not is_printable ( self.ptr ) :
                self.ptr += 1
        def __next__ ( self ) :
            return True
        def __next__ ( self ) :
            if self.ptr < 0 :
                raise StopIteration
            yield self.ptr
    def __next__ ( self ) :
        if self.ptr < 0 :
            raise StopIteration
        s = [ ]
        b = next ( )
        while self.ptr < 0 :
            s.append ( b )
            b = next ( )
        return s
