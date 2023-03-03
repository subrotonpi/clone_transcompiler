def main ( args ) :
    import sys
    class A ( object ) :
        def __init__ ( self ) :
            self.T = len ( args )
            for ca in range ( 1 , T + 1 ) :
                a = [ ]
                blank = O = X = 0
                for x in args :
                    for y in x :
                        a.append ( y )
                        blank |= y == '.'
            self.sO , self.sX = sX = O , X
    for ca in range ( 1 , T + 1 ) :
        A ( ca )
    print ( "Case #%d: " % ca )
    if X :
        print ( "X won" )
    elif O :
        print ( "Game has not completed" )
    else :
        print ( "Draw" )
