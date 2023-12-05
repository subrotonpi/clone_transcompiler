def import _main
class Main ( object ) :
    def __init__ ( self ) :
        self.initialize ( )
        N = self.__next__ ( )
        converted_num = [ ]
        for i in range ( N ) :
            converted_num.append ( self.convert ( self.__next__ ( ) ) )
        converted_num.sort ( )
        for num in converted_num :
            print ( self.deconvert ( num ) )
    def initialize ( self ) :
        sc = _main.getScanner ( )
        for i in range ( len ( self.numbers ) ) :
            numbers [ i ] = sc.__next__ ( )
        for i in range ( len ( self.numbers ) ) :
            invers [ self.numbers [ i ] ] = i
    def convert ( self , num ) :
        m , p = self.numbers [ num ]
        ret = 0
        for i in range ( 0 , len ( self.numbers ) ) :
            p = m % 10
            m //= 10
            ret += self.invers [ p ] * pow ( 10 , i )
        return ret
    def deconvert ( self , num ) :
        m , p = self.numbers [ num ]
        ret = 0
        for i in range ( 0 , len ( self.numbers ) ) :
            p = m % 10
            m //= 10
            ret += self.numbers [ p ] * pow ( 10 , i )
        return ret
