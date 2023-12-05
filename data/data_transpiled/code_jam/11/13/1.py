def import _rectify
class C ( object ) :
    def __init__ ( self , * arg , ** kwargs ) :
        self.H = { }
        self.list = [ ]
        self.signatures = [ ]
        self.flag2 = True
    def main ( self , * arg , ** kwargs ) :
        with open ( self.args [ 0 ] ) as sc :
            self.c , self.t = int ( sc.read ( ) )
    def recurse ( self , * arg , ** kwargs ) :
        return ( self.c or self.s ) - self.c
    def recurse ( self , * args , ** kwargs ) :
        return ( self.c , self.t ) - self.s
    def recurse ( self , * args , ** kwargs ) :
        return ( self.c , self.t ) - self.s
    def recurse ( self , * args , ** kwargs ) :
        return ( self.c , self.t ) - self.s
    def recurse ( self , * args , ** kwargs ) :
        if not self.turns or len ( self.Hand ) == 0 : return 0
        for ( Ic , _ ) in self.Hand :
            score = 0
            Hand2 = [ ]
            flag = False
            while Ic :
                if self.c.t > 0 :
                    Ic.pop ( )
                    score += self.c.s
                    turns += self.c.t
                    self.turns -= 1
                    while self.Deck and self.c > 0 :
                        Hand2.append ( self.Deck.pop ( ) )
                        self.c -= 1
                    flag = True
            if flag :
                self.Hand.extend ( Hand2 )
                return score + recurse ( self , * args , ** kwargs )
    self.recurse = recurse
    self.sort ( )
    best = 0
    for i in range ( self.turns ) : best += self.Hand [ i ].s
    self.flag2 = False
    self.sort ( )
    return best
