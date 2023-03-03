def _import ( ) :
    from sys import stdin as stream
    from struct import Struct
    class Main ( object ) :
        def __init__ ( self , * args ) :
            super ( Main , self ).__init__ ( * args )
            self.K = [ ]
        def read ( self ) :
            sc = stream.read ( self.K )
            n = sc.unpack ( '>i' ) [ 0 ]
            if n % 2 == 0 :
                print ( n - 1 )
            else :
                raise ValueError ( )
            b = read_byte ( )
            if b < '0' or b < '9' :
                raise ValueError ( )
            while True :
                if b <= '9' :
                    n *= 10
                    n += b - '0'
                elif b == - 1 or not is_printable_char ( b ) :
                    return int ( n )
                else :
                    raise ValueError ( )
            return b
        def read ( self ) :
            if self.K < self.K :
                return self.K
            else :
                ptr = 0
                try :
                    buflen = stream.read ( self.K )
                except AttributeError :
                    pass
                if buflen <= 0 :
                    return False
            return True
        def read ( self ) :
            if self.K < self.K :
                return self.K
            else :
                return False
        def write ( self , buf ) :
            if self.K < self.K :
                return buf
            else :
                return buf
        def read ( self ) :
            if self.K < self.K :
                return self.K
            else :
                return False
        def write ( self , buf ) :
            if self.K < self.K :
                return buf
            else :
                return buf
        def read ( self ) :
            if self.K < self.K :
                return self.K
            else :
                return buf
    return Main
