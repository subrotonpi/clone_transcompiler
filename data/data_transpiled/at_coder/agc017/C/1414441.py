def import _main
class Main ( object ) :
    def __init__ ( self ) :
        self.N = int ( self.N )
        self.M = int ( self.M )
        a = [ ]
        b = [ ]
        c = [ ]
        for i in range ( 1 , N + 1 ) :
            b.append ( i )
        for i in range ( N ) :
            a.append ( _main.get ( i ) )
            b [ a [ i ] ] -= 1
            if b [ a [ i ] ] in c :
                c [ b [ a [ i ] ] ] += 1
        L = 0
        for i in range ( N ) :
            if c [ i ] == 0 : L += 1
        for i in range ( M ) :
            x = _main.get ( i )
            y = _main.get ( i )
            if b [ a [ x - 1 ] ] in c :
                c [ b [ a [ x - 1 ] ] ] -= 1
            if b [ a [ x - 1 ] ] in c and c [ b [ a [ x - 1 ] ] ] == 0 : L += 1
            b [ a [ x - 1 ] ] += 1
            a [ x - 1 ] = y
            b [ y ] -= 1
            if b [ y ] in c and c [ b [ y ] ] == 0 : L -= 1
            if b [ y ] in c :
                c [ b [ y ] ] += 1
            print ( L )
