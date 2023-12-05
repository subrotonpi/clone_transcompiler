def import _main
class Main ( object ) :
    def __init__ ( self ) :
        self.hand = [ ]
        self.initial_deck = [ ]
        self.deck_i = 0
        self.score = 0
        self.y0 = 0
        self.y1 = 0
        self.y2 = 0
        self.n_turns = 1
    def readCard ( self ) :
        s = self.scan.read ( )
        return ( self.c , self.s , self.t )
    def oldCompareTo ( self ) :
        if self.t != self.t :
            return ( self.t , self.c )
        elif self.s != self.s :
            return ( self.s , self.c )
        else :
            return - self.oldCompareTo ( self )
    def toString ( self ) :
        return "[c=%d, t=%d, s=%d]" % ( self.c , self.t , self.s )
    def allCards ( self ) :
        self.allCards.extend ( self.allCards )
        maxX1 = maxX ( self.allCards , 1 )
        maxX2 = maxX ( self.allCards , 2 )
        bestScore = 0
        for x2 in range ( 0 , maxX2 ) :
            for x1 in range ( 0 , maxX1 ) :
                self.hand = _PriorityQueue ( self.initialHand )
                self.deck_i = 0
                self.score = 0
                self.y0 = 0
                self.y1 = 0
                self.y2 = 0
                self.n_turns = 1
                while self.n_turns and not self.hand.empty :
                    top = self.hand.peek ( )
                    if top.t > 0 :
                        self.playCard ( self.hand.pop ( ) )
                    elif top.c == 2 :
                        if self.y2 < x2 :
                            self.playCard ( self.hand.pop ( ) )
                            self.y2 += 1
                        else :
                            self.hand.pop ( )
                    elif top.c == 1 :
                        if self.y1 < x1 :
                            self.playCard ( self.hand.pop ( ) )
                            self.y1 += 1
                        else :
                            self.hand.pop ( )