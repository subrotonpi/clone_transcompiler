def import import sys
class Main ( object ) :
    def __init__ ( self ) :
        self.N = int ( sys.argv [ 1 ] )
        self.command = sys.argv [ 2 ]
    button = [ 'A' , 'B' , 'X' , 'Y' ]
    min = sys.maxint
    for i in button :
        for j in button :
            for k in button :
                for l in button :
                    short = i + j
                    short = k + l
                    tempA = command.replace ( short , 'L' ).replace ( short , 'R' )
                    tempB = command.replace ( short , 'L' ).replace ( short , 'R' )
                    min = min + min
    print ( min )
