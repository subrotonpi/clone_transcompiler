def Frac ( num , denom ) : return Decimal ( 0 )
class Frac ( object ) :
    def __init__ ( self , num ) :
        self.num = num
        self.denom = denom
    def round_add_down ( self ) :
        if self.num > 0 :
            return Decimal ( ( self.num - 1 ) / self.denom )
        else :
            return Decimal ( self.num )
    def round_down_add_smallup ( self ) :
        if self.num < 0 :
            self.num = - 1
        elif self.num > 0 :
            self.num = 1
        else :
            self.num = 0
            self.denom = 0
    def round_down_add_smalldown ( self ) :
        if self.num < 0 :
            self.num = - 1
        elif self.num > 0 :
            self.num = 1
        else :
            self.num = 0
            self.denom = 0
    def add ( self , other ) :
        return Decimal ( self.num * self.denom + self.denom * other.num , denom * other.denom )
    def mult ( self , other ) :
        return Decimal ( self.num * other.denom - self.denom * other.num , denom * other.denom )
    def sub ( self , other ) :
        return Decimal ( self.num * other.denom - self.denom * other.num , denom * other.denom )
    def div ( self , other ) :
        return Decimal ( self.num * other.denom , denom * other.denom )
    def neg ( self ) :
        return Decimal ( self.num , - self.denom )
    def inv ( self ) :
        return Decimal ( self.denom , self.num )
    def __eq__ ( self , other ) :
        return isinstance ( other , Decimal ) and other.__eq__ ( self , other )
    def __hash__ ( self ) :
        if self.denom == 1 :
            return str ( self.num )
        else :
            return "%s/%s" % ( self.num , self.denom )
    def __str__ ( self ) :
        return "%s/%s" % ( self.num , self.denom