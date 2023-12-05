def import import _scanner
class Main ( Scanner ) :
    def __init__ ( self ) :
        sc = _scanner ( )
        x = sc.scanner.next ( )
        y = sc.scanner.next ( )
        k = sc.scanner.next ( )
        sum = x + y
        ret = None
        if y < k :
            ret = sum - ( k - y )
        else :
            ret = x + k
        print ( ret )
