def import import sys
class Main ( object ) :
    def __init__ ( self ) :
        self.ax = sys._getframe ( 1 ).f_code.co_name
        self.ay = sys._getframe ( 1 ).f_code.co_name
        self.bx = sys._getframe ( 1 ).f_code.co_name
        self.by = sys._getframe ( 1 ).f_code.co_name
        self.cx = sys._getframe ( 1 ).f_code.co_name
        self.cy = sys._getframe ( 1 ).f_code.co_name
        self.a = self.bx - self.ax
        self.b = self.by - self.ay
        self.c = self.cx - self.ax
        self.d = self.cy - self.ay
        print ( float ( abs ( a * d - b * c ) / 2 ) )
