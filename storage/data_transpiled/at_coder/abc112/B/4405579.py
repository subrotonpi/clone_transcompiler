def import import sys
import string
import sys
class Main ( object ) :
    def __init__ ( self ) :
        try :
            sc = sys.stdin
        except :
            print ( 'out' )
            return
        n , T = map ( int , sys.stdin.readline ( ).split ( ) )
        c = [ int ( i ) for i in sc.readline ( ).split ( ) ]
        t = [ int ( i ) for i in sc.readline ( ).split ( ) ]
        ans = 1001
        for i in range ( n ) :
            if t [ i ] <= T :
                if c [ i ] < ans :
                    ans = c [ i ]
        if ans == 1001 :
            print ( 'TLE' )
        else :
            print ( ans )
