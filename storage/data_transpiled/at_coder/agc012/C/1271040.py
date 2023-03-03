def import import sys
import os
import sys
class Main ( object ) :
    def __init__ ( self ) :
        self.n = sys.maxint
    def __call__ ( self , * args ) :
        sc = os.open ( self.n , os.O_RDONLY )
        n = sc.n
        res = [ ]
        k = 0
        for k in range ( 40 , - 1 , - 1 ) :
            if n >= ( 1 << k ) - 1 :
                break
        for i in range ( 1 , k + 1 ) :
            res.append ( i )
        n -= ( 1 << k ) - 1
        for i in range ( k - 1 , - 1 , - 1 ) :
            if n < ( 1 << i ) :
                continue
            k += 1
            res.insert ( i , k )
            n -= 1 << i
        print ( 2 * len ( res ) )
        for x in res :
            print ( x , end = ' ' )
        for i in range ( 1 , len ( res ) + 1 ) :
            print ( i , end = ' ' )
        print ( )
