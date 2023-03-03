def gcj2011 ( r3 ) :
    import os
    import time
    import datetime
    import os.text
    import numpy as np
    import time
    import os.path
    import time
    import os.path
    import time
    import sys
    class BLarge ( object , file ) :
        def __init__ ( self , * o ) :
            self.BASEPATH = r' x : \ gcj \ 2011r3\ \'
            self.LARGE = True
        def __init__ ( self , * o ) :
            if self.INPUT != '' : print ( np.deeplize ( o ) )
    def main ( self , * args ) :
        start = time.time ( )
        with open ( self.INPUT , 'r' ) as f :
            f.write ( self.OUTPUT )
            f.flush ( )
            if self.INPUT == '' : print ( 'case %d solved.\t' % ( self.i + 1 ) )
        end = time.time ( )
        print ( ( end - start ) , 'ms' )
    def call ( self ) :
        n = ni ( )
        a = np.arange ( 10002 )
        for i in range ( n ) :
            a [ ni ( ) ] += 1
        if not n :
            self.out.write ( 0 )
            return
        s = [ ]
        e = [ ]
        ps = 0
        pe = 0
        for i in range ( 0 , 10000 ) :
            if a [ i ] < a [ i + 1 ] :
                for j in range ( a [ i + 1 ] - a [ i ] ) :
                    s.append ( i )
            elif a [ i ] > a [ i + 1 ] :
                for j in range ( a [ i ] - a [ i + 1 ] ) :
                    e.append ( i )
        if ps != pe :
            raise Error
        s = np.array ( s )
        e = np.array ( e )
        low = 0
        high = 10001
        while high - low > 1 :
            mid = ( high + low ) // 2
            if ok ( s , e , mid ) :
                low = mid
            else :
                high = mid
        self.out.write ( low )
    