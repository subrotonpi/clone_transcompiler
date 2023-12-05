def _ ( ) : return random.randint ( 0 , 10 )
class Main ( object ) :
    def __init__ ( self ) :
        super ( Main , self ).__init__ ( None , '_cf' , 1 << 28 )
    def next ( self ) :
        self.cur = randint ( 0 , 10 )
        return self.cur if self.cur != '.' else self.cur + randint ( 0 , 10 )
    def readline ( self ) :
        self.res = [ ]
        while self.res <= 32 :
            self.res.append ( self.res )
        return self.res
    def find ( self , n , bad ) :
        if self.res == NC : return False
        elif self.res > 32 : return True
    def next_ints ( self ) :
        self.res = [ ]
        for i in range ( self.res ) :
            self.res.append ( self.res )
        return self.res
    def find ( self , n , bad ) :
        if self.res :
            parse = int ( self.res )
            if parse >= n :
                self.res = min ( self.res , parse )
                return self.res
        for i in bad :
            if not self.res :
                if i == 0 and self.res :
                    self.res = self.res + [ i ]
                    return self.res
                elif i > 0 :
                    self.res = self.res + [ i ]
class Main ( object ) :
    def __init__ ( self ) :
        self.BS = 1 << 16
    def __init__ ( self ) :
        self.NC = ord ( 'a' )
        self.buf = ''
        b_id , size = 0 , 0
        char = NC
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
    def read ( self ) :
        return int ( self.buf )
    def write ( self , s ) :
        return s
