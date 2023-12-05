def import _input
class Main ( object ) :
    def __init__ ( self ) :
        self.y = int ( self.y )
        self.m = int ( self.m )
        self.d = int ( self.d )
    def input ( self ) :
        return _input ( self )
    Y = 2014
    M = 5
    D = 17
    if m == 1 :
        y = y - 1
        m = 13
    if m == 2 :
        y = y - 1
        m = 14
    diff_from = 365 * y + y / 4 - y / 100 + y / 400 + 306 * ( m + 1 ) / 10 + d - 429
    diff_to = 365 * Y + Y / 4 - Y / 100 + Y / 400 + 306 * ( M + 1 ) / 10 + D - 429
    print ( diff_to - diff_from )
