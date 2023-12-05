def import _chal
class Main ( object ) :
    def __init__ ( self ) :
        self.N = len ( sys.argv )
        s = sys.stdin.read ( )
        self.ori = [ ]
        for i in range ( self.N ) :
            if s [ i ] == 'o' :
                self.ori.append ( 1 )
            else :
                self.ori.append ( - 1 )
        res = [ ]
        res.append ( 0 )
        res.append ( 1 )
        res.append ( 1 )
        if self.chal ( res ) :
            self.out ( res )
            return
        res.append ( 0 )
        res.append ( 1 )
        res.append ( - 1 )
        if self.chal ( res ) :
            self.out ( res )
            return
        res.append ( 0 )
        res.append ( - 1 )
        res.append ( 1 )
        if self.chal ( res ) :
            self.out ( res )
            return
        res.append ( - 1 )
        res.append ( - 1 )
        if self.chal ( res ) :
            self.out ( res )
            return
        print ( - 1 )
    def chal ( res ) :
        for i in range ( 1 , self.N - 1 ) :
            res [ i + 1 ] = res [ i - 1 ] * res [ i ] * ori [ i ]
        if res [ self.N - 2 ] * res [ self.N - 1 ] * ori [ self.N - 1 ] == res [ 0 ] and res [ self.N - 1 ] * res [ 0 ] * ori [ 0 ] == res [ 1 ] :
            return True
        return False
    def out ( res ) :
        for i in range ( self.N ) :
            if res [ i ] == 1 :
                c = 'S'
            else :
                c = 'W'
            print ( c , end = '' )
        print ( '' )
