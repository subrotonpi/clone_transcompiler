def _ _ main _ _ ( ) : return
class Main ( object ) :
    def __init__ ( self ) :
        self.stdin = open ( 'stdin' , 'w' )
        self.stdout = open ( 'stdout' , 'w' )
    def close ( self ) :
        self.stdout.close ( )
    def check ( self , f , msg ) :
        if not f :
            self.stdout.close ( )
            raise RuntimeError ( msg )
    def move ( self , b , d , t ) :
        for i in range ( - 1 , 1 ) :
            if self.x [ b ] + i * dx [ d ] >= t or self.y [ b ] + i * dy [ d ] >= t [ 0 ] :
                return None
        for j in range ( 0 , len ( self.x ) ) :
            if self.x [ j ] == self.x [ b ] + i * dx [ d ] == t [ 0 ] :
                return None
        if self.y [ b ] + i * dy [ d ] == t [ 0 ] :
            return None
        if self.x [ b ] + i * dx [ d ] >= t [ 0 ] :
            return None
        if self.y [ b ] + i * dy [ d ] >= t [ 0 ] :
            return None
    def move ( self , b , d , t ) :
        for i in range ( 0 , len ( self.x ) ) :
            t = self.x [ i ]
            n = self.y [ i ]
            sort ( )
    def move ( self , b , d , t ) :
        for i in range ( 0 , len ( self.x ) ) :
            for t in self.x [ i ] :
                if t == our or t == 'w' :
                    n += 1
        self.x = [ ]
        self.y = [ ]
        l = 0
        cur = 0
        for i in range ( 0 , len ( self.x ) ) :
            for j in range ( 0 , len ( self.x [ i ] ) ) :
                if self.x [ i ] == self.x [ j ] and self.y [ j ] == t :