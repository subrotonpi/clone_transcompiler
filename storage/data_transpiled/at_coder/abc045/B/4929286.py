def import sys
class Main ( object ) :
    def __init__ ( self ) :
        sc = sys.stdin
        turn = 0
        turntmp = 0
        cards = [ sc.readline ( ) for i in range ( 3 ) ]
        outputs = [ 'A' , 'B' , 'C' ]
        while True :
            if len ( cards [ turn ] ) == 0 :
                print ( outputs [ turn ] )
                return
            turntmp = turn
            turn = ord ( cards [ turn ] [ 0 ] ) - 97
            cards [ turntmp ] = cards [ turntmp ] [ 1 : len ( cards [ turntmp ] ) ]
