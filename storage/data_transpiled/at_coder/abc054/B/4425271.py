def import sys , string
class Main ( object ) :
    def __init__ ( self ) :
        self.n = int ( sys.stdin.readline ( ).split ( '\n' ) [ 0 ] )
        self.m = int ( sys.stdin.readline ( ).split ( '\n' ) [ 0 ] )
        self.po = [ ]
        self.p = [ ]
        for a in string.split ( '\n' ) :
            s = a.split ( '' , 1 )
            for j in range ( self.n ) :
                self.po.append ( [ s [ j ] , ( s [ j ] == '#' ) ] )
    def __init__ ( self ) :
        self.po = [ ]
        self.p = [ ]
        for a in string.split ( '\n' ) :
            s = a.split ( '\n' , 1 )
            for j in range ( self.m ) :
                self.p.append ( [ s [ j ] , ( s [ j ] == '#' ) ] )
        self.b , b2 = False , True
        for i in range ( self.n - self.m + 1 ) :
            for j in range ( self.n - self.m + 1 ) :
                b2 = True
                for k in range ( self.m ) :
                    for l in range ( self.m ) :
                        if self.po [ i + k ] [ j + l ] != self.p [ k ] [ l ] :
                            b2 = False
                if b2 :
                    self.b = True
                    break
            if self.b2 :
                break
        print ( 'Yes' if b else 'No' )
