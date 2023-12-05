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
        n , ans = int ( sc.readline ( ) ) , int ( sc.readline ( ) )
        a = [ int ( i ) for i in sc.readline ( ).split ( ' ' ) ]
        a.sort ( )
        ans = a [ n - 1 ]
        for i in range ( n - 1 , 0 , - 1 ) :
            if a [ i ] > a [ i - 1 ] :
                ans = a [ i - 1 ]
                break
        print ( ans )
