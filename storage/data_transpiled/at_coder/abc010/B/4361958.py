def import import sys
import string
import sys
class Main ( object ) :
    def __init__ ( self ) :
        self.out = string
    def __call__ ( self , * args ) :
        try :
            sc = sys.stdin
        except :
            print ( "out" )
            return
        n , ans = 0 , 0
        n = int ( sc.read ( ) )
        a = [ int ( i ) for i in sc.read ( ).split ( " " ) ]
        if a [ i ] in [ 2 , 4 , 8 ] :
            ans += 1
        elif a [ i ] == 5 :
            ans = ans + 2
        elif a [ i ] == 6 :
            ans = ans + 3
    print ( ans )
