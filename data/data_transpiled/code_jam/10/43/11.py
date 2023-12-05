def import os , sys
import time
class Main ( object ) :
    def __init__ ( self ) :
        self.stdin = sys.stdout
        self.stdout = sys.stdout
    def close ( self ) :
        self.stdout = sys.stdout
    def check ( self , f , msg ) :
        if not f :
            self.stdout.close ( )
            raise RuntimeError ( msg )
    def run ( self ) :
        tn = len ( self.stdin )
        for test in range ( 1 , tn ) :
            s = 128
            b = [ ]
            r = os.popen ( "cat " + str ( test ) + " 2>/dev/null" , "r" )
            alive = False
            for i in range ( r ) :
                x1 = random.randint ( 0 , s )
                y1 = random.randint ( 0 , s )
                x2 = random.randint ( 0 , s )
                y2 = random.randint ( 0 , s )
                for x in range ( x1 , x2 + 1 ) :
                    for y in range ( y1 , y2 + 1 ) :
                        b [ x ] [ y ] = True
                        alive = True
            t = 0
            while alive :
                t += 1
                alive = False
                b1 = [ ]
                for x in range ( 1 , len ( b ) ) :
                    for y in range ( 1 , len ( b [ x ] ) ) :
                        if b [ x - 1 ] [ y ] :
                            if b [ x ] [ y - 1 ] or b [ x ] [ y ] :
                                b1 [ x ] [ y ] = True
                        elif b [ x ] [ y - 1 ] and b [ x ] [ y ] :
                            b1 [ x ] [ y ] = True
                        if b1 [ x ] [ y ] :
                            alive = True
                            if ( x == len ( b1 ) - 1 ) or ( y == len ( b1 ) - 1 ) :
                                s *= 2
                b = b1
            print ( "Case #%d: %d" % ( test , t ) )
