def import _calsum
class Main ( object ) :
    def __init__ ( self ) :
        self.sc = sys.stdin
        self.N = sys.stdin.readline ( ).strip ( )
        self.flg = [ False ] * ( len ( self.N ) - 1 )
        print ( self.bits ( self.flg [ : self.N ] ) )
    def bits ( self , index , s ) :
        if len ( self.flg ) == index :
            return self.calsum ( self.flg [ index ] )
        else :
            sum = 0
            self.flg [ index ] = True
            sum += self.bits ( self.flg [ index + 1 : ] )
            self.flg [ index ] = False
            sum += self.bits ( self.flg [ index + 1 : ] )
            return sum
    def calsum ( self , s ) :
        sum = 0
        start = 0
        for i , x in enumerate ( self.flg ) :
            if x :
                sum += int ( s [ start : i + 1 ] )
                start = i + 1
        sum += int ( s [ start : ] )
        return sum
return Main
