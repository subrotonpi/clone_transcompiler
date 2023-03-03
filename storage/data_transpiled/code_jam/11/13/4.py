def import _main
class C ( object ) :
    def __init__ ( self , * args ) :
        Scanner ( ).__init__ ( self )
        T = len ( args )
        for ca in range ( T ) :
            n = len ( args )
            hand = [ ]
            deck = [ ]
            for i in range ( n ) :
                hand.append ( ( self.c , self.s , self.t ) )
            self.c = ic
            self.s , self.t = self.s , self.t
        def __repr__ ( self ) :
            return "Case #%d: %d" % ( self.c , self.s , self.t )
    class Card ( object ) :
        def __init__ ( self , ic , is , it ) :
            self.ic = ic
            self.s , self.t = self.s , self.t
        def __call__ ( self , o ) :
            return self.c , self.s , self.t
        def __repr__ ( self ) :
            return "Case #%d: %d" % ( self.c , self.s , self.t )
    def __init__ ( self ) :
        self.ic = ic
        self.s , self.t = self.s , self.t
    def __repr__ ( self ) :
        return "Case #%d: %d" % ( self.ic , self.s , self.t )
    def __call__ ( self , o ) :
        return "Case #%d: %d" % ( self.ic , self.s , self.t )
    def __call__ ( self , o ) :
        return "Case #%d: %d" % ( self.ic , self.s , self.t )
turns = 1
score = 0
bestscore = 0
while turns > 0 and hand :
    for i in range ( len ( hand ) ) :
        c = hand [ i ]
        if c.t > 0 :
            turns += c.t - 1
            score += c.s
            while c.c > 0 and not deck :
                hand.append ( deck.pop ( ) )
                c.c -= 1
            hand.pop ( i )
        