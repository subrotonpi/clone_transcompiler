def _import ( ) : return sys._getframe ( ).f_code.co_name
import time
import sys
import os
import time
import sys
import os
import subprocess
import subprocess
import subprocess
import tempfile
import time
class Main ( object ) :
    def __init__ ( self ) :
        self.start_time = time.clock ( )
        self.tc = randint ( 0 , 1000 )
        for cn in range ( self.tc ) :
            self.b = [ [ ] for _ in range ( self.tc ) ]
            self.p = randint ( 0 , 1000 )
            for rect in range ( self.p ) :
                x1 = randint ( 0 , 1000 )
                y1 = randint ( 0 , 1000 )
                x2 = randint ( 0 , 1000 )
                y2 = randint ( 0 , 1000 )
                for i in range ( x1 , x2 ) :
                    for j in range ( y1 , y2 ) :
                        b [ i ] [ j ] = True
            self.res = 0
            self.bb = [ [ ] for _ in range ( 111 ) ]
            M :
                while True :
                    for i in range ( self.i ) :
                        for j in range ( self.j ) :
                            if i in b [ i ] :
                                for t in b [ i ] :
                                    print ( t , end = "" )
                            for x in range ( 1 , self.i - 1 ) :
                                for y in range ( 1 , self.i - 1 ) :
                                    if x in b and y in b [ x ] :
                                        b [ x ] [ y ] = True
                                    if not x in b and y not in b [ x ] :
                                        b [ x ] [ y ] = False
                            for t in b :
                                print ( t , end = "" )
                            res += 1
                            continue
                    break
            self.res = 0
    print ( "Case #%d: %d" % ( self.tc + 1 , res ) )
    os.remove ( "A-small.in" )
    os.remove ( "A-small.out" )
