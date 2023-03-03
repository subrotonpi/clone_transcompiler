def import import datetime
import time
import datetime
import os
import time
import sys
class Main ( object ) :
    def __init__ ( self ) :
        sc = sys.stdin
        s = sc.readline ( )
        h = 'Heisei'
        t = 'TBD'
        c = datetime.now ( )
        f = datetime.strptime ( '2019/05/01' , '%Y/%m/%d' )
        d = f.date ( )
        if f.date ( ) < d :
            print ( h )
        else :
            print ( t )
