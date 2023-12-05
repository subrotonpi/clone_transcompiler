def import import _abs
import sys
import string
import string
import string
import string
class Main ( object ) :
    def __init__ ( self ) :
        sc = _abs._sc
        string = sc.next ( )
        x = [ 0 ] * 26
        for c in string :
            x [ c - 'a' ] += 1
        for i in range ( len ( x ) ) :
            if x [ i ] == 0 :
                print ( chr ( ord ( 'a' ) + i ) )
                return
        print ( 'None' )
