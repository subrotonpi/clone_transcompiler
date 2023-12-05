def _import ( ) :
    from sys import stdin
    from struct import Struct , calcsize , unpack
    mod = 1000000007
    class Main ( object ) :
        def __init__ ( self , buf ) :
            super ( Main , self ).__init__ ( )
            self.buf = buf
            self.mod = mod
            self.n = ord ( buf [ 0 ] )
            self.a = [ ]
            self.time = [ ]
            for i in range ( self.n + 1 ) :
                self.a.append ( ord ( buf [ i ] ) - 1 )
                self.time.append ( ord ( buf [ i ] ) )
        def __next__ ( self ) :
            self.n = 0
            self.b = self.readByte ( )
            if self.b == '-' :
                self.minus = True
                self.b = self.readByte ( )
            elif self.b == '-' :
                self.minus = False
                self.b = self.readByte ( )
            elif self.b == '-' :
                self.minus = False
                self.b = self.readByte ( )
            else :
                raise ValueError ( )
        def __next__ ( self ) :
            self.b = self.readByte ( )
            self.a.append ( ord ( buf [ i ] ) )
            self.time.append ( ord ( buf [ i ] ) )
    def __next__ ( self ) :
        self.n = 0
        self.b = self.readByte ( )
        if self.b == '-' :
            self.minus = True
            self.b = self.readByte ( )
        elif self.b == '-' :
            self.minus = False
            self.b = self.readByte ( )
        elif self.b == '-' :
            self.minus = False
            self.b = self.readByte ( )
        else :
            raise ValueError ( )
    def __next__ ( self ) :
        self.n = 0
        self.b = self.readByte ( )
        self.time.append ( ord ( buf [ i ] ) )
    def __next__ ( self ) :
        self.n = 0
        self.b = self.readByte ( )
    return Main
