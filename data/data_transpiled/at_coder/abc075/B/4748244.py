def main ( ) :
    from sys import stdin
    class Main ( object ) :
        def __init__ ( self ) :
            self.main = Main ( )
            with stdin :
                self.solve ( )
        def solve ( self , sc ) :
            H , W = self.H , self.W
            S = [ ]
            T = [ ]
            for l in stdin :
                S.append ( l.split ( ) )
            for h , line in enumerate ( S ) :
                for w , line in enumerate ( line ) :
                    if line [ w ] == '#' :
                        T [ h ].append ( line [ w ] )
                    else :
                        T [ h ].append ( str ( calc ( S , h , w , H , W ) ) )
                    print ( T [ h ].append ( line ) , end = ' ' )
                print ( )
    def calc ( S , h , w , H , W ) :
        cnt = 0
        if h >= 1 and w >= 1 and S [ h - 1 ] [ w - 1 ] == '#' :
            cnt += 1
        if h >= 1 and S [ h - 1 ] [ w ] == '#' :
            cnt += 1
        if w >= 1 and S [ h - 1 ] [ w ] == '#' :
            cnt += 1
        if w >= 1 and S [ h ] [ w + 1 ] == '#' :
            cnt += 1
        if w >= 1 and S [ h ] [ w - 1 ] == '#' :
            cnt += 1
        if w < H - 1 and w >= 1 and S [ h + 1 ] [ w - 1 ] == '#' :
            cnt += 1
        if h < H - 1 and w < W - 1 and S [ h + 1 ] [ w + 1 ] == '#' :
            cnt += 1
        return cnt
    return Main
