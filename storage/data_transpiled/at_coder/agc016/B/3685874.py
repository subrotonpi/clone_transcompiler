def _import ( ) : return _import ( "" , "" )
class Main ( object ) :
    def __init__ ( self , args ) :
        super ( Main , self ).__init__ ( )
        self.args = args
    def read ( self ) :
        if not self.hasNext ( ) :
            raise StopIteration
        n = self.__next__ ( )
        if self.__next__ ( ) :
            minus = True
            self.__next__ ( )
        if self.__next__ ( ) < '0' or self.__next__ ( ) :
            raise ValueError ( )
        while self.__next__ ( ) < '0' :
            self.__next__ ( )
            self.__next__ ( )
        if self.__next__ ( ) == '0' :
            self.__next__ ( )
        if self.__next__ ( ) == - 1 or self.__next__ ( ) == - 1 or not is_printable_char ( self.__next__ ( ) ) :
            return int ( self.__next__ ( ) ) - n
        else :
            raise ValueError ( )
    def __next__ ( self ) :
        low = self.__next__ ( )
        if self.__next__ ( ) > low + 1 :
            self.__next__ ( )
            return low
        lower = 0
        for i in range ( self.__next__ ( ) ) :
            if self.__next__ ( ) == low :
                lower += 1
        higher = self.__next__ ( )
        if higher == 1 :
            self.__next__ ( )
            return low
        if higher == 0 :
            if self.lower == N - 1 or self.__next__ ( ) <= N // 2 :
                self.__next__ ( )
            else :
                self.__next__ ( )
        else :
            max = lower + ( higher // 2 )
            min = lower + 1
            if min <= low + 1 <= max :
                self.__next__ ( )
                return low
class FastScanner ( object ) :
    def __init__ ( self , buffer ) :
        self.buffer = buffer
        self.ptr = 0
        self.buflen = 0
    def __next__ ( self ) :
        if self.__next__ ( ) :
            raise StopIteration ( )
return
