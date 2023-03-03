def _import ( ) : return ''
class Main ( object ) :
    def __init__ ( self ) :
        super ( FastScanner , self ).__init__ ( )
        def q ( self , n ) :
            print ( '? ' , n )
            sys.stdout.flush ( )
            return self.next ( ) == 'Y'
        def next ( self ) :
            if not self.hasNext ( ) :
                raise StopIteration
            s = [ ]
            while self.next ( ) :
                s.append ( self.next ( ) )
            return s
        def next ( self ) :
            return self.next ( )
        def next_int_list ( self , n ) :
            return self.next_int_list ( 1 , n ) [ 0 ]
        def next_int_list ( self , m ) :
            ret = [ ]
            for i in range ( m ) :
                ret.append ( self.next ( ) )
            return ret
        def next ( self ) :
            if not self.hasNext ( ) :
                raise StopIteration
            while self.next ( ) :
                n += 1
            if self.next ( ) == '-' :
                minus = True
            if self.next ( ) == '0' or self.next ( ) == '9' :
                raise StopIteration
            while True :
                if self.next ( ) == '0' :
                    n *= 10
                    n += 1
                elif self.next ( ) == - 1 or not is_printable_char ( self.next ( ) ) :
                    return - n if minus else n
                else :
                    raise StopIteration
    def next_int_list ( self , n ) :
        ret = [ ]
        for i in range ( n ) :
            ret.append ( self.next ( ) )
        return ret
    def next_int_list ( self , m ) :
        ret = [ ]
        for i in range ( m ) :
            ret.append ( self.next ( ) )
        return ret
    def next_int_list ( self , n ) :
        ret = [ ]
        for i in range ( m ) :
            ret.append ( self.next ( ) )
        return ret
