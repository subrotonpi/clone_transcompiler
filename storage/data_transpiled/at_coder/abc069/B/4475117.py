def import _Scanner
class Main ( object ) :
    def __init__ ( self ) :
        sc = _Scanner ( )
        str = sc.next ( )
        str = str.replace ( '\n' , '' )
        mid_len = len ( str ) - 2
        print ( str [ 0 ] + mid_len + str [ - 1 ] , end = ' ' )
