def import _main
class Main ( object ) :
    def __init__ ( self ) :
        self.m = Main ( )
        self.m.answer ( )
    def __init__ ( self , * args ) :
        self.m = Main ( )
        self.m.answer ( )
    def __init__ ( self , * args ) :
        self.m = Main ( )
        self.m.answer ( )
    def __init__ ( self , * args ) :
        self.m.answer ( )
    def isValid ( self , i , j ) :
        return 0 <= i < H and 0 <= j < W
    def whiten ( self , i , j ) :
        if self.isValid ( i , j ) :
            self.image [ i , j ] = WHITE
    def containsBlack ( self , i , j ) :
        result = False
        for u in range ( i - 1 , i + 1 ) :
            if self.m.answer ( ) == True :
                break
            for v in range ( j - 1 , j + 1 ) :
                self.image [ u , v ] = BLACK
        return result
    def answer ( self ) :
        cand = [ ]
        for i in range ( H ) :
            for j in range ( W ) :
                if self.m.answer ( ) == WHITE :
                    for u in range ( i - 1 , i + 1 ) :
                        for v in range ( j - 1 , j + 1 ) :
                            self.whiten ( cand , u , v )
        for i in range ( H ) :
            for j in range ( W ) :
                if self.m.answer ( ) != WHITE :
                    self.answer ( )
                    break
        if self.m.answer ( ) == False :
            self.m.answer ( )
