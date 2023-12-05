def import sys
class Main ( object ) :
    def __init__ ( self ) :
        self.sc = sys.stdin
        self.N = self.N
        self.W = self.W
        s = [ ]
        for row in self.sc :
            cols = row.split ( '' )
            for col in cols :
                s.append ( col )
        t = [ ]
        dx = ( 0 , 1 , 0 , - 1 , 1 , 1 , - 1 , - 1 )
        dy = ( 1 , 0 , - 1 , 0 , 1 , - 1 , 1 , - 1 )
        for i in range ( self.N ) :
            for j in range ( self.W ) :
                if '#' == s [ i ] [ j ] :
                    t.append ( '#' )
                else :
                    cnt = 0
                    for d in range ( 8 ) :
                        posx = i + dx [ d ]
                        posy = j + dy [ d ]
                        if 0 <= posx < N and 0 <= posy < W :
                            if '#' == s [ posx ] [ posy ] :
                                cnt += 1
                    t.append ( str ( cnt ) )
    for i in range ( self.N ) :
        s = ''
        for j in range ( self.W ) :
            s += t [ i ] [ j ]
        print ( s )
