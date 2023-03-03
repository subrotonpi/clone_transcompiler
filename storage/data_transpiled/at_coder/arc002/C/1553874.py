def import _input
class Main ( object ) :
    def __init__ ( self ) :
        self.n = 0
        self.command = _input ( )
    def main ( self ) :
        self.input ( )
        min = sys.maxint
        button = [ 'A' , 'B' , 'X' , 'Y' ]
        for i in button :
            for j in button :
                for k in button :
                    for l in button :
                        short = i + j + k
                        short = k + l
                        tmpA = self.command.replace ( short , 'L' ).replace ( short , 'R' )
                        tmpB = self.command.replace ( short , 'L' ).replace ( short , 'R' )
                        min = min + min + min + min + len ( tmpA )
        print ( min )
