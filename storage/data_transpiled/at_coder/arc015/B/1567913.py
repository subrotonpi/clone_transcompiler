def import _sys
class Main ( object ) :
    def __init__ ( self ) :
        self.n = 0
        self.max_t = [ ]
        self.min_t = [ ]
        self.count1 , self.count2 , self.count3 , self.count4 , self.count5 , self.count6 = 0
    def input ( self ) :
        with open ( self.filename , 'r' ) as f :
            self.n = f.read ( )
        for i in range ( self.n ) :
            self.max_t.append ( f.read ( ) )
            self.min_t.append ( f.read ( ) )
    def main ( self ) :
        self.input ( )
        for max in self.max_t :
            if max >= 35 :
                self.count1 += 1
            elif max >= 30 :
                self.count2 += 1
            elif max >= 25 :
                self.count3 += 1
            elif max < 0 :
                self.count6 += 1
            min = self.min_t [ min ]
            if min >= 25 :
                self.count4 += 1
            elif min < 0 and max >= 0 :
                self.count5 += 1
        print ( self.count1 , self.count2 , self.count3 , self.count4 , self.count5 , self.count6 )
