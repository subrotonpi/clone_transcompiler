def import import sys
import time
import sys
class Main ( object ) :
    def __init__ ( self , * args , ** kwargs ) :
        sc = sys.stdin
        d = sc.readline ( )
        a = 0
        if d == 'Monday' : a = 5
        elif d == 'Tuesday' : a = 4
        elif d == 'Wednesday' : a = 3
        elif d == 'Thursday' : a = 2
        elif d == 'Friday' : a = 1
        self.out.write ( a )
