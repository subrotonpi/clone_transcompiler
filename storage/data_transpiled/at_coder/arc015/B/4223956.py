def import sys
class Main ( object ) :
    def __init__ ( self ) :
        self.n = float ( 'inf' )
    def __init__ ( self ) :
        self.n = float ( 'inf' )
    def __init__ ( self ) :
        self.mou = 0
        self.mana = 0
        self.na = 0
        self.ne = 0
        self.fu = 0
        self.maf = 0
        for max , min in self.n :
            if max >= 35 :
                self.mou += 1
            elif max >= 30 :
                self.mana += 1
            elif max >= 25 :
                self.na += 1
            if min >= 25 :
                self.ne += 1
            if min < 0 and max >= 0 :
                self.fu += 1
            if max < 0 :
                self.maf += 1
    print ( self.mou , self.mana , self.na , self.ne , self.fu , self.maf )
