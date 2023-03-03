def import sys
class Main ( object ) :
    def __init__ ( self ) :
        self.sc = sys.stdin
        s = self.sc.read ( ).decode ( 'utf-8' )
        d = [ 0 ] * 26
        for c in s :
            c = ord ( c ) - ord ( 'a' )
            d [ c ] += 1
    odd = 0
    eve = 0
    for t in d :
        if t :
            eve += t // 2
            odd += t % 2
    if odd :
        print ( eve / odd * 2 + 1 )
    else :
        print ( len ( s ) )
