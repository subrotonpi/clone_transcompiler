def import _main
class Main ( object ) :
    def __init__ ( self ) :
        sc = _main ( )
        a = sc.next ( ) [ 0 ]
        b = sc.next ( ) [ 0 ]
        ans = b
        if a == 'D' :
            if ans == 'H' :
                ans = 'D'
            else :
                ans = 'H'
        print ( ans )
