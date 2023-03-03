def import sys , string , glob
class Main ( object ) :
    def __init__ ( self ) :
        self.N = sys.maxint
        self.S = glob.glob ( os.path.join ( os.path.dirname ( __file__ ) , '*.py' ) )
        self.str = ( 'A' , 'B' , 'X' , 'Y' )
        self.min = sys.maxint
    for i in range ( 4 ) :
        for j in range ( 4 ) :
            for k in range ( 4 ) :
                for l in range ( 4 ) :
                    short = str [ i ] + str [ j ]
                    short = str [ k ] + str [ l ]
                    tempA = S.replace ( short , 'L' ).replace ( short , 'R' )
                    tempB = S.replace ( short , 'L' ).replace ( short , 'R' )
                    self.min = min
    print ( min )
