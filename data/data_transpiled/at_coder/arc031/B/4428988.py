def import _main
class Main ( object ) :
    def __init__ ( self ) :
        area = 1
        count = 0
        map = [ ]
        def __init__ ( self , area , count ) :
            self.area = area
            self.count = count
        def __call__ ( self , * args ) :
            with open ( "/proc/self/data/" , 'r' ) as sc :
                for i in sc.readlines ( ) :
                    str = sc.readline ( )
                    for j in range ( 10 ) :
                        map [ i ] [ j ] = str [ j ]
                        if map [ i ] [ j ] == 'o' :
                            self.area += 1
    def c ( self ) :
        for i in range ( 10 ) :
            for j in range ( 10 ) :
                count = 0
                check = [ ]
                if map [ i ] [ j ] == 'x' :
                    map [ i ] [ j ] = 'o'
                    meth ( i , j )
                    map [ i ] [ j ] = 'x'
                    if self.flag :
                        break
        if self.flag :
            print ( "YES" )
        else :
            print ( "NO" )
    def meth ( self , h , w ) :
        if h < 0 or w < 0 or h >= 10 or w >= 10 or map [ h ] [ w ] == 'x' :
            return
        if self.check [ h ] [ w ] :
            return
        self.check [ h ] [ w ] = True
        self.count += 1
        if self.count == area :
            self.flag = True
        meth ( self , h + 1 , w )
        meth ( self , h - 1 , w )
        meth ( self , h , w + 1 )
        meth ( self , h , w - 1 )
return Main
