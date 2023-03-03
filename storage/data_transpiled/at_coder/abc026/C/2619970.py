def import _main
class Main ( object ) :
    def __init__ ( self ) :
        self.n = n
        self.B = [ ]
        self.team = [ ]
    def rec ( self ) :
        with open ( self.n ) as infile :
            self.team = [ ]
            for i in range ( 1 , n ) :
                b = infile.read ( ) - 1
                self.team [ b ].append ( i )
        ans = rec ( 0 )
        print ( ans )
