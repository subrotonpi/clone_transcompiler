def round1a ( ) :
    import os
    import sys
    import os
    import sys
    import random
    import time
    import sys
    class C :
        def __init__ ( self ) :
            self.caseNo = 0
        def read ( self ) :
            self.cards , self.score , self.turns = self.cards , self.score , self.turns
        def get_acq_card_with_highest_score ( self , cards , hand_size , num ) :
            a = [ ]
            for c in self.cards :
                a.append ( c.score )
            self.num = min ( num , hand_size )
            score = 0
            for i in range ( num ) :
                score += a [ hand_size - i - 1 ]
            return score
        def get_turn_card ( self , cards , num_hand ) :
            for c in self.cards :
                if c.turns :
                    return c
            return None
        def test ( self ) :
            cards = [ ]
            n = random.randint ( 1 , n )
            for c in self.cards :
                c.read ( self )
                cards.append ( c )
            m = random.randint ( 1 , m )
            for i in range ( m ) :
                c = random.choice ( cards )
                cards.append ( c )
            turns = 1
            max_score = 0
            cur_score = 0
            cards_in_hand = n
            while turns and cards_in_hand :
                best_score = get_best_score ( self , cards_in_hand , turns )
                cur_score += c.score
                if best_score > max_score :
                    max_score = best_score
                c = get_turn_card ( self , cards , cards_in_hand )
                if c :
                    turns -= 1
                    cards.remove ( c )
                    cards_in_hand -= 1
                    cur_score += c.score
                    turns += c.turns
                    cards_in_hand += c.cards
            return None
    print ( "Case #{}: {}".format ( self.caseNo , max_score ) )
