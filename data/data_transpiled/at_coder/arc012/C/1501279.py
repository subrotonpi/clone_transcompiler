def import _main
class Main ( object ) :
    def __init__ ( self ) :
        self.N = 19
    def main ( self , y , x ) :
        sc = _main.raw_input ( )
        cin = _main.raw_input ( )
        self.board = [ ]
        ocount = 0
        xcount = 0
        for i in range ( self.N ) :
            st = cin.next ( )
            for j in range ( self.N ) :
                if st [ j ] == 'o' :
                    self.board [ i ].append ( 1 )
                    ocount += 1
                if st [ j ] == 'x' :
                    self.board [ i ].append ( 2 )
                    xcount += 1
        prev = 0
        if ocount - 1 == xcount :
            prev = 1
        if ocount == xcount :
            prev = 2
        if prev == 0 :
            print ( 'NO' )
            return
        if ocount == 0 :
            print ( 'YES' )
            return
        for i in range ( self.N ) :
            for j in range ( self.N ) :
                if self.board [ i ] [ j ] == prev :
                    self.board [ i ] [ j ] = 0
                    if self.checkboard ( ) :
                        print ( 'YES' )
                        return
                    self.board [ i ] [ j ] = prev
        print ( 'NO' )
    def checkboard ( self ) :
        self.vy = ( 1 , 1 , 1 , 0 , 0 , - 1 , - 1 , - 1 )
        self.vx = ( 1 , 0 , - 1 , 1 , - 1 , 1 , 0 , - 1 )
        for i in range ( self.N ) :
            for j in range ( self.N ) :
                if self.board [ i ] [ j ] != 0 :
                    now = self.board [ i ] [ j ]
                    for k in range ( 8 ) :
                        flag = True
                        for l in range ( 5 ) :
                            y = i + self.vy [ k ] * l
                            x = j + self.vx [ k ] * l
                            if not self.ok ( y , x ) or self.board [ y ] [