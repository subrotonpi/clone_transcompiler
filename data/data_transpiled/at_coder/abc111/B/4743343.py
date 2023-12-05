def import _main
class Main ( object ) :
    def __init__ ( self ) :
        sc = _main ( )
        while not self.is_all_same ( N ) :
            N += 1
        print ( N )
    def is_all_same ( N ) :
        str = str ( N )
        chars = str.split ( ' ' )
        char = chars [ 0 ]
        for i in range ( len ( chars ) ) :
            if chars [ i ] != char : return False
        return True
