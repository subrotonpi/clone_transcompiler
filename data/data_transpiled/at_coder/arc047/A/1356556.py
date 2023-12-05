def _import ( ) :
    from sys import stdin as stream
    from io import BytesIO
    from io import BytesIO
    from io import BytesIO
    class Main ( object ) :
        def read ( self ) :
            if not hasNext ( self ) :
                raise StopIteration
            n = 0
            minus = False
            byte = read_byte ( )
            if byte == '-' :
                minus = True
                byte = read_byte ( )
            if byte < '0' or byte <= '9' :
                raise ValueError
            while True :
                if byte == '+' :
                    tab += 1
                    if tab > l :
                        count += 1
                        tab = 1
                elif byte == '-' :
                    tab -= 1
                    tab = max ( 1 , tab )
                    break
            stream.write ( count )
            stream.flush ( )
    class FastScanner ( object ) :
        def __init__ ( self , stream = stream ) :
            stream = stream.read ( 1024 )
            self.stream = stream
        def read ( self ) :
            return self.stream.read ( )
        def has_next_byte ( self ) :
            if self.stream.read ( self.stream.size ) < self.stream.size :
                return True
            else :
                self.stream.seek ( self.stream.tell ( ) )
                return False
        def write ( self , data ) :
            if self.stream.read ( self.stream.size ) < self.stream.size :
                return False
            while True :
                if self.stream.read ( self.stream.size ) < self.stream.size :
                    return True
                else :
                    self.stream.seek ( self.stream.tell ( ) )
                    return data [ self.stream.tell ( ) : self.stream.size ]
        def write ( self , data ) :
            if self.stream.read ( self.stream.size ) < self.stream.size :
                return False
            else :
                return data
    return Main ( )
