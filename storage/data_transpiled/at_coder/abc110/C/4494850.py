def _import ( ) :
    from sys import stdin
    from struct import Struct
    class Main ( object ) :
        def __init__ ( self ) :
            super ( Main , self ).__init__ ( )
            self.sc = _FastScanner ( )
        def read ( self ) :
            S = self.sc.next ( )
            T = self.sc.next ( )
            map = { }
            S = S.split ( )
            for s , t in T :
                if s in map :
                    if not map [ s ] == t :
                        print ( 'No' )
                        return
                else :
                    if map.has_key ( t ) :
                        print ( 'No' )
                        return
                    else :
                        map [ s ] = t
            print ( 'Yes' )
    class Main ( object ) :
        def __init__ ( self ) :
            self.sc = _FastScanner ( )
            self.sc.next ( )
        def read ( self ) :
            return self.sc.next ( )
        def has_next_byte ( self ) :
            if self.ptr < self.buflen :
                return True
            else :
                self.ptr = 0
                try :
                    buflen = self.sc.next ( )
                except StopIteration :
                    pass
                if self.buflen <= 0 :
                    return False
            return True
        def read ( self ) :
            if self.ptr < self.buflen :
                return self.buf [ self.ptr ]
            else :
                return False
        def startswith ( self ) :
            return 33 <= ord ( self.ptr ) <= 126
        def skip_unprintable ( self ) :
            while self.has_next_byte ( ) and not is_printable_char ( self.buf [ ptr ] ) :
                self.ptr += 1
        def startswith ( self ) :
            return self.buf [ len ( self.buf ) - 1 ]
    return Main
