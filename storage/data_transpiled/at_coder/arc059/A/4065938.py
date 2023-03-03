def _ ( ) : return [ None , '_cf' , 1 << 28 ]
class Main ( object ) :
    def __init__ ( self ) :
        super ( Main , self ).__init__ ( )
        self._cf = 1 << 28
    def __iter__ ( self ) :
        if self._cf : return True
        while True :
            c = self.__next__ ( )
            if c == NC : return False
        else : return True
    def __next__ ( self , n ) :
        res = [ ]
        for i in range ( n ) :
            res.append ( i )
        return res
    def __next__ ( self ) :
        for i in range ( n ) :
            res.append ( next ( res ) )
        return res
    def __next__ ( self ) :
        for i in range ( - 200 , 200 ) :
            ret = 0
            for i in range ( self.__next__ ( ) ) :
                diff = a [ i ] - num
                ret += diff * diff
            res = min ( res , ret )
        return res
    class FastScanner ( object ) :
        def __init__ ( self ) :
            self.BS = 1 << 16
        def __next__ ( self ) :
            self.NC = ord ( '\0' )
            self.buf = ''
            b_id , size = 0 , 0
            char = NC
            num = 1
            def read ( self ) :
                while b_id == size :
                    try :
                        size = self.buf.read ( self.BS )
                    except :
                        return NC
                    if size == - 1 : return NC
                    b_id = 0
                return chr ( self.buf [ b_id ] )
        def __next__ ( self ) :
            num = 1
            neg = False
            if self.NC :
                char = self.__next__ ( )
            for _ in range ( self.BS ) :
                res.append ( char )
            return cur if char != '.' else char
        def nextDouble ( self ) :
            cur = nextLong ( )
            return cur if cur != '.' else cur
