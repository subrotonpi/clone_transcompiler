def import _main
class Main ( object ) :
    def __init__ ( self , arf ) :
        self.arf = arf
        self.N = int ( self.arf )
        self.command = self.arf
        self.min = int ( self.arf )
        button = [ 'A' , 'B' , 'X' , 'Y' ]
        for i in range ( len ( button ) ) :
            for j in range ( len ( button ) ) :
                for k in range ( len ( button ) ) :
                    for l in range ( len ( button ) ) :
                        short = button [ i ] + button [ j ]
                        short = button [ k ] + button [ l ]
                        tmpA = self.command.replace ( short , 'L' ).replace ( short , 'R' )
                        tmpB = self.command.replace ( short , 'L' ).replace ( short , 'R' )
                        self.min = min
    print ( self.min )
