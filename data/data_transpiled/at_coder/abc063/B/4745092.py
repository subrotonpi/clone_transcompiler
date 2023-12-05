def import _dict_dict
import Scanner
import defaultdict
class Main ( object ) :
    def __init__ ( self ) :
        dict = defaultdict ( int )
        self.ans = ''
    def run ( self ) :
        sc = Scanner ( )
        s = sc.next ( )
        for i in s :
            dict [ i ] += 1
        if len ( dict ) == len ( s ) :
            print ( 'yes' )
        else :
            print ( 'no' )
