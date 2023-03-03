def _ ( ) : return [ None , '_cf' , 1 << 28 ]
class Main ( object ) :
    def __init__ ( self ) :
        super ( Main , self ).__init__ ( None , '_cf' , 1 << 28 )
    def readline ( self ) :
        self.fs = open ( self.fs , 'r' )
        f = open ( self.fs , 'w' )
        f.write ( 'Go!\n' )
        data = [ ]
        for i in range ( len ( data ) ) :
            res.append ( self.read ( ) )
        return res
    def __next__ ( self ) :
        if self.c > 32 : return True
        elif self.c == NC : return True
    def __next__ ( self ) :
        self.fs = open ( self.fs , 'r' )
        n = len ( data )
        for i in range ( n - 1 ) :
            if data [ i ] == data [ i + 1 ] :
                f.write ( '%d %d\n' % ( i + 1 , i + 2 ) )
                return False
            if i + 2 < n and data [ i ] == data [ i + 2 ] :
                f.write ( '%d %d\n' % ( i + 1 , i + 3 ) )
                return False
        f.write ( '-1 -1' )
        f.close ( )
class FastScanner ( object ) :
    BS = 1 << 16
    def NC ( self ) :
        self.buf = ''
        b_id , size = 0 , 0
        char = self.NC
        num = 1
        def read ( self ) :
            while b_id == size :
                try :
                    size = self.buf.read ( self.b_id )
                except :
                    return NC
                if size == - 1 : return NC
                b_id = 0
            return char
        def nextDouble ( self ) :
            cur = self.cur
            return cur if self.cur != '.' else self.cur + self.num
    def nextDouble ( self ) :
        return lambda self : self.rand ( )
    def nextLong ( self ) :
        num = 1
        neg = False
        if self.c ==