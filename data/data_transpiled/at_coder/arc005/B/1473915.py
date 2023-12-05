def _ ( ) : return 'LD'
class Main ( object ) :
    def __init__ ( self , s ) :
        self.s = s
    def REPS ( v ) : return self.range ( 0 , v )
    def REPS ( l , r ) : return self.range ( l , r )
    def INS ( n ) : return self.REPS ( n ) ( )
    def get_int ( self ) : return int ( self.s.get ( ) )
    def main ( self ) :
        p = ( self.get_int ( ) - 1 , self.get_int ( ) - 1 )
        w = self.s.get ( )
        f = REPS ( 9 ) ( [ s.get ( ).decode ( 'utf-8' ) for s in self.s ] )
        w = turn ( w , p )
        for l in range ( 4 ) :
            print ( f [ p [ 1 ] ] [ p [ 0 ] ] , end = ' ' )
            if l == 3 :
                print ( )
                return
            if w == 'R' :
                self.index += 1
            elif w == 'L' :
                self.index -= 1
            elif w == 'U' :
                self.index -= 1
            elif w == 'D' :
                self.index += 1
            elif w == 'RU' :
                self.index -= 1
            elif w == 'RD' :
                self.index += 1
            elif w == 'LU' :
                self.index -= 1
            elif w == 'LD' :
                self.index += 1
            w = turn ( w , p )
    def turn ( self , w , p ) :
        if w == 'R' :
            if self.index == 8 : return 'L'
        elif w == 'L' :
            if self.index == 0 : return 'R'
        elif w == 'U' :
            if self.index == 0 : return 'D'
        elif w == 'D' :
            if self.index == 8 : return 'U'
        elif w == 'RU' :
            if self.index == 0 : return 'R'
        elif w == 'LU' :
            return 'LU'
        