def import import string , glob
import sys
class Main ( object ) :
    def __init__ ( self ) :
        sc = sys.stdin
        N = sc.readline ( ).strip ( )
        s = sc.readline ( )
        max = 0
        a , j = 0 , 0
        c = [ ]
        cc = [ ]
        for i in range ( N ) :
            j = 0
            a = 0
            while j <= i :
                b = s [ j ]
                c.append ( b )
                j += 1
            while j < N :
                d = s [ j ]
                if d in c and d not in cc :
                    a += 1
                    cc.append ( d )
                j += 1
            if a > max : max = a
            c = [ ]
            cc = [ ]
        print ( max )
