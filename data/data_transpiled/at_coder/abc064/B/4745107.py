def import _dict_dict
import Scanner
import defaultdict
class Main ( dict ) :
    def __init__ ( self ) :
        dict = defaultdict ( dict )
        self.ans = ''
    def run ( self ) :
        sc = Scanner ( )
        a = sc.next ( )
        min = 1001
        max = - 1
        for i in range ( a ) :
            b = sc.next ( )
            min = min ( min , b )
            max = max ( max , b )
        print ( max - min )
