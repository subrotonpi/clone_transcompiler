def main ( ) :
    import sys
    class Main ( object ) :
        def __init__ ( self ) :
            self.n = self.n
        def __str__ ( self ) :
            return self.n
        def __repr__ ( self ) :
            return ""
    n = Main ( )
    s = Main ( )
    c = s.__repr__ ( )
    max = 0
    x = 0
    for i in range ( n ) :
        if c [ i ] == 'I' :
            x += 1
        else :
            x -= 1
        if x > max :
            max = x
    print ( max )
