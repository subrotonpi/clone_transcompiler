def import _main
class Main ( object ) :
    area = 1
    count = 0
    def __init__ ( self , area , count ) :
        self.map = [ ]
    def __init__ ( self , flag = False ) :
        with open ( "/proc/self/" , "r" ) as sc :
            for i in range ( 10 ) :
                str = sc.read ( )
                for j in range ( 10 ) :
                    self.map [ i ] [ j ] = str [ j ]
                    if self.map [ i ] [ j ] == "o" :
                        self.area += 1
    def c ( self ) :
        for i in range ( 10 ) :
            for j in range ( 10 ) :
                if self.map [ i ] [ j ] == "x" :
                    self.count = 0
                    self.check = [ ]
                    self.map [ i ] [ j ] = "o"
                    meth ( i , j )
                    self.map [ i ] [ j ] = "x"
                    if self.flag :
                        break
        if self.flag :
            print ( "YES" )
        else :
            print ( "NO" )
    def meth ( self , h , w ) :
        if h < 0 or w < 0 or h >= 10 or w >= 10 or self.map [ h ] [ w ] == "x" :
            return
        if self.check [ h ] [ w ] :
            return
        self.check [ h ] [ w ] = True
        self.count += 1
        if self.count == self.area :
            self.flag = True
        meth ( self , h + 1 , w )
        meth ( self , h - 1 , w )
        meth ( self , h , w + 1 )
        meth ( self , h , w - 1 )
