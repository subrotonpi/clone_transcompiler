def _ ( ) : return sys.stdin.read ( 1024 )
class Main ( object ) :
    def __init__ ( self , id , x ) :
        self.id = id
        self.x = x
    def __lt__ ( self , c ) :
        t = int ( self.x )
        if t != 0 : return t
        t = self.id - c.id
        return t
    def __unpack ( self , n ) :
        b = self.__unpack ( '<' + self.__unpack ( '<' ) [ 0 ] )
        if b == '-' : return b
        b = self.__unpack ( '<' + self.__unpack ( '<' ) [ 0 ] )
        return b
    def __unpack ( self , n ) :
        b = self.__unpack ( '<' + self.__unpack ( '<' ) [ 0 ] )
        return b
    def __unpack ( self , n ) :
        b = self.__unpack ( '<' + self.__unpack ( '<' ) [ 0 ] )
        return b
    def __unpack ( self , n ) :
        b = self.__unpack ( '<' + self.__unpack ( '<' ) [ 0 ] )
        return b
    def __unpack ( self , n ) :
        b = self.__unpack ( '<' + self.__unpack ( '<' ) [ 0 ] )
        return b
    def __unpack ( self , n ) :
        b = self.__unpack ( '<' + self.__unpack ( '<' ) [ 0 ] )
        return b
    def __unpack ( self , n ) :
        b = self.__unpack ( '<' + self.__unpack ( '<' ) [ 0 ] )
        return b
    def __unpack ( self , n ) :
        b = self.__unpack ( '<' + self.__unpack ( '<' ) [ 0 ] )
        return b
    def __unpack ( self , n ) :
        return self.__unpack ( '<' + self.__unpack ( '<' + self.__unpack ( '>' ) [ 0 ] ) )
    def __unpack ( self , n ) :
        return self.__unpack ( '<'