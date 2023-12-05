def import sys , string , traceback , time
class Main ( object ) :
    def __init__ ( self ) :
        self.raw_input = string
        self.x = 0
        self.y = 0
        self.x1 = 0
        self.y1 = 0
        self.N = len ( sys.argv )
        t = [ 0 , 0 ]
        a = None
        hantei = None
        for i in range ( N ) :
            t [ 0 ] , t [ 1 ] = t [ 1 ] , t [ 1 ]
            x1 , y1 = t [ 0 ] , t [ 1 ]
            a = ( ( t [ 1 ] - t [ 0 ] ) - ( abs ( x1 - x ) + abs ( y1 - y ) ) )
            if a >= 0 and a % 2 == 0 :
                hantei = True
            else :
                hantei = False
                break
            self.x = x1
            self.y = y1
        if hantei :
            print ( "Yes" )
        else :
            print ( "No" )
