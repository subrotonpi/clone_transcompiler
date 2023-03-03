def _import ( ) :
    import sys
    import struct
    class Main ( ) :
        def solve ( self ) :
            n = randint ( 0 , 1024 )
            ans = 0
            for i in range ( n ) :
                temp = next ( self )
                if temp == 'TAKAHASHIKUN' or temp == 'Takahashikun' or temp == 'takahashikun' :
                    ans += 1
                elif temp == 'TAKAHASHIKUN.' or temp == 'Takahashikun.' or temp == 'takahashikun.' :
                    ans += 1
            self.write ( ans )
        def read ( self ) :
            if not self.has_key ( '-' ) : raise StopIteration
            n = 0
            while self.has_key ( '-' ) :
                temp = self.read ( 1 )
            if temp == '0' or temp == '' :
                raise StopIteration
            n = 0
            while self.has_key ( '-' ) :
                temp = self.read ( 1 )
            if not self.has_key ( '-' ) :
                raise StopIteration
            yield temp
            n += 1
    def write ( self , out ) :
        self.write ( out )
        with open ( '/dev/null' , 'w' ) as f :
            f.write ( out )
    def write ( self , out ) :
        self.write ( out )
    def write ( self , out ) :
        self.write ( out )
    def write ( self , out ) :
        self.write ( out )
    def write ( self , out ) :
        self.write ( out )
