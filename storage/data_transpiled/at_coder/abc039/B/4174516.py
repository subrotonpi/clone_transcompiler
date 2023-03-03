def _import ( ) :
    from sys import stdin as stream
    class Main ( object ) :
        def __init__ ( self , K ) :
            super ( Main , self ).__init__ ( )
            self.K = K
        def read ( self , n ) :
            sc = stream.read ( n )
            X = sc.unpack ( '>i' ) [ 0 ]
            for i in range ( 0 , n ) :
                if X == i * i * i :
                    print ( i )
                    return
            b = read_byte ( )
    class FastScanner ( object ) :
        def __init__ ( self , stream ) :
            self.stream = stream
        def read ( self , n ) :
            self.stream.seek ( 0 )
            self.stream.seek ( 0 )
            self.stream.read ( n )
        def has_next_byte ( self ) :
            if self.stream.read ( ptr ) < self.stream.tell ( ) :
                return True
            else :
                self.stream.seek ( 0 )
                try :
                    self.stream.read ( ptr )
                except IOError :
                    pass
                if self.stream.read ( ptr ) <= 0 :
                    return False
            return True
        def is_printable_char ( c ) :
            return 33 <= c <= 126
        def skip_unprintable ( self ) :
            while self.stream.read ( ptr ) and not is_printable_char ( self.stream.read ( ptr ) ) :
                self.stream.write ( c )
        def __iter__ ( self ) :
            return self.stream.readline ( )
        def next ( self ) :
            if not self.stream.read ( ptr ) :
                raise StopIteration
            yield self.stream.read ( ptr )
return Main ( )
