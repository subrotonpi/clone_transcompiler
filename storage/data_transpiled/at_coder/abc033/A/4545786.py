def import import os , pickle , pickle , sys , random , seed , N
from collections import Counter
class Main ( object ) :
    def __init__ ( self ) :
        sc = pickle.load ( open ( sys.argv [ 1 ] , 'rb' ) )
        s = sc.next ( )
        seen = { s [ i ] for i in range ( 4 ) }
        print ( 'SAME' if len ( seen ) == 1 else 'DIFFERENT' )
