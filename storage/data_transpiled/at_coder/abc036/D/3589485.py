def import _main
class Main ( object ) :
    mod = 1000000000 + 7
    def __init__ ( self , mod ) :
        self.mod = mod
        self.map = [ ]
        self.white = [ ]
        self.black = [ ]
    def main ( self ) :
        sc = _main ( )
        n = int ( sc.value )
        self.map = [ ]
        for i in range ( 0 , n + 1 ) :
            self.map.append ( [ ] )
        self.black = [ ]
        self.white = [ ]
        for i in range ( 1 , n + 1 ) :
            a , b = map [ i ]
            self.map [ a ].append ( b )
            self.map [ b ].append ( a )
