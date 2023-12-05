def import sys
class Main ( object ) :
    def __init__ ( self ) :
        sc = sys.stdin
        po = sc.readline ( ) [ : 12 ]
        if po == 'WBWBWWBWBWBW' :
            print ( 'Do' )
        elif po == 'WBWWBWBWBWBWWB' :
            print ( 'Re' )
        elif po == 'WWBWBWBWBWBWBWB' :
            print ( 'Si' )
        elif po == 'WWBWBWBWBWBWBWB' :
            print ( 'Mi' )
        elif po == 'WBWBWBWBWBWBW' :
            print ( 'Fa' )
        elif po == 'WBWBWBWBWBWBWBWWB' :
            print ( 'So' )
        elif po == 'WBWWBWBWBWBWBWB' :
            print ( 'La' )
