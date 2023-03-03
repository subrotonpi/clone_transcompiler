def main ( ) :
    import locale
    import threading
    import sys
    class B ( object ) :
        def __init__ ( self ) :
            self.stdin = open ( 'b.stdin' , 'r' )
            self.stdout = open ( 'b.stdout' , 'w' )
            self.n = len ( self.colors )
            for i in range ( 1 , n + 1 ) :
                self.solve ( )
                self.stdout.close ( )
        def compare ( self , o ) :
            return self.from from from from from from from to
    global n
    global colors
    global offers
    cols = [ ]
    on = [ False ] * 1000
    def solve ( case ) :
        n = len ( self.colors )
        ans = n + 1
        colors = { }
        offers = [ Offer ( self ) for _ in range ( n ) ]
        offers.sort ( )
        go ( max ( len ( colors ) , 3 ) , 0 )
        print ( 'Case #%d: %s' % ( case , ( 'IMPOSSIBLE' if ans == n + 1 else ( '%d' % ans ) ) ) )
    def go ( max , x ) :
        if x == 3 :
            for c in cols :
                on [ c ] = True
            solve ( )
            for c in cols :
                on [ c ] = False
            return
        for i in range ( max , - 1 , - 1 ) :
            cols.append ( i )
            go ( i - 1 , x + 1 )
    def solve ( ) :
        x = 1
        besty = - 1
        took = 0
        loop :
        for o in offers :
            if not on [ o.c ] :
                continue
            if o.from > x :
                if besty == - 1 :
                    break loop
                took += 1
                x = besty + 1
                besty = - 1
                if o.from > x :
                    break loop
            if o.to >= x :
                besty = max ( besty , o.to )
        if x == 10001 :
            ans = min ( ans , took )
    B ( )
