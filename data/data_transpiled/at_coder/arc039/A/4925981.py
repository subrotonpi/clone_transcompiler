def import _intlist
class Main ( ) :
    def __init__ ( self , * args , ** kwargs ) :
        s = raw_input ( )
        a , b = s.split ( )
        _intlist = [ a % 100 + 900 - b , a - b % 100 - 100 , a / 100 * 100 + a % 10 + 90 - b , a - b / 100 * 100 - b % 10 , a / 10 * 10 + 9 - b , a - b / 10 * 10 ]
        self.max = _intlist
