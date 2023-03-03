def main ( ) :
    import sys
    class Main ( object ) :
        @ staticmethod
        def __init__ ( self ) :
            self.w , self.h , self.n = sys.argv [ 1 ] , sys.argv [ 2 ] , sys.argv [ 3 ]
        def __getattr__ ( self , x ) :
            return self.w
        def __getitem__ ( self , x ) :
            return self.w
        def __getitem__ ( self , x ) :
            return self.h
        def __getitem__ ( self , x ) :
            return self.n
    xn = [ ]
    yn = [ ]
    an = [ ]
    for i in range ( n ) :
        xn.append ( i )
        yn.append ( i )
        an.append ( i )
    wl = wr = w
    hl = ht = h
    for i in range ( n ) :
        if an [ i ] == 1 :
            if wl < xn [ i ] :
                wl = xn [ i ]
        elif an [ i ] == 2 :
            if wr > xn [ i ] :
                wr = xn [ i ]
        elif an [ i ] == 3 :
            if hl < yn [ i ] :
                hl = yn [ i ]
        elif an [ i ] == 4 :
            if ht > yn [ i ] :
                ht = yn [ i ]
    if wr - wl < 0 or ht - hl < 0 :
        print ( 0 )
    else :
        print ( ( wr - wl ) * ( ht - hl ) )
