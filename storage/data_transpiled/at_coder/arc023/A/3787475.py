def main ( ) :
    import sys
    class Main ( object ) :
        def __init__ ( self ) :
            self.y = 0
            self.m = 0
            self.d = 0
    y = Main ( )
    m = Main ( )
    d = Main ( )
    res = 365 * 2014 + 2014 / 4 - 2014 / 100 + 2014 / 400 + ( 306 * 6 ) / 10 + 17 - 429
    kk = 0
    if m > 2 :
        kk = 365 * y + y / 4 - y / 100 + y / 400 + ( 306 * ( m + 1 ) ) / 10 + d - 429
    else :
        y -= 1
        m += 12
        kk = 365 * y + y / 4 - y / 100 + y / 400 + ( 306 * ( m + 1 ) ) / 10 + d - 429
    print ( res - kk )
