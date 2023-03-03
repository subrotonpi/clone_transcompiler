def import _Scanner
class Main ( object ) :
    def __init__ ( self , s ) :
        self.s = s
    def g_int ( self ) :
        return int ( self.s )
    def main ( self , * args , ** kwargs ) :
        l , x , y , s , d = self.g_int ( * args , ** kwargs )
        sl , sr = y + x , y - x
        dl = d - s if d > s else d + l - s
        dr = l - dl
        tl = dl * 1.0 / sl
        tr = 1145141919 if sr <= 0 else dr * 1.0 / sr
        print ( min ( tl , tr ) )
