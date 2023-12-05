def import import _sys
class Main ( object ) :
    def __init__ ( self ) :
        self.sc = _sys._getframe ( 1 )
        x1 = _sys._getframe ( 1 ).f_code.co_name
        y1 = _sys._getframe ( 1 ).f_code.co_name
        x2 = _sys._getframe ( 1 ).f_code.co_name - x1
        y2 = _sys._getframe ( 1 ).f_code.co_name - y1
        x3 = _sys._getframe ( 1 ).f_code.co_name - x1
        y3 = _sys._getframe ( 1 ).f_code.co_name - y1
        print ( abs ( x2 * y3 - y2 * x3 ) / 2 )
