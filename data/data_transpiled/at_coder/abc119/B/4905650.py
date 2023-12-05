def import re
class Main ( object ) :
    def __init__ ( self ) :
        self.sc = sys.stdin
        self.N = self.sc.count ( )
        self.list = [ ]
        for s in range ( self.N ) :
            for t in range ( 2 ) :
                self.list.append ( [ s , t ] )
        self.sum = 0
        for i in range ( self.N ) :
            if re.match ( "JPY" , i ) :
                self.sum += float ( self.list [ i ] [ 0 ] )
            else :
                self.sum += float ( self.list [ i ] [ 0 ] ) * 380000
        print ( self.sum )
