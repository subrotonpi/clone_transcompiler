def main ( ) :
    import sys
    class Main ( object ) :
        def __init__ ( self ) :
            self.n = int ( self.n )
            self.h = self.h
            self.a = [ ]
            self.b = [ ]
            for i in range ( self.n ) :
                self.a.append ( self.a [ i ] )
                self.b.append ( self.b [ i ] )
    ans = 0
    dame = 0
    a = [ x for x in a if x > 0 ]
    b = [ x for x in b if x > 0 ]
    for i in range ( n - 1 , - 1 , - 1 ) :
        if b [ i ] > a [ n - 1 ] :
            ans += 1
            dame += b [ i ]
        else :
            break
    ans += int ( ( h - dame ) / a [ n - 1 ] ) + ( ( h - dame ) % a [ n - 1 ] or 0 )
    sys.stdout.write ( ans )
