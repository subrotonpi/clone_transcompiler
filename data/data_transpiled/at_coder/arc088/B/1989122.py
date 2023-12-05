def main ( ) :
    import sys
    class Main ( object ) :
        def __init__ ( self ) :
            self.s = sys.stdin.read ( )
            self.ans = 0
            if len ( self.s ) % 2 == 0 :
                if self.s [ len ( self.s ) / 2 - 1 ] != self.s [ len ( self.s ) / 2 ] :
                    print ( len ( self.s ) / 2 )
                    return
                else :
                    self.s = self.s [ : len ( self.s ) / 2 ] + self.s [ len ( self.s ) / 2 + 1 : ]
                    self.ans = 1
    center = len ( self.s ) / 2
    for i in range ( 1 , len ( self.s ) + 1 ) :
        if i + center == len ( self.s ) or self.s [ center + i ] != self.s [ center ] or self.s [ center - i ] != self.s [ center ] :
            self.ans += center + i
            break
    print ( self.ans )
